package com.javafeature.annotations.metaAnnotations.processor;

import com.javafeature.annotations.metaAnnotations.annotationen.GoodImplementation;
import com.javafeature.annotations.metaAnnotations.annotationen.IntegrationTest;
import com.javafeature.annotations.metaAnnotations.annotationen.SlowTest;
import com.javafeature.annotations.metaAnnotations.annotationen.Test;

public class Application {
    public static void main(String[] args) throws Exception {

        AnnotationProcessor processor = new AnnotationProcessor();

        processor.registerHandler(IntegrationTest.class, a -> System.out.println("Found a class annotated with @IntegrationTest"));
        processor.registerHandler(SlowTest.class, a -> System.out.println("Found a class annotated with @SlowTest"));
        processor.registerHandler(Test.class, a -> System.out.println("Found a class annotated with @Test(" + a.value() + ")"));

        processor.process(GoodImplementation.class);
    }
}
