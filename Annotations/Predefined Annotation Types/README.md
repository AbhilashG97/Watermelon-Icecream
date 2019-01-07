# Predefined Annotation Types

## Annotation Types Used by the Java Language

The predefined annotation types defined in ```java.lang``` are ```@Deprecated```, ```@Override```, and ```@SuppressWarnings```.

These annotations are explained in detail here : 

1.  ```java
    @Deprecated
    ```

    This annotation indicates that the marked element is **deprecated** and should no longer be used. The compiler generates a warning whenever a program uses a method, class, or field with the ```@Deprecated``` annotation. When an element is deprecated, it should also be documented using the Javadoc ```@deprecated``` tag

    :warning: Also please note that the Javadoc tag starts with a lowercase d and the annotation starts with an uppercase D.
    
1.  ```java
    @Override
    ```

    This annotation informs the compiler that the element is meant to override an element declared in a superclass. Usage of this annotation is optional, however using it prevents errors. 

    :warning: If a method marked with @Override fails to correctly override a method in one of its superclasses, the compiler generates an error.

1.  ```java
    @SuppressWarnings(value="someValue")
    ```
    This annotation tells the compiler to suppress specific warnings that it would otherwise generate. 

    :exclamation:   There are three categories of warnings **deprecation**, **unchecked** and **removal**.

    :warning:   To suppress multiple categories of warnings, use the following syntax
    
    ```java
                @SuppressWarnings({"unchecked", "deprecation"})
    ```

1.  ```java
    @SafeVarargs
    ```
    This annotation, when applied to a method or constructor, asserts that the code does not perform potentially unsafe operations on its varargs parameter.

1.  ```java
    @FunctionalInterface
    ```
    This annotation indicates that the type declaration is intended to be a functional interface, as defined by the Java Language Specification.

## Meta-annotations

Annotations that apply to other annotations are called **meta-annotations**. There are several meta-annotation types defined in ```java.lang.annotation``` package.

## Miscellaneous 

This [StackOverflow post](https://stackoverflow.com/questions/35892063/which-nonnull-java-annotation-to-use) explains why the ```@NonNull``` annotation is not present as a standard annotation in Java SE.

Also, the [Checker Framework](https://checkerframework.org/) provides a good set of annotations that can be used in Java Projects.

## References 

1. [DZone Article](https://dzone.com/articles/5-annotations-every-java-developer-should-know)