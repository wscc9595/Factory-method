package chocolatefactory;

/**
 * A large chocolate object.
 */
public class LargeChocolate extends AbstractChocolate {

  /**
   * Creates a new large chocolate with the specified weight.
   *
   * @param weight the weight of the large chocolate
   */
  public LargeChocolate(int weight) {
    super(weight);
  }

  @Override
  public String chocolateSize() {
    return "Large Chocolate";
  }
}