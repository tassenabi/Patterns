Erzeugung von Instanzen des Types "Beans" zu unterstützen, wenn diese eine große Zahl von Attributen enthält.
Ein Builder ist nun so etwas wie eine detailliert konfigurierbare Factory, die über eine Reihe von
Mutator-Methoden (vs. Accessoren) die Attributwerte für ein Product ansammelt um schließlich eine Instanz
mit eben diesen Werten zu erzeugen.

Vorteile:
- Named Parameters (na welcher Parameter kommt nun in der richtigen Reihenfolge?)
- Telescope Constructor Problem (2 Parameter optional, sonst viele überladene Methoden)
- Immutable gegeben, weil Mandant keine Setter

Bekannte Implementierungen:
- StringBuilder :)
- StringBuffer (falls synchronized)

StringBuilder builder = new StringBuilder("Hello");
String zeichenkette = builder.append(1)
		.append("blabla")
		.toString();

Nachteile:
- Mehr LoC