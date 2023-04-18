package chocolatefactory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The type Large chocolate test.
 */
public class LargeChocolateTest {
  private AbstractChocolate largeChocolate;

  /**
   * Sets up.
   */
  @Before
  public void setUp() {
    ChocolateFactory factory = new ChocolateFactoryBySize();
    largeChocolate = factory.createChocolate("large");
  }

  /**
   * Test get class name.
   */
  @Test
  public void testGetClassName() {
    assertEquals("Large Chocolate", largeChocolate.chocolateSize());
  }

  /**
   * Test get weight.
   */
  @Test
  public void testGetWeight() {
    int weight = largeChocolate.getWeight();
    assertEquals(true, weight >= 500 && weight <= 1000);
  }
}
