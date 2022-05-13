
Wann wird das Observer-Pattern benutzt?
- bei einer Änderung eines beobachteten Objekts (auch publisher / subject genannt) sollen alle beobachtende Objekte (subscriber / observer) ein update erhalten
- publisher hält eine Liste von allen subscriber und sendet an alle ein update, wenn sich sein state ändert
- reale Beispiele: Facebook, Twitter, Youtube , Aktienmarkt
- Code Beispiele: Wetter-App, z.B. Hintergrundfarbe updated sich abhängig von Temperatur
                  Bibliothek-App, z.B. Verfügbarkeit von Bücher --> sendet Benachrichtigung an alle Leute in der Warteschlange

Vorteile:
- loose coupling - reduziert Abhängigkeiten
- das publisher Objekt braucht nix von den subscriber Objekten zu wissen
- subscriber / observer können jederzeit hinzugefügt / entfernt werden

Nachteile:
- subscriber Objekte erhalten jedes Mal ein update vom publisher Objekt, sobald es eine Änderung gibt --> erhalten also auch ggf. ungewollte updates
- subscriber werden in einer zufälligen Reihenfolge benachrichtigt