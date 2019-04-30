package com.cxytiandi.encrypt.springboot.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 解密注解
 * 
 * <p>加了此注解的接口将进行数据解密操作<p>
 * 
 * @author zscat
 * 
 * @about 2019-04-30
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Decrypt {

	String value() default "";
	
}
