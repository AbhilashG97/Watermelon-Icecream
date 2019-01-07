# Basics of RxJava 

## Instructions to run programs

Please type the following in the terminal to run the programs : 

```gradle run -q -PclassToExecute=ClassName -PinputFile=InputFile```

```ClassName``` refers to the name of the program that you are want to run.
<br>
```InputFile``` refers to the name of the input file for a program.

### A Useful bash function 

```bash
grun() {
    #used to run gradle build
    # $1 is for the name of the Java file
    # $2 is for the name of the input file
    gradle run -q -PclassToExecute=$1 -PinputFile=$2
}
```

:warning: You can add the above function to your ```.bashrc``` file to use the ```grun function```.

**Usage of grun**

The syntax for the ```grun function``` is as follows:

```bash
grun ClassName.packageName inputFile.dat
```

## Theory

### RxJava Subjects

**What is a Subject?**

A Subject is a sort of bridge or proxy that is available in some implementations of ReactiveX that acts both as an observer and as an Observable. Because it is an observer, it can subscribe to one or more Observables, and because it is an Observable, it can pass through the items it observes by re-emitting them, and it can also emit new items.

There are 4 types of Subject - 

1. PublishSubject
1. ReplaySubject
1. BehaviourSubject
1. AsyncSubject

**PublishSubject**

It emits all the subsequent items of the source Observable at the time of subscription.

**ReplaySubject**

It emits all the items of the source Observable, regardless of when the subscriber subscribes.

**BehaviourSubject**

It emits the most recently emitted item and all the subsequent items of the source Observable when an observer subscribes to it.

**AsyncSubject**

It only emits the last value of the source Observable(and only the last value) only after that source Observable completes.
