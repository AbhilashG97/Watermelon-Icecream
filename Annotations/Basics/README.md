# Annotation Basics

## Format of a Java Annotation

A Java annotation can be of the following types - 

1. ```java 
    @Entity
    ```
1. ```java 
    @Entity(element = value)
    ``` 
    or

    ```java
    @Entity(value)
    ```
    :exclamamtion: If the annotation has only one element then the value can be specified directly inside the parenthesis
1. ```java
    @Entity(
        element1 = value1, 
        element2 = value2
    )
   ```
We can have multiple annotations declared for the same declaration. If the same annotation is used for multiple times, then it called a **repeating annotation**.

:warning: The annotation type can be one of the types that are defined in the ```java.lang``` or ```java.lang.annotation``` packages of the Java SE API.

## Where Annotations Can Be Used

Annotations can be applied to declarations :

1. Declaration of classes
1. Declaration fields
1. Declaration methods, and other program elements.

:warning: When used on a declaration, each annotation often appears, by convention, on its **own line**.

:exclamation: This form of annotation is called a **type annotation**.

Here are some examples of type declarations in annotations : 

1. **Class instance creation expression**:
    ```java 
    new @Interned MyObject();
    ```

1. **Type cast**:
    ```java
    myString = (@NonNull String) str;
    ```

1. **```implements``` clause**:
    ```java
    class UnmodifiableList<T> implements
        @Readonly List<@Readonly T> { ... }
    ```

1. **Thrown exception declaration**:
    ```java
    void monitorTemperature() throws
        @Critical TemperatureException { ... }
    ```

## Creating Annotations

In order to create an annotation ```@interface``` keyword is used.

:warning: If a default value for an element inside the annotation is not provided, then the user who will be using the annotation will have to provide a value to that element or else compile time error will occur.

:warning: To create a ```JavaDoc``` of your custom annotation you will have to use the ```@Documented``` annotation with your custom annotation. 

Here is simple example - 

```java
import java.lang.annotation.Documented;

@Documented
@interface Fruit {

    String name();
    float price();
    boolean isSweet() default true;

}
```