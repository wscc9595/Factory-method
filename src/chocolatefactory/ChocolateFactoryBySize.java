package chocolatefactory;

import java.util.Random;

/**
 * A Chocolate factory implementation that creates chocolates based on size.
 */
public class ChocolateFactoryBySize implements ChocolateFactory {

  @Override
  public AbstractChocolate createChocolate(String size) {
    AbstractChocolate chocolate;
    int weight = 0;


    switch (size.toLowerCase()) {
      case "large":
        weight = new Random().nextInt(500) + 500;
        chocolate = new LargeChocolate(weight);
        break;
      case "medium":
        weight = new Random().nextInt(150) + 150;
        chocolate = new MediumChocolate(weight);
        break;
      case "small":
        weight = new Random().nextInt(51) + 50;
        chocolate = new SmallChocolate(weight);
        break;
      default:
        throw new IllegalArgumentException("Invalid chocolate size: " + size);
    }
    return chocolate;
  }
}