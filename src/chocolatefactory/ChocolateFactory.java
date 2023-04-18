package chocolatefactory;

/**
 * The interface for a Chocolate factory.
 */
public interface ChocolateFactory {
  /**
   * Creates a chocolate object of the specified size.
   *
   * @param size the desired size of the chocolate
   * @return the created chocolate object
   */
  AbstractChocolate createChocolate(String size);
}