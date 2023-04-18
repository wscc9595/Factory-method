package chocolatefactory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The type Small chocolate test.
 */
public class SmallChocolateTest {
  private Chocolate smallChocolate;

  /**
   * Sets up.
   */
  @Before
  public void setUp() {
    ChocolateFactory factory = new ChocolateFactoryBySize();
    smallChocolate = factory.createChocolate("small");
  }

  /**
   * Test chocolateSize.
   */
  @Test
  public void testChocolateSize() {
    assertEquals("Small Chocolate", smallChocolate.chocolateSize());
  }

  /**
   * Test getWeight.
   */
  @Test
  public void testGetWeight() {
    int weight = smallChocolate.getWeight();
    assertEquals(true, weight >= 50 && weight <= 100);
  }
}