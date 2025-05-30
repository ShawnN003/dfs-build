import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Build {

  /**
   * Prints words that are reachable from the given vertex and are strictly shorter than k characters.
   * If the vertex is null or no reachable words meet the criteria, prints nothing.
   *
   * @param vertex the starting vertex
   * @param k the maximum word length (exclusive)
   */
  public static void printShortWords(Vertex<String> vertex, int k) {
    Set<String> set = new HashSet<>();
    printShortWords(vertex, k, set);
  }

  public static void printShortWords(Vertex<String> vertex, int k, Set<String> set) {
    if(vertex == null || set.contains(vertex.data))
    {
      return;
    }
    set.add(vertex.data);
    if(vertex.data.length() < k)
    {
      System.out.println(vertex.data);
    }

    for(Vertex<String> neighbor : vertex.neighbors)
    {
      printShortWords(neighbor, k, set);
    }

  }
  /**
   * Returns the longest word reachable from the given vertex, including its own value.
   *
   * @param vertex the starting vertex
   * @return the longest reachable word, or an empty string if the vertex is null
   */
  public static String longestWord(Vertex<String> vertex) {
    Set<String> set = new HashSet<>();
    
    return longestWord(vertex, set,"");
  }

  public static String longestWord(Vertex<String> vertex, Set<String> set,String max) {
    if(set.contains(vertex.data) || vertex == null)
    {
      return "";
    }
    set.add(vertex.data);
    if(vertex.data.length() > max.length())
    {
     max = vertex.data;
    }
    for(Vertex<String> neighbor : vertex.neighbors)
    {
      String neighborMax = longestWord(neighbor, set, max);
      if(neighborMax.length() > max.length())
      {
        max = neighborMax;
      }
    }
    return max;
  }


  /**
   * Prints the values of all vertices that are reachable from the given vertex and 
   * have themself as a neighbor.
   *
   * @param vertex the starting vertex
   * @param <T> the type of values stored in the vertices
   */
  public static <T> void printSelfLoopers(Vertex<T> vertex) {
    Set<T> set = new HashSet<>();
    printSelfLoopers(vertex, set);
  }

  public static <T> void printSelfLoopers(Vertex<T> vertex, Set<T> set) {
    if(set.contains(vertex.data))
    {
      System.out.println(vertex.data);
    }

    if(vertex == null || set.contains(vertex.data))
    {
      return;
    }
    set.add(vertex.data);

    for(Vertex<T> neighbor : vertex.neighbors)
    {
      printSelfLoopers(neighbor, set);
    }
  }

  /**
   * Determines whether it is possible to reach the destination airport through a series of flights
   * starting from the given airport. If the start and destination airports are the same, returns true.
   *
   * @param start the starting airport
   * @param destination the destination airport
   * @return true if the destination is reachable from the start, false otherwise
   */
  public static boolean canReach(Airport start, Airport destination) {
    return false;
  }

  public static boolean canReach(Airport start, Airport destination, Set<) {
    return false;
  }

  /**
   * Returns the set of all values in the graph that cannot be reached from the given starting value.
   * The graph is represented as a map where each vertex is associated with a list of its neighboring values.
   *
   * @param graph the graph represented as a map of vertices to neighbors
   * @param starting the starting value
   * @param <T> the type of values stored in the graph
   * @return a set of values that cannot be reached from the starting value
   */
  public static <T> Set<T> unreachable(Map<T, List<T>> graph, T starting) {
    return new HashSet<>();
  }
}
