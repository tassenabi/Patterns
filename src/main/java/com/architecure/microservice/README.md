## Microservice:
1. Das Beste von allen Technologien nehmen (bestimmte libraries gut in java, aber als Microsoft Container nicht nach außen sichtbar, dass abhängig von dieser Technologie) <p>
2. Deployment ist unabhhängig voneinander <p>
3. vertikale Skalierung (meist von Unternehmen eingesetzt die sowas machen; Netflix) <p>

SOA: Serviceorientierten Architektur (z.B. innerhalb eines Monolithen mgl.):

## Service Discovery:
Kommunikation unter Microservices (sogar als eigener Microservice) … da man keine fixen URLs eingeben möchte.
Registery am Register server
Two Models:
Client side service discovery
Server side service discovery
Common architecture pattern:
load balancer oder service registry

## Load Balancer:
Handle the request to which server to routing
wegen Crypto: Shared Cache (Redis), da ein Load Balancer zwischengeschaltet ist … und die SessionID meistens im Cookie-Header mitgeliefert wird, haben die Server keine Informationen untereinander von der SessionID
Shared Cache -> Single Point of Failure