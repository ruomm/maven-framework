package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 牛牛-wanruome@163.com
 * @version 1.0
 * @copyright www.ruomm.com
 * @create 2021/10/20 17:21
 */
@Target({ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiModel {
    String value() default "";
}
