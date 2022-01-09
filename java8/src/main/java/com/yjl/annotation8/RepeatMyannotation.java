package com.yjl.annotation8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ll3306
 * @Description 容器
 * @create 2022-01-09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface RepeatMyannotation {
    Myannotation[] value();
}
