package chocolatefactory;

/**
 * An abstract class representing a chocolate with a weight.
 */
public abstract class AbstractChocolate implements ChocolateInterface {
  private int weight;

  /**
   * Creates a new chocolate with the specified weight.
   *
   * @param weight the weight of the chocolate
   */
  public AbstractChocolate(int weight) {
    this.weight = weight;
  }

  /**
   * Getter that returns the assigned weight.
   *
   * @return weight the weight of the chocolate
   */
  public int getWeight() {
    return weight;
  }
}