public class MyHashMap<K, V> extends MyMap<K, V> {
    private static final int INITIAL_CAPACITY = 4;
    private static final double LOAD_FACTOR_THRESHOLD = 0.5;

    private Entry<K, V>[] table;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        table = new Entry[INITIAL_CAPACITY];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    }

    private void rehash() {
        Entry<K, V>[] oldTable = table;
        table = new Entry[oldTable.length * 2];
        size = 0;

        for (Entry<K, V> entry : oldTable) {
            if (entry != null && !entry.removed) {
                put(entry.key, entry.value);
            }
        }
    }

    @Override
    public void put(K key, V value) {
        if ((double)(size + 1) / table.length > LOAD_FACTOR_THRESHOLD) {
            rehash();
        }

        int index = hash(key);
        while (table[index] != null && !table[index].removed && !table[index].key.equals(key)) {
            index = (index + 1) % table.length;
        }

        if (table[index] == null || table[index].removed) {
            size++;
        }

        table[index] = new Entry<>(key, value);
    }

    @Override
    public V get(K key) {
        int index = hash(key);
        int startIndex = index;

        while (table[index] != null) {
            if (!table[index].removed && table[index].key.equals(key)) {
                return table[index].value;
            }
            index = (index + 1) % table.length;
            if (index == startIndex) break;
        }

        return null;
    }

    @Override
    public void remove(K key) {
        int index = hash(key);
        int startIndex = index;

        while (table[index] != null) {
            if (!table[index].removed && table[index].key.equals(key)) {
                table[index].removed = true;
                size--;
                return;
            }
            index = (index + 1) % table.length;
            if (index == startIndex) break;
        }
    }

    @Override
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = new java.util.HashSet<>();
        for (Entry<K, V> entry : table) {
            if (entry != null && !entry.removed) {
                set.add(entry.key);
            }
        }
        return set;
    }

    private static class Entry<K, V> {
        K key;
        V value;
        boolean removed = false;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
