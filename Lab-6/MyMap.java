public abstract class MyMap<K, V> {
    public abstract void put(K key, V value);
    public abstract V get(K key);
    public abstract void remove(K key);
    public abstract boolean containsKey(K key);
    public abstract java.util.Set<K> keySet();
}
