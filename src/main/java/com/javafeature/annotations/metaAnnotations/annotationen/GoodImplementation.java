package com.javafeature.annotations.metaAnnotations.annotationen;

@IntegrationTest
public class GoodImplementation {
    // Some heavy tests
}

/*
* Wir könnten eine Logik schreiben, womit alle SlowTests nach eine Bestimmte Merkmale gesucht, gefiltert
* und als Integrationtests gelistet und durchgeführt werden.
* Das Problem bei solch eine Logik ist, dass
*  1. wir eine Art Inkonsistance bauen würden, wodurch vermutlich nicht
* alle IntegrationTests aus Slowtests gefiltert werden können.
*  2. Die gleiche Logik muss für alle SlowTests durchgeführt werden -> Duplication
* */

