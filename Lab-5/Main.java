class Main {
  public static void main(String[] args) {
    BST lab5Tree = new BST();
    int[] values = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};
    for (int val : values) lab5Tree.insert(val);
    
    lab5Tree.delete(17);
    
    System.out.print("Inorder traversal: ");
    lab5Tree.inorder();

    System.out.print("Postorder traversal: ");
    lab5Tree.postorder();
    
    System.out.print("Preorder traversal: ");
    lab5Tree.preorder();

    System.out.println("Search 36: " + lab5Tree.search(36));
    System.out.println("Search 37: " + lab5Tree.search(37));

    System.out.print("Path to 2: ");
    lab5Tree.path(2);
    
    System.out.print("Path to 34: ");
    lab5Tree.path(34);
}
  }
