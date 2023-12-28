package Annotations_;

import java.lang.annotation.*;

@Documented // Para sair no javaDoc;
@Retention(RetentionPolicy.RUNTIME) // Funciona apenas em tempo de excução;
@Target({ElementType.TYPE,ElementType.FIELD}) // Type para alocar em classe, e field para alocar em atributo;
public @interface firstAnnotation {

    String value();
    String[] bairros();
    double valorDefault() default 10d;

}
