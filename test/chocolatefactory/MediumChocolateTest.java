package chocolatefactory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The type Medium chocolate test.
 */
public class MediumChocolateTest {
  private AbstractChocolate mediumChocolate;

  /**
   * Sets up.
   */
  @Before
  public void setUp() {
    ChocolateFactory factory = new ChocolateFactoryBySize();
    mediumChocolate = factory.createChocolate("medium");
  }

  /**
   * Gets class name.
   */
  @Test
  public void getClassName() {
    assertEquals("Medium Chocolate", mediumChocolate.chocolateSize());
  }

  /**
   * Gets weight.
   */
  @Test
  public void getWeight() {
    int weight = mediumChocolate.getWeight();
    assertEquals(true, weight >= 150 && weight <= 300);
  }
}
