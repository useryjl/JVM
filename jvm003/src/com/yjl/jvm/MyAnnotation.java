package com.yjl.jvm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ll3306
 * @Description  注解的生命周期
 * RetentionPolicy.SOURCE   该注解标识的只出现在java源代码中
 * RetentionPolicy.CLASS    该注解标识的只出现在class字节码中
 * RetentionPolicy.RUNTIME  该注解标识的出现在class字节码中，并且由JVM虚拟机加载  反射机制
 *
 * @create 2022-01-06
 */
@Target(ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}
