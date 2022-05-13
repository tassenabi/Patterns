###JDK 9:
* Private Methoden in Interfaces möglich
* verbotener Bezeichner "_" -> final String _ = "rrr";
* PIDs ermitteln -> ProcessHandle.current().pid();
* Reaktive Streams mit der Klasse Flow
* JShell

###JDK 10:
* var  (für lokale Variablen, die direkt initialisiert werden)
Achtung hier:
var mixedContent = new ArrayList<>();
mixedContent.add(42);
mixedContent.add("42"); 

###JDK11:
* String-Methoden:
- isBlank() -> ist ausschließlich whitespace vorhanden?
- lines() -> Zeilenumbrüche, wenn /n vorhanden
- repeat(int) -> wiederhole den String .... "hallo".repeat(2);
- strip() -> führende und nachfolgende Whitespaces entfernen
- stripLeading() -> entfernt Whitespace am Anfang
- stripTrailing() n-> entfernt Whitespace am Ende

* HTTP/2-API wird unterstützt (java.net.http) -> binäres SPDY-Protokoll 

###JDK12:
* Microbrenchmarks mit JMH (einfach über @Benchmark)

