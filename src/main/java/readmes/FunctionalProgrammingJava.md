## Object Oriented Programming vs Functional Programming
- Object Oriented Programming:
  1) Codeblöcke sind immer verbunden mit einer Klasse, welche ein Objekt beschreibt
  2) Zugriff auf eine Funktion benötigt eine Instanz der dazugehörigen Klasse
- Functional Programming:
  1) Funktionen sind isoliert / nicht gebunden an einer Klasse
  2) Funktionen können als Wert gespeichert werden

## Deklarativ ("Functional") & Imperativ("Prozedural")
- deklarieren --> bezeichen --> Funktion drück Logik des Programms aus, aber nicht dessen Fluss (keine Nebeneffekte)
- imperativ --> Befehl erteilen --> Funktion drück Logik & Fluss des Programms aus (Nebeneffektive möglich)

## Functional Interface
- ein Interface, was nur 1 abstact method hat (siehe Beispiel)
- java.util.function package --> library of functional interfaces 

## Predicate
- ein Functional Interface (mit einer abstract method "test"), was eine Collection als parameter nimmt und ein boolean zurück gibt (siehe Beispiel)
- typischer useCase: eine Collection nach einem parameter filtern


## Filter-Map-Reduce
<b> Filter:</b> Aus einer Ausgangsmenge von Objekten werden diejenigen herausgefiltert, die den benötigten Anforderungen entsprechen <p>
<b>Map: </b> Projektion, d.h. Transformation eines elements in eine andere Repräsentation (Anzahl der Elemente bleibt gleich) <p>
<b> Reduce: </b> Berechnungsergebnisse verarbeitet werden, d.h. Zusammenfassen zu einem Resultat (Konsolenausgabe oder als Ergebnismenge in einer Collection) <p>

