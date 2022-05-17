Vererbst du noch?

Vermeide überstrapazierte Vererbung ...

Die Klassen werden erst zur Laufzeit >>dekoriert<<!

Zweck: Den Objekten neue Aufgaben geben, ohne den Code der zugrunde liegenden Klasse zu ändern ... das klingt nach???

Open closed principle ... neues Verhalten integrieren, ohne bestehenden Code zu verändern. (Für Erweiterungen offen, für Veränderungen geschlossen).

Problemstellung: Ein Kaffee-Getraenk (es soll 2 Grundarten geben je mit Preis und Beschreibungstext), soll mit verschieden Zutaten kombinierbar sein ... how to?

Und wo findet das Ding Anwendung?

- abstrakte Komponente "Getraenk"
- abstrakter Dekorierer "Zutatdekorierer"
- konkreter Dekorierer "Soja"

- abstrakte Komponente "InputStream"
- abstrakter Dekorierer "FileInputStream"
- konkreter Dekorierer "LineNumberInputStream"