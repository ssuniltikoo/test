package DataBaseDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.LOCAL_VARIABLE,ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface Author {

    String value()  ;
}
