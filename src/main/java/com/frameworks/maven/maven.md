Struktur:
- Maven-Objekte (Plugins) kapseln Daten (Properties) und Methoden (Goals) in logischer Einheit

Beispielplugins:
- Kompilieren, Kopieren, Erzeugen von Artefakten & Reports, Javadoc, Benachrichtungsmail

Koordinaten (Identifikator):
- GroupId, ArtifactId, Version (GAV)

Build Lifecycle:
- Unterteilung des Builds in Phasen
- Serielle Abarbeitung
- Abbruch des Builds bei Failed

Einstellung für Maven-Runtime: 
- settings.xml
- Repositories
- Netzwerkeisntellungen
- Profile

Abhängigkeiten:
- x definiert Abhängigkeit zu Y, Y definiert Abhängigkeit zu Z

Gültigkeit (hilft auch bei Abhängigkeiten aufzulösen):
- compile (standard)
- provided (Bereitstellung durch Laufzeitumgebung)
- runtime (Notwendigkeit erst zur Laufzeit)
- test (nur für Tests)
- system (wie provided > für native Bibliothek ohne POM)

Vererbung:
- Überschreiben und Ergänzen in Child-POM
- dependencyManagement (zentrale Verwaltung von Scope und Versionen)
- pluginManagement (zentrale Verwaltung von Plugins)