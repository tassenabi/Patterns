# Facade Pattern 

=> Facade Pattern is a Structural Design Pattern

#### Why is Facade Pattern a Structural Design Pattern?

=> Because it helps to hide lots of internal complexities and provide simple to use interface to the programmer to work with the system

#### Which Problem does Facade Pattern Solve?

1. Complexity overhead to consumer.
2. Need to remember different point of contacts for operations of same category.

####Definition of Facade Pattern

Facade Pattern uses a class to provide a simplified interface to a library, a framework, or any other complex set of classes.


#### Advantages
1. Single point of contact for operations under same category.
2. It provides a simple interface to clients i.e. instead of presenting complex subsystems, we present one simplified interface to clients. It can also help us to reduce the number of objects that a client needs to deal with.
3. Usage of pattern becomes simple, increasing the readability too!

#### Disadvantages
1. All the developers need to be informed about this Facade class, otherwise they use the original library(who are very familiar with the library)
2. When the internal structure of a subsystem changes, you need to incorporate the changes in the facade layer also.

#### Other Examples
1. Waiter facade who simplifies the things for you so that you can query, order and pay with that single point of contact!
2. Order facade to manage customer, billing, delivery.