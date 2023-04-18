package chocolatefactory;

/**
 * A medium chocolate object.
 */
public class MediumChocolate extends AbstractChocolate {

  /**
   * Creates a new medium chocolate with the specified weight.
   *
   * @param weight the weight of the medium chocolate
   */
  public MediumChocolate(int weight) {
    super(weight);
  }

  @Override
  public String chocolateSize() {
    return "Medium Chocolate";
  }
}