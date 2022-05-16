## RestFull erklärt:
- HTTP als Transportsystem (stateless) .. service endpoint at some URI (YAML, JSON, XML)
- Kommunikation zu einer Ressource und nicht einzelnem Service Endpoint
- Hypermedia Control: Verknüpfungen untereinander
- HTTP Verbs:
    - GET/POST: GET ist eine Safe Operation (macht keine Changes to the states of anything). POST/PUT ändert den State + Response code 201/400

## Viele Anfragen führen zu Überanspruchung in nachgelagerten Systemen

Große Post Request führen zu Out of Memories
Arrays ohne Begrenzungen für zu Out of Memories
Gzip/Rest Bomben

Lösungen:
Rate Limitings für Clients und Global (429 Too Many Requests)
Größenbeschränkungen von Requests (413 Payload to Large)
Schema Validierung (400 Bad Request)
Klare API Definition


## API Management:
- API Lifecycle rund um die API Consumers -> Partners, Internal, Public
  Plan, Design, Develop, Test, Deploy, Retire (für kleine - mittlere Unternehmen)
- API Management lifecycle: Secure, create, manage, socialize, monetize, analyze

## Rest in Java EE:
JAX-R Vorgehensweise:
- Vererbung von Application (rs.core.Application)
- -@Path & @ApplicationPath
- Methode -> @GET + Path(“/sayHello”)
- … oder
- @GET @Path(“/asd”)  Resonse getEchoMessage(@QueryMessage(“message”) String msg){  return Response.status().build();}
  oder
- @GET @Path(“/asd“) @Produces(MediaType.APPLICATION_JSON mgl)SimpleObject getObject(){ return new SimpleObject(id, “Test”); —> In SimpleObject noch @RootXML