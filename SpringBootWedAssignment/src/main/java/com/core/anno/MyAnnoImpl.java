package com.core.anno;


import java.lang.annotation.Annotation;

public class MyAnnoImpl implements MyAnno<MyAnnoImpl,String> {
    @Override
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
