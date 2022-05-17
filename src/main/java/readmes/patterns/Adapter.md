# Adapter Pattern 

=> Adapter Pattern is a Structural Design Pattern

#### Why is Adapter Pattern a Structural Design Pattern?

=> Because it makes two incompatible structures into compatible ones
#### Which Problem does Adapter Pattern Solve?

1. Consumer and Provider are incompatible, because both of them follows different protocol.
2. Provider can have its own set of steps to be executed, before it gets consumed. These steps can vary provider to provider.
3. To consume provider, compatibility code can not be added inside "consumer" code. If we do so, if provider changes, consumer will need refactoring!
####Definition of Adapter Pattern
When ever two objects are incompatible and wants to collaborate with each other Adapter pattern will ensure that they are compatible and can communicate by transferring messages from one object to another in the format they are expecting.

#### Advantages
1. Consumer code and provider code can reside independently witout worrying about how to interact with each other
2. Helps to achive Single Responsibility principle and open/close principle
#### Disadvantages
1. Complexity of the code can be increased because you need to introduce a set of new interfaces and classes.
#### Other Examples
1. java.util.Arrays#asList()
2. 


   Identification: Adapter is recognizable by a constructor which takes an instance of a different abstract/interface type. When the adapter receives a call to any of its methods, it translates parameters to the appropriate format and then directs the call to one or several methods of the wrapped object.