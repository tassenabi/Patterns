Patterns --> Creational(Erzeugungsmuster) , Structure, behavior (Verhaltensmuster)

Signleton --> Creational(Erzeugungsmuster)

Was ist Singleton:
a --> Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists.
b --> The singleton class must provide a global access point to get the instance of the class.
c --> Singleton pattern is used for logging, drivers objects, caching and thread pool.
d --> Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
e --> Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.

To implement this Pattern, a class should implement these concepts
1 - Private constructor to restrict instantiation of the class from other classes.
2 - Private static variable of the same class that is the only instance of the class.
3 - Public static method that returns the instance of the class, 
    this is the global access point for outer world to get the instance of the singleton class.

There is basically two types of implementation:
 1 - Class-Based
  Note: Types of class-Based implementation (https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples)
    1 - Eager initialization:
        In eager initialization, the instance of Singleton Class is created at the time of class loading, 
        this is the easiest method to create a singleton class but it has a drawback that instance is created 
        even though client application might not be using it.
    2 - Static block initialization:
        Static block initialization implementation is similar to eager initialization, 
        except that instance of class is created in the static block that provides option for exception handling.
    3 - Lazy Initialization
        Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
        When it comes to multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time. 
        It will destroy the singleton pattern and both threads will get the different instances of the singleton class.
    4 - Thread Safe Singleton:
        The easier way to create a thread-safe singleton class is to make the global access method synchronized, 
        so that only one thread can execute this method at a time.
    5 - Bill Pugh Singleton Implementation:
        Prior to Java 5, java memory model had a lot of issues and the Thread safe singleton approaches used to fail in certain scenarios 
        where too many threads try to get the instance of the Singleton class simultaneously. 
        So Bill Pugh came up with a different approach to create the Singleton class using an inner static helper class.
    6 - Using Reflection to destroy Singleton Pattern:
        Reflection can be used to destroy all singleton implementation approaches.
    7 - Serialization and Singleton:
        Sometimes in distributed systems, we need to implement Serializable interface in Singleton class 
        so that we can store its state in the file system and retrieve it at a later point of time.
 2 - Enum-Based


Disadvantages:
1 - They are generally used as a global instance, why is that so bad? Because you hide the dependencies of your application in your code, 
    instead of exposing them through the interfaces. Making something global to avoid passing it around is a code smell.

2 - They violate the single responsibility principle: they control their own creation and lifecycle.

3 - They inherently cause code to be tightly coupled. This makes faking (mocking) them out under test rather difficult in many cases.

4 - They carry state around for the lifetime of the application. Another hit to testing since you can end up with a situation 
    where tests need to be ordered which is a big NO for unit tests. Why? Because each unit test should be independent from the other.

Testbarkeit: 
1 - They make unit testing very hard. They introduce global state to the application. 
    The problem is that you cannot completely isolate classes dependent on singletons. 
    When you are trying to test such a class, you inevitably test the Singleton as well.
2 - In unit-testing, you want to isolate your CUT (class under test). 
    You don’t want to test a bunch of classes, because that would defeat the purpose of unit – testing.