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
1. Factory Pattern 
2. Abstract Factory Pattern 
3. Singleton Pattern
4. Builders Pattern 
5. Prototype Pattern

__Factory Pattern__  
Factory pattern provides one of the best ways to create an object. We create object without exposing the creation logic to the client and refer to newly createed object using a common interface.  

__Abstract Factory Pattern__    
Abstract factory pattern uses a super-factory also known as factory of factories.   
The super factory creates factories having a common base abstract class.   
The factories created are then used to create objects with common interface just as in the _factory pattern_.  

__Singleton Pattern__  
The singleton pattern involves a single class which is responsible to create an object while making sure that only a single object of the class gets created.  

__Builders Pattern__  
Builder patterns builds a complex object using simple objects and using a step by step approach.  
The bulder is independent of other objects.  

__Prototype Pattern__  
In prototype pattern a clone of the desired object is created, when the object is needed, to maximax performance.   
This pattern is used when creation of the an object is costly. For example and object is to be created after a costly database operation. We can cache the object and return its clone on the next request and update the database as and when needed thus reducing database calls.  


### Structural Patterns 
1. Adapter Pattern 
2. Bridge Pattern 

__Adapter Pattern__  
Adapter pattern works as a bride between two incompatible interfaces.   
It onvolces a single class which is responsible to joinfunctionalities of independent or incompatible interfaces.   

__Bridge Pattern__  
Bridge is used when we need to decouple an abstraction from its imlementation so that the two can vary independently.  
It does this by providing a bridge strcuture between them.    
This pattern involces an interface which acts as a birdge which make the functionality of concrete classes independent from interface implementer class. Both types of classes can be altered structurally without affecting each other.      
