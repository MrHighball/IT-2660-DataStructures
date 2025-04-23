class Main {
  public static void main(String[] args) {
    String[] vertices = {
      "Liberal Arts",               // 0
      "Student Services",           // 1
      "Health Careers & Sciences",  // 2
      "Health Technologies Center", // 3
      "Recreation Center",          // 4
      "Technology Learning Center", // 5
      "Business & Technology",      // 6
      "Theatre"                     // 7
    };

    int[][] edges = {
      {0, 1}, // Liberal Arts <-> Student Services
      {1, 2}, // Student Services <-> Health Careers & Sciences
      {2, 3}, // Health Careers & Sciences <-> Health Technologies Center
      {1, 4}, // Student Services <-> Recreation Center
      {4, 5}, // Recreation Center <-> Technology Learning Center
      {5, 6}, // Technology Learning Center <-> Business & Technology
      {6, 7}, // Business & Technology <-> Theatre
      {1, 5}, // Student Services <-> Technology Learning Center 
      {0, 7}  // Liberal Arts <-> Theatre 
    };
    
    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology")); // Get a dfs starting at the Business and Technology Building. Change this is you called it something different in your vertices!

    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
    System.out.println();

    for (int i = 0; i < searchOrders.size(); i++)
      if (dfs.getParent(i) != -1)
        System.out.println("parent of " + graph.getVertex(i) +
          " is " + graph.getVertex(dfs.getParent(i)));
    
  dfs.printPath(graph.getIndex("Health Technologies Center"));
  dfs.printPath(graph.getIndex("Student Services"));
  dfs.printPath(graph.getIndex("Recreation Center"));
  
  dfs.printTree();

  }
}