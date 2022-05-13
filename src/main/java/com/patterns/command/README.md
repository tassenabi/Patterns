Patterns --> Creational(Erzeugungsmuster) , Structure, behavior (Verhalten)

Command --> Behavioral pattern (Verhaltensmuster)

Was ist Command-Muster:
1 - Kapselung eines Requests als Objekt, um so die Parametrisierung von Clients mit verschidenen Requests, Warteschlagen
    oder Logging-Operationen sowie das Rückgängigmach von Operationen zu ermöglichen.
2 - Is a pattern, in which an object is used to represent and encapsulate all the information 
    (method name, the object that owns the method and values for the methode parameters)
    needed to call a method at a later time.

Usage in java : javax.swing.Action


Components
1 - Command Classes: (Command)
    A command is an object whose role is to store all the information required for executing an action, 
    including the method to call, the method arguments, and the object (known as the receiver) that implements the method.

2 - Reciever: (Textfile)
    A receiver is an object that performs a set of cohesive actions. 
    It's the component that performs the actual action when the command's execute() method is called.

3 - Inoker: (TextFileOperationExecutor)
    An invoker is an object that knows how to execute a given command but doesn't know how the command has been implemented. 
    It only knows the command's interface.

4 - Client Class: (Client)
    A client is an object that controls the command execution process by specifying what commands to execute 
    and at what stages of the process to execute them.




Pros:
1 - It decouples the classes that invoke the operation from the object that knows how to execute the operation.
2 - It allows you to create a sequence of commands by providing a queue system.
3 - Extensions to add a new command is easy and can be done without changing the existing code
4 - You can also define a rollback system with the Command pattern. (Do/Undo)


contras: 
1 - There are a high number of classes and objects working together to achieve a goal. 
    Application developers need to be careful developing these classes correctly.
2 - Every individual command is a ConcreteCommand ...

Sehr gute Quelle: https://refactoring.guru/design-patterns/command