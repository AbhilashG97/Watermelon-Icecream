# Java Regex Basics

This repository will contain the basics of Regex.

## Introduction

The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings. It is widely used to define the constraint on strings such as password and email validation.

Java Regex API provides **1** interface and **3** classes in **```java.util.regex package```**.

## Classes and Interfaces involved

The Matcher and Pattern classes provide the facility of Java regular expression. The ```java.util.regex``` package provides following classes and interfaces for regular expression - 

1. MatchResult interface
1. Matcher class
1. Pattern class
1. PatternSyntaxException

## Regex Quantifiers

The quantifiers specify the number of occurrences of a character.

Below mentioned is a table which contains a summary of all the quantifiers used in Java Regex - 

| REGEX  |                   DESCRIPTION                   |
|--------|:-----------------------------------------------:|
| X?     |           X occurs once or not at all           |
| X+     |           X occurs once or more times           |
| X*     |           X occurs zero or more times           |
| X{n}   |              X occurs n times only              |
| X{n,}  |             X occurs n or more times            |
| X{x,y} | X occurs at least x times but less than y times |

## Regex Metacharacters

The regular expression metacharacters work as shortcodes.

Below is the summary of the shortcodes used in Java Regex:

| REGEX |                        DESCRIPTION                       |
|-------|:--------------------------------------------------------:|
| .     |      Any character (may or may not match terminator)     |
| \d    |             Any digits, short of ```[0-9]```             |
| \D    |           Any non-digit, short for ```[^0-9]```          |
| \s    | Any whitespace character, short for ```[\t\n\x0B\f\r]``` |
| \S    |    Any non-whitespace character, short for ```[^\s]```   |
| \w    |     Any word character, short for ```[a-zA-Z_0-9]```     |
| \W    |       Any non-word character, short for ```[^\w]```      |
| \b    |                      A word boundary                     |
| \B    |                    A non word boundary                   |


