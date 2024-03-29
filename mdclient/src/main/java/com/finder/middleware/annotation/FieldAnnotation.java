/**
 * Finder
 */
package com.finder.middleware.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author jameslwin
 *
 */
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface FieldAnnotation {

}
