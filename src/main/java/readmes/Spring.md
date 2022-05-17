## Spring Container:
Field-Based Dependency Injection
Aufruf über ConfigureableApplicationConext.getBean();
@Component an der BeanClass (Singleton Standard und wird einmalig automatisch erstellt)
@Scope(value=“prototype”) (Kein Singleton mehr 0 - n Instanzen)
@AutoWired wo  die Referenz verwendet wird (@Component in der anderen Bean nicht vergessen)