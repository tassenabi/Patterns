package com.javafeature.annotations.metaAnnotations.processor;

import java.lang.annotation.Annotation;

public interface AnnotationHandler<T extends Annotation> {
    @SuppressWarnings("unchecked")
    public default void handle(Annotation annotation) {
        doHandle((T) annotation);
    }

    public void doHandle(T annotation);
}
