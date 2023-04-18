package chocolatefactory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The type Medium chocolate test.
 */
public class MediumChocolateTest {
  private Chocolate mediumChocolate;

  /**
   * Sets up.
   */
  @Before
  public void setUp() {
    ChocolateFactory factory = new ChocolateFactoryBySize();
    mediumChocolate = factory.createChocolate("medium");
  }

  /**
   * Test chocolateSize.
   */
  @Test
  public void testChocolateSize() {
    assertEquals("Medium Chocolate", mediumChocolate.chocolateSize());
  }

  /**
   * Test getWeight.
   */
  @Test
  public void testGetWeight() {
    int weight = mediumChocolate.getWeight();
    assertEquals(true, weight >= 150 && weight <= 300);
  }
}
