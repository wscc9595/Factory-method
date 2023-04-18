package chocolatefactory;

import org.junit.Test;

/**
 * The type Illegal chocolate test.
 */
public class IllegalChocolateTest {
  /**
   * Test illegal chocolate.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalChocolate() {
    ChocolateFactory factory = new ChocolateFactoryBySize();
    Chocolate chocolate = factory.createChocolate("INVALID");
  }
}
