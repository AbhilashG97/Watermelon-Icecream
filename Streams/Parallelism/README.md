# Parallelism Theory 

Theory for parallelism in streams. 

## Side Effects

A method or an expression has a side effect if, in addition to returning or producing a value, it also modifies the state of the computer. 

### Laziness 

An expression, method, or algorithm is lazy if its value is evaluated only when it is required. On the other hand, an algorithm is eager if it is evaluated or processed immediately. 

All intermediate operations are lazy.

### Interference 

Interference occurs when the source of a stream is modified while a pipeline processes the stream. 

## Stateful Lambda Expressions

A stateful lambda expression is one whose result depends on any state that might change during the execution of a pipeline. Its result can vary every time the code is run.