JointPoint: Bestimmter Punkt zuir Laufzeit eines Programmes

Advice: Bestimmt die Aktion, die ein Aspect ausführt. Wird also vor, nach oder um den Jooin Point ausgeführt.

Weaving: Prozess, der Klassen und Aspekte verwebt ... Also mittels @Chacheable an einer Klasse ... Kann

während der Kompilierung oder auf Bytecodeebene vorkommen.


AOP:
Introduction:
--> Cross cutting Concerns:
Applications are generally developed with multiple layers. A typical Java application has
    - Exposing the services to outside world using REST or a web application (Web Layer)
    - Business Logic (Services)
    - Persistence Logic (Repos, Bo), in addition, there are some functionalities that are needed in many layers,. 
but this functionality are not just related to one layer. Example: Logging, Security
Suppose you need to log some information in all business methods in your application, here Logging is a cross-cutting 
concern. It is required for all application layers, but it is not necessary from the business layer point of view, 
it is a simple generic functionality we have to implement in many places (layers) in the application.
By OOP, cross cutting concerns are implemented seperately in every layer: 
                                      --> But this results Scattering (Code Duplication) 
                                          and Tangling (tangling occurs when a module in a system includes 
                                          code that implements different system requirements)  
                                      
Solution: Aspect Oriented Programming provides a solution to implement Cross Cutting Concerns.
                - Implement the cross cutting concern as an aspect.
                - Define point cuts to indicate where the aspect has to be applied.
          This ensures that the cross cutting concerns are defined in one cohesive code 
          component and can be applied as needed. 

------------------------------------------------------------------------------------------------------------
Terminologies:
    *Aspect: an aspect is a class that implements application concerns that cut across multiple classes.
    Aspects can be a normal class configured through Spring XML configuration, or we can use Spring AspectJ 
    integration to define a class as Aspect using @Aspect annotation.
        
   *Join point: this represents a point in your application where you can plug-in the AOP aspect.
   You can also say, it is the actual place in the application where an action will be taken using 
   Spring AOP framework. In Spring AOP a join point is always the execution of a method.
    
   *Advice: advices are actions taken for a particular join point. In terms of programming, they are methods
   that (piece of code) get executed when a certain join point with matching pointcut is reached in the application

   *Pointcut: it's a combination of JoinPoints, and it specifies that at which JoinPoint Advice will be executed.
    
   *Target object: the object being advised by one or more aspects.
    This object will always be a proxied object, also referred to as the advised object.
------------------------------------------------------------------------------------------------------------
   AOP Advices Types:
    *Befor: run advice before the a method execution.
    *After: run advice after the method execution, regardless of its outcome.
    *After-returning: run advice after the a method execution only if method completes successfully.
    *After-throwing: run advice after the a method execution only if method exits by throwing an exception.
    *Around: run advice before and after the advised method is invoked.
------------------------------------------------------------------------------------------------------------
Additional information

*Weaving: weaving is a process of inserting aspects into the application code at the join point.
This can be done at compile time, load time, or at runtime.
*Weaver: An aspect weaver takes information from classes and aspects and creates new classes with the aspect
code appropriately weaved into the classes.
*Weaving plan: example: Befor, After .....
*AspectJ: is an aspect-oriented programming extension for the Java.

AOP Nachteil
-Difficult to debug the AOP
-Just public method can be advised
-Aspects cannot advise other Aspects
-There's small runtime overhead, but its negotiable
-Verletzung von Lokalitätseingenschaften
