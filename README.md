# Design Patterns Tutorial in Java 
[Tutorials Point -Design Patterns ](https://www.tutorialspoint.com/design_pattern/index.htm)  

### Compiling Java Souce Code with Packages 
1. Create a folder `MyApp` and your source file `HelloApp.java` inside the folder. 
2. Declare the package name at the top of your souce file.   
```
package MyApp

class HelloApp
{
    public static void main(String[] args)
    {
         System.out.println("Hellow World");
    } 
}
```
3. You can have other classes inside the same `MyApp` folder with the same `package` declaration. You can also have sub directories and sub packages e.g `MyApp.MyService` as a sub package name.   
4. Compile the sources 
```
> javac -d bin MyApp/Hello.java
```  
Here `Hello.java`is the class having the main method  

5. In the case of our first design pattern we can compile and run the source as follows: 
First compile the sources 
```
> javac -d bin .\CreationalPatterns\FactoryPattern\FactoryPattern.java 
```
This will generate class files in bin/CreationalPatterns/FactoryPattern directory
Next run the main class file with the `java` interpreter.  
```
> cd bin 
> java CreationalPatterns.FactoryPattern.FactoryPattern
```

### Introduction 
Design patterns are solutions to general problems that software developers face in software development.  
These solutios were obtained by trial and error by numerioud software developers over quite a substantial period of time.  
According to the authors of the _Gang of Four(GOF)_, design patterns are primarily based on the following principles of object orientaed desing:  
* Program to an interface not an implementation 
* Favor object composition over inheritance.  

__Usage of Desing Pattern__    
Desing pattern have tow main usages:  
1. __Common platform for developers:__ They provide a standard terminology and are specific to particular scenario.  
2. __Best Practices:__ They provide the best solutions 

__Types of Design Patterns__   
There are 23 desing patterns which canbe classified in three categories:  
1. __Creational Patterns:__ They provide a way to create objects while hiding the creation logic , rather than instantiating object directly using new operator.      
2. __Structural Patterns:__  They are concerned with class and object composition and inheritance.  
3. __Behavioral Patterns:__ They are conerned with communication between objects.  
4. __J2EE Patterns:__  They are concerned with presentation tier. They are identified by the _Sun Java Center_.   


### Creational Patterns 
1. Factory pattern 
2. Abstract Factory pattern 