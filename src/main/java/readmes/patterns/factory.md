Was ist Factory Pattern ?
es gibt 3 verschieden Factory Pattern:
1.Static Factory: Die statische Factory-Methode ist einfach eine static Methode,
die eine Instanz einer Klasse zurückgibt.

 z.b. string.valueOf(), Optional (Optional.empty(), Optional.of("optional"), Optional.ofNullable(null))

2.Methode Factory: bietet die Möglichkeit an einem zentralen Punkt, Objekte ähnlicher Struktur zu erstellen und zu
verwalten.. wie: man erstellt eine Methode an einem zentralen Punkt, z.B. einer Factory Klasse,
                 wo man ein Objekt erstellt anhand eines Übergabe-Parameters (Objekttyp)

3.Abstract Factory: biete eine Schnittstelle zum Erzeugen von Familien verwandter oder voneinander abhängiger Objekte,
ohne ihre konkreten Klassen zu benennen. Im Vergleich zu Methode Factory, wird hier eine ganze Produktfamilie statt
ein Produkt erstellt, außerdem ist die Abstract Factory eine Interface und enthält keinen Implementierungscode.



Vorteile:
- Entkopplung der Erstellen-Methode in eigene Faktory-Klasse
- Erweiterbarkeit des Codes (open–closed principle)
- gute Testbarkeit und Wartbarkeit
  --> einfache Unit Test weil der Ersteller entkoppelt von Produkt ist
- Objekte ähnlicher Struktur (family) können zentral und unabhängig voneinander
 erstellt werden


Nachteile:
- benötigt man jedoch ein Objekt mit einer anderen Struktur,
müsste man die abstrakte Factory-Klasse und deren Subklassen ändern


