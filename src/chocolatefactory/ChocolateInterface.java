package chocolatefactory;

/**
 * The interface for individual Chocolate objects.
 */
public interface ChocolateInterface {
  /**
   * Retrieves the size of the chocolate as a string.
   *
   * @return the size of the chocolate
   */
  String chocolateSize();

  /**
   * Retrieves the weight of the chocolate.
   *
   * @return the weight of the chocolate
   */
  int getWeight();
}