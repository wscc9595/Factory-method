package chocolatefactory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The type Small chocolate test.
 */
public class SmallChocolateTest {
  private AbstractChocolate smallChocolate;

  /**
   * Sets up.
   */
  @Before
  public void setUp() {
    ChocolateFactory factory = new ChocolateFactoryBySize();
    smallChocolate = factory.createChocolate("small");
  }

  /**
   * Gets class name.
   */
  @Test
  public void getClassName() {
    assertEquals("Small Chocolate", smallChocolate.chocolateSize());
  }

  /**
   * Gets weight.
   */
  @Test
  public void getWeight() {
    int weight = smallChocolate.getWeight();
    assertEquals(true, weight >= 50 && weight <= 100);
  }
}