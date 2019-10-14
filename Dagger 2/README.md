## Instructions to run programs

Please type the following in the terminal to run the programs : 

```gradle run -q -PclassToExecute=ClassName -PinputFile=InputFile```

```ClassName``` refers to the name of the program that you are want to run.
<br>
```InputFile``` refers to the name of the input file for a program.

### A useful bash function 

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
grun className inputFile.dat
```
