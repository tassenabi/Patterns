#Annotationen:  

###Definitionen:
1 ->  Annotationen sind Markierungen im Quellcode.  
Daher Annotationen sind Metainformationen (Also, Information über Quellcode (Quellcode = Information über das Program)).  
Eine Andere (Compiler, Framework(hibernate) oder unsere eigene Klassen) können dann auf Annotationen reagieren.

2 ->  Java Language Specification(Oracle)  
An annotation is a marker which associates information with a program construct,
but has no effect at run time. An annotation denotes a specific invocation of an annotation type
and usually provides values for the elements of that type.

3 ->  Wikipedia  
Als Annotation wird im Zusammenhang mit der Programmiersprache Java ein Sprachelement bezeichnet,
dass die Einbindung von Metadaten in den Quelltext erlaubt.

###Merkmale:  
1-> Gibt es seit Java Version 5  
2-> können auf bestimmte Elemente geschrieben werden (Class, Method, Property(Field))  
3-> Annotationen haben keinen Effekt on Runtime. (can not change the behavior of class)  
4-> Zwei wichtige Merkmale beim Erstellen einer Annotation(Target, Retention)  
5-> Meta-Annotationen, die zum Erstellen andere Annotationen verwenden werden können:
    (Diese Annotationen wurden mit Java 5 vordefiniert mitgeliefert)
### Metation-Annotationen
####können überall verwendet werden.
  * @Override:
  * @Deprecated: Bezeichnet, dass der Annotierte Teil sollte nicht mehr verwendet werden.
  * @SuppressWarnings: Bestrimmte Warnungen werden unterdruckt -> @Suppresswarnings({"deprecation"})
  * @SavaVarags: Versichert, dass Varags and Generic Typs zum Laufzeit mit einen unpassenden Generics-typ ersetzt werden.
#### Nur zum Definieren einer neuen Annotation
  * @Documented: Der annotierte Code-teil wird von Javadoc berücksichtigt.
  * @Inherited: Bezeichnet, ob eine Annotation bei unterclassen vererbt werden soll.  
  * @Target: Bezeichnet wo eine Annotation angewendet wird -> 
    Bei Verwendung von folgenden Typen, können die difinierten Annotation jaweils: 
    * TYPE -> nur auf Klassen, Interfaces und Enums verwendet werden.
    * FIELD -> nur auf Felder verwendet werden.
    * METHOD -> nur auf methoden verwendet werden. (Konstruktoren sind ausgeschlossen)
    * PARAMETER -> nur auf Parameter von Methoden und konstruktoren verwendet werden.
    * CONSTRUCTOR -> nur auf Konstruktoren verwendet werden.
    * LOCAL_VERIABLE -> nur auf lokale Variablen verwendet werden.
    * ANNOTAION_TYPE -> nur auf andere Annotationen verwendet werden.
    * PACKAGE -> nur auf packages verwendet werden.
    
  * @Retention: Bezeichnet, wie lange eine Annotation durch Compiler beibehalten wird. 
    * CLASS: Annotation wird mit der Klasse kompiliert und ist damit auch in der .class file vorhanden,
      können aber in der Laufzeit nicht ausgelsen werden. (CLASS ist der Standardwert von Retention)
    * RUNTIME: Annotation kann während der Laufzeit mittels Reflection gelesen werden.
    * SOURCE: Annotation wird vor Kompilieren von Quellcode enternt. Daher zur Laufzeit nicht Verfügbar

## Eigene Annotation Definieren

Zum Definieren eigner Annotation sollte man folgdene Punkte beachten:

  * Annotationen sind eine spezielle Art von Interfaces, Daher Anfangesbuchstabe des Namens sollte groß geschrieben werden.
  * Vor dem Keyword interface muss ein (@ zeichen) geschrieben werden.
  * Eine Annotation erweitert nur java.lang.annotation.Annotation, und keine andere Schnittstelle darf erweitert werden. (extends ist verboten)
  * Falls beim Definieren auch noch Mehoden geschrieben werden:
    * Methoden sollten parameterlos sein
    * als Return Type kann nur folgende Typen zurückgegeben werden
      * primitive Typen
      * enum
      * String
      * Class
      * Array (der Inhlat sollte von oben genannten Typen sein)
    * methoden werfen keine Exceptions
    * methoden dürfen keine Rekursion implementieren
  * Annotation können auch ohne Mehoden defniert werden


## Annotation Processor
* seit Java 5 gibt es dieses Konzept und kann dadurch source files generiert werden.
* Durch Processor können neue datein erstellt werden und daher die existierenden Datein werden nicht geändert.
  Lombok ist ein Exception, while Lombok nutzt annotation processing als Bootstraping-Mechsnismus und dadurch
  incldudet sich lombok in compilation process und modifiziert die AST(Abstract Syntax Tree).
* Ein gutes Beispiel ist hier implementiert. (https://www.baeldung.com/java-annotation-processing-builder)
