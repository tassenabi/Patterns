package com.javafeature.annotations.metaAnnotations;

// https://dzone.com/articles/what-are-meta-annotations-in-java


// wir stellen uns vor, dass wir ein Testplatform bauen, der die Tests in einem Projekt erkannt
// und jenach Typ und Art diese in bestimmten Situationen gefiltert durchführt.
// Z.B. beim lokalen Build, wird nur schnelle Tests durchgeführt und beim Build auf PaaS alle Arten von Tests.
public enum TestType {
    UNIT, INTEGRATION, ACCEPTANCE
}
