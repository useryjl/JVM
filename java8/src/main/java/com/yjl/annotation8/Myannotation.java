package com.yjl.annotation8;

import java.lang.annotation.*;

/**
 * @author ll3306
 * @Description  定义注解
 * @create 2022-01-09
 */
@Repeatable(RepeatMyannotation.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Myannotation {
    String value() default "YJL";
}
