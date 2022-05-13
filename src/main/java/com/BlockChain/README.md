# Blockchain Basics

## Wie läuft es bisher? - zentrales Netzwerk
####User --> Server --> User
###Nachteile:
- Sicherheit: zentrale Stelle für Cyber-Angriffe
- Vertrauen: z.B. Datenmissbrauch
- Kosten: z.B. Überweisungsgebühren
- Zeit: z.B. Geldüberweisung Europa --> Asien dauert Tage

## Was macht die Blockchain? - dezentrales Netzwerk
####User --> User --> User --> User
####Wie funktioniert eine Transaktion?
1. UserA sendet 10 Bitcoin an UserB
2. Open Ledger Prinzip: jeder User in Netzwerk hat eine eigene Kopie des Kassenbuchs (anstatt eine zentrale Bank)
3. diese Transaktion ist zunächst "schwebend", da sie zuerst verifiziert werden muss
4. ####Miner (<-- wie eine Prüfungseinheit, die alle Transaktionen überwacht):
    1) alle Miner konkurrieren, wer als erstes die Transaktion geprüft und verifiziert hat
    2) überprüft die Gültigkeit der Transaktion (hat UserA überhaupt 10 Bitcoin?)
    3) sucht nach einem Key, um die Transaktion mit seinem Kassenbuch zu verknüpfen. Der Key stellt ein zufällig generierten Hashwert da und es kostet viel Rechenleistung (und Strom), um diesen zu entschlüsseln
    4) findet ein Miner als erstes den gültigen Key, 

