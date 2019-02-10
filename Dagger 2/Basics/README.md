# Dagger 2 Basics

This repositoy demonstrates the use of [Dagger 2](https://github.com/google/dagger).

## Introduction

Dagger 2 is a Dependency Injection library. The idea of Dependency Injection comes from the ```Inversion of Control``` principal. In ```Dependency Injection``` we provide dependencies from an external configuration class. 

If we use the ```new``` Java keyword we would end up creating a ```hard dependency``` which is not good.

## Some facts on Dependency Injection 

Below mentioned are some facts on dependency injection - 

1.  There are three modes of injection which are as follows - 

    1. **Constructor Injection**

    1. **Field Injection**

    1. **Method Injection**

:warning: As fields and method parameters are injected after the constructor is called, you cannot use injected member variables in the constructor.

:warning: ```Dagger 2``` checks and draws the dependency object graph at compile-time.

The following annotations are used in dependency injection in Dagger 2-

1.  ```@Provides```

    This annotation is used on methods that provide dependencies. These methods are placed in a class annotated with ```@Module``` annotation.

1.  ```@Module```

    This annotation is used on classes that contain methods which provide the dependencies. The methods which provide the dependencies are annotated with ```@Provides``` annotation.

1.  ```@Component```

    This annotation is used on interfaces which contain abstract methods which define where the dependencies need to be placed. The place where the dependencies need to be placed are passed as arguments to the methods.

1.  **Annotations for scope**

    We can define our own annotations for the scope of a dependency. ```@Scope``` annotation is used along with ```@Retention``` to create custom scope annotations. ```@Singleton``` is a built-in annotation which can be used in Dagger 2. If we use the ```@Singleton``` annotation, the dependency in consideration will only be created once during the entire lifecycle of the android application.

1. **Other annotations**

    1. ```@Qualifier```

        This annotation is used to resolve conflicts between two annotations in ```Dagger 2```. 


## Limitations of Dagger 2

Dagger 2 has a few limitations which are mentioned below - 

1. ```Dagger 2``` does not inject fields automatically.

1. ```Dagger 2``` cannot inject private fields. 

1. If you want to use field injection you have to define a method in your ```@Component``` annotated interface which takes the instance of the class into which you want to inject the member variable.