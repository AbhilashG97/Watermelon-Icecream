import java.lang.annotation.Documented;

@Documented
@interface Fruit {
    String name();
    String[] desserts() default {"Fruit Ice-cream"};
    float price() default -1f;
}