Wofür Optionals?
1) Exception oder null bei Objekten möglich.

Optionals haben zwei Zustände
1) Present
2) Absent
3) theoretisch Optional<String> stringOption = null; --> sollte nie niemals nie passieren, 
es gibt keinen Grund einem Optional null zuzuweisen

Wie Optional erstellen?
1) Optional.of("someString") -> nimmt einen Wert und gibt Optional vom Typ String zurück 
(hier darf kein null reingegeben werden ... gibt Exception zurück)
2) Optional.ofNullable("someString") -> Unterschied: Hier geht auch null rein, dann gibt es 
ein Optional.empty() zurück

Drei Methoden
1) isPresent() -> da ist was drin
2) isEmpty() -> Gegenteil von isPresent()
3) get() -> Inhalt des Optionals (gefährlich, weil NoSuchElementException mgl.) .. 

Exkurs get() Brian Goetz (Java-Architect Oracle)
"If I had to pick one regret[...] there is a get method on Optional, we should have never
called it get, we should have called it: getOrThrowSomethingHorribleIfTheThingIsEmpty"
Weil die Methode so kurz und einladen wirkt, wirkt es so, als ob man get() adäquat benutzt.

Wie hole ich mir dann den Inhalt?
orElse() --> Optionals.of("blabla").orElse("default"); ... einfache Werte
orElseGet() --> gibt eine Funktion wieder, die einen bestimmten Rückgabewert erst 
berechnet (und eben nicht direkt einen bestimmten Wert siehe 1. Code-Beispiel)

ifPresent() -> ohne rausholen des Wertes (siehe 2. CodeBeispiel)
ifPresentOrElse (siehe 3. Codebeispiel)

weitere Methoden:
map() -> 4. Codebeispiel
flatmap() Optional von Optionals vermeiden 5. Codebeispiel
filter() --> 6. Codebeispiel

Don't von Optionals:
1) Niemals null einem Optional zuweisen
2) Optionals nie als ClassField/Properties verwenden (Optionals sind nicht serialisable)
3) Optionals nicht als Methodenparameter verwenden, lieber Methodenüberladung

Nachteile Optionals:
1) Nicht rückwärtskompatibel (v.a. bei API-Definitionen)
2) Manche Leute mögen das nicht (Die Entwickler von Lombok z.B. -> riesiger Fehler).
3) Performance (weil immer noch Wrapper und schlecht bei performance-kritischen Schleifen)

Alternativen:
1) @Nullable/@NotNull
2) Null Object Pattern
3) Nullable types bei kotlin z.B. (nicht bei java möglich)
4) Exceptions werfen

Weitere Optional-Klassen (sind performanter)
1) OptionalDouble
2) OptionalInt
3) OptionalLong