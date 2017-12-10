package com.epam.vol2.oop.ex7;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoSomething {
    int value();
    String author() default "UNKNOWN";
}
