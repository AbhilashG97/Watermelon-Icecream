import java.lang.annotation.Documented;

@Documented
@interface Fruit {

    String name();
    float price();
    boolean isSweet() default true;

}