Viele Anfragen führen zu Überanspruchung in nachgelagerten Systemen

Große Post Request führen zu Out of Memories
Arrays ohne Begrenzungen für zu Out of Memories
Gzip/Rest Bomben

Lösungen:
Rate Limitings für Clients und Global (429 Too Many Requests)
Größenbeschränkungen von Requests (413 Payload to Large)
Schema Validierung (400 Bad Request)
Klare API Definition