package com.javafeature.annotations.metaAnnotations.annotationen;

import com.javafeature.annotations.metaAnnotations.TestType;
import com.javafeature.annotations.metaAnnotations.annotationen.SlowTest;
import com.javafeature.annotations.metaAnnotations.annotationen.Test;

@SlowTest
@Test(TestType.INTEGRATION)
public class BadImplementation {
    // Tests
}

/*
* Ein Integarationtest ist normalerweise langsam (Slow), daher alle Integrationtests sind vom Type Test und SlowTest.
* Es gibt aber in die Implementation in dieser Klasse zwei Probleme.
* 1 : wir müssen für alle Integrationtests alle beide Annotationen immer schreiben -> alle beide können kombiniert werden.
* 2 : Aus Versehen kann ein Entwickler gerne in einem Integrationtest eine von beiden Annotationen vergessen.
*
* Daher sollten wir eine Kombinationen von beiden Annotationen erstellen, die sich Composed Annotation nennt.
*
* */
