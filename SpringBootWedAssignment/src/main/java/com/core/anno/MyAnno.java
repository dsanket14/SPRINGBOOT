package com.core.anno;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)                      //where to use this anno. i.e class/method/variable
@Retention(RetentionPolicy.RUNTIME)             //when it will be avilable i.e @runtime
@Constraint(validatedBy = MyAnnoImpl.class)     //class that perform validation
public @interface MyAnno {
    String name() default "name";               //attributes in annotation
    int age() default 0;                         //attributes in annotation
}
