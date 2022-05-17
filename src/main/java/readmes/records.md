Eigenschaften:
- Ich will immer den inneren State sehen (nicht wie bei Controller-Klassen z.B.)
- Klasse ist immer final (extends gehts nicht) .. will ja auch den inneren State sehen
- Immutable (Werte kann man nicht ändern)
- Leider nicht deeoply immutable (falls Klasse in einem Record nicht final ist)
- Es gibt nur Accessor-Methoden (ohne get-Präfix)
- toString, hashCode und equals-Methode dabei

Wann nicht?:
- JPA (möchte das Klassen non-final sind und haben einen NoArgs-Konstruktor, non-final Attribute)

Anwendungsfall: DTO