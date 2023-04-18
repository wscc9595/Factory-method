package chocolatefactory;

/**
 * The Main class demonstrating the Factory Method pattern.
 */
public class Main {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    System.out.println("Creating a Small Chocolate using the factory: ");
    ChocolateFactory factory = new ChocolateFactoryBySize();
    Chocolate smallChocolate = factory.createChocolate("small");
    System.out.println("Size: " + smallChocolate.chocolateSize());
    System.out.println("Weight: " + smallChocolate.getWeight());

    System.out.println("Creating a Medium Chocolate using the factory: ");
    Chocolate mediumChocolate = factory.createChocolate("medium");
    System.out.println("Size: " + mediumChocolate.chocolateSize());
    System.out.println("Weight: " + mediumChocolate.getWeight());

    System.out.println("Creating a Large Chocolate using the factory: ");
    Chocolate largeChocolate = factory.createChocolate("large");
    System.out.println("Size: " + largeChocolate.chocolateSize());
    System.out.println("Weight: " + largeChocolate.getWeight());
  }
}