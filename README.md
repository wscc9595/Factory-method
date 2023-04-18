Factory Method Design Pattern
===

**by Zhi Liu, Saif Mustafa, Sai Wang**


### I. Introduction

In Java, and software design in general, there are various standard patterns a programmer can rely upon when designing software. They represent the best practices that have evolved over time to solve common design problems. Of course, these are not limited to Java alone and can generally be adapted to other programming languages. 

We can categorize these patterns into three main types: 
creational patterns to deal with the process of object creation, 
structural patterns to deal with the composition of classes and objects, and 
behavioral patterns to handle the communication and interaction between objects.

The Factory Design Pattern is a particularly useful creational pattern. It doesn’t specify the exact class of the objects that need to be created, but builds a “factory” that produces objects based on client input situationally. It provides an interface for the creation of objects in a super class while also allowing its subclasses to alter the type of object returned. In using this approach it allows client code to remain simple, only having to handle the interface for our factory itself and not the concrete classes that create the specific object needed.



### II. Design Principles

There are a few key principles that we adhere to when utilizing the factory pattern<sup>[1][2]</sup>. These are: 

1. Encapsulate object creation: The factory pattern should encapsulate the object creation details, pulling it away from the client code. This allows for future modification of the object creation process without affecting the client code. Or to simplify this, the creation of objects is handled by the factory itself.

2. Interface-based design: The factory pattern should provide an interface or abstract class, allowing the client code to work with only the interfaces or abstract classes instead of concrete classes. This promotes loose coupling and allows for far easier maintenance for both the programmer and their clients. 

3. Clear separation of concerns: Building on encapsulation, there should be a clear separation of what concerns are handled by which segment of code. The factory class should focus on object creation, while the client code should focus on the usage of the created objects.

4. Flexible extensibility: The factory pattern allows for the use of subclasses to override the factory method for object creation. This allows for flexible extensibility as returned objects typing can be altered, adjusted or replaced with entirely new types of subclasses as needed - providing a great deal of flexibility in how we choose to extend the code in future.

5. Centralized control: In handling object creation entirely within the Factory method we centralize the control of object creation in a single location. This allows for greatly simplified project maintenance and ensures that the process of making updates to the code remains as simple as possible.

6. Dependency inversion: Lastly in approaches that utilize the factory pattern, high-level modules should not depend on low-level modules, but instead both should depend on abstractions. This use of interfaces and abstract classes ensures that client code is not directly dependent on concrete implementations but are instead decoupled - allowing for further improvements in code maintainability and testability.


We can see in these principles both a description of the factory pattern’s benefits and in exactly what situations we should rely upon it. Namely in situations where we have multiple implementations of interfaces or abstract classes dependant on certain criteria, where object creation can benefit from encapsulation where we want to maintain centralization and/or flexibility to allow us to easily extend and modify processes and lastly where we want to ensure that our classes can remain decoupled and relatively independent of lower level modules. 

Our example below is one such situation where we found using the factory pattern to be beneficial. In it we need to create classes for substantiating chocolate objects of sizes small, medium and large but could conceivably need to expand this in the future based on other parameters such as nuttiness or bitterness. 



### III. Example

#### Problem Statement:

In this repository we have included an example of a chocolate factory. This factory handles the creation of ‘chocolate’ products of various sizes ‘Small’, ‘Medium’, or ‘Large’. We want these three types of chocolate to have random weights within several specific ranges of weights and we also want these chocolates to be categorized into appropriate classes based on these weights such that any chocolate from 50 to 100 grams in weight is a ‘Small Chocolate’ Object, any chocolate in-between 150 to 300 grams a ‘Medium Chocolate’ and anything from 500 to 1000 grams being a ‘Large Chocolate’.

Our UML diagram below shows our approach in approaching this goal. It follows the Factory pattern with a ‘ChocolateInterface’ for chocolate bars and a ‘ChocolateFactory’ interface for our factory. We also have an Abstract Class for our chocolate ‘ChocolateAbstract’ that implements our ChocolateInterface. 

We then have three subclasses for SmallChocolate, MediumChocolate, and LargeChocolate respectively that extend the AbstractChocolate class keeping it’s getWeight method but expanding it to also have a getClassName method that tells us whether we have a ‘Small Chocolate’, ‘Medium Chocolate’ or ‘Large Chocolate’ respectively. 

Lastly, we have a Factory ChocolateFactoryBySize that implements the ChocolateFactory interface. When called it accepts a single string parameter “small”/”medium”/”large” for what type of chocolate we want. This is all the client will ever need to know to use this factory. It uses a switch case to decide what range to generate a random weight within and by itself decides to call a specific subclass based on this internal logic. 


![UML - Chocolate Factory Method Pattern diagram](https://user-images.githubusercontent.com/122859530/232683063-6087ccd0-219f-480b-8ec9-cf19cf232fc3.png)


#### How to run code

To run our example code, you can execute the Main.java file in the chocolatefactory package.
The Main.java file is set up to instantiate three instances of Chocolate objects representing small, medium, and large chocolates.
It calls the ChocolateFactoryBySize implementation of the ChocolateFactory interface with different size arguments ("small", "medium", or "large") to create the corresponding chocolate instances.
To directly use the ChocolateFactory, you can call the createChocolate() method with a size argument ("small", "medium", or "large"), in much the same way as demonstrated in the Main.java file. This will return an instance of the appropriate Chocolate subclass, allowing you to access its methods and properties.
These returned instances/objects can in turn be called with either of their methods, chocolateSize() and getWeight(). The chocolateSize() method returns a string representation of the chocolate's size, such as "Small Chocolate", "Medium Chocolate", or "Large Chocolate". The getWeight() method returns the weight of the chocolate object in grams, generated within the specified weight range for each size.


#### Cons

We must, however, also acknowledge that no single design pattern is omnipotent and there are of course drawbacks to using the factory pattern<sup>[3][4]</sup>. For the factory pattern some of the chief drawbacks are:

1. Code complexity: Approaches using the factory pattern might introduce additional classes and interfaces to a project, which may in cases increase the code complexity. This can be an issue if the pattern is overused or applied to simple scenarios where it's not needed.

2. Runtime errors: If an incorrect type or a non-existent type is passed to the factory, it may return a null object or throw an exception at runtime. This could be avoided with better error handling and validation, but it is still a potential downside.

3. Overhead: The additional classes and interfaces may introduce a small amount of overhead in terms of memory usage and performance. This is usually negligible, but it should be considered when evaluating whether to use the pattern.



### V. Conclusion

In summary, the factory design pattern is a highly versatile and maintainable pattern that can be a great approach for many projects - especially those where the specific subclasses or types of object needed cannot be easily anticipated or may require modification in the future. In such cases it allows for the responsibility over object creation to be delegated to one or more subclasses in a single centralized location enabling easy code maintenance and extension into the project’s future.


### References

[1] Freeman, E., Robson, E., Bates, B., & Sierra, K. Head First Design Patterns (2nd Edition). O'Reilly Media. (2014)

[2] Coad, P., Lefebvre, E., & De Luca, J. Java Design Patterns: A Tutorial. Addison-Wesley Professional. (2011)

[3] Javarevisited. What is Factory Method Design Pattern in Java with Example - Tutorial. Available: https://javarevisited.blogspot.com/2011/12/factory-design-pattern-java-example.html#axzz7z4teNu4O  (Accessed: April 14, 2023)

[4] Refactoring Guru. Factory Method. Available: https://refactoring.guru/design-patterns/factory-method  (Accessed: April 13, 2023)







