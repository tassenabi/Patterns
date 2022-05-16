Programming around a synchronized data stream (stream is set of an event) … no concept of immutable state

## Reaktive Streams:
- Widerstandsfähig gegenüber Fehlern
- In kurzer Zeit auf inputs reagieren können
- Hohe last elastisch reagieren
- Asynchron
- ereignisorientiert
  Observable -> Quelle der Ereignisse
  Observer - > Konsument der Ereignisse

## Streams:
- Enthält nur den Zugriff auf die Elemente
- Ein Anfügen/Löschen ist nicht möglich
- Nochmals verarbeiten -> nochmals neuer Stream
- Iteration erfolgt innerhalb des Streams
- Prinzip der Bedarfsauswertung -> Elemente dann geliefert, wenn angefordert