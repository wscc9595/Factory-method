package chocolatefactory;

/**
 * A small chocolate object.
 */
public class SmallChocolate extends AbstractChocolate {

  /**
   * Creates a new small chocolate with the specified weight.
   *
   * @param weight the weight of the small chocolate
   */
  public SmallChocolate(int weight) {
    super(weight);
  }

  @Override
  public String chocolateSize() {
    return "Small Chocolate";
  }
}
