package com.javafeature.annotations.metaAnnotations.annotationen;

import com.javafeature.annotations.metaAnnotations.TestType;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@SlowTest
@Test(TestType.INTEGRATION)
@Retention(RUNTIME)
@Target(TYPE)
public @interface IntegrationTest {
}
