# Design Patterns in PHP and Laravel (2017)
__By Kelt Dockins__  
[Github Code](https://github.com/kdocki/larasign)  
There is a branch in the repo for every design pattern.  

### CSharp Examples
Although the book code examples was written in PHP using Laravel framework, I have added my own Dotnet examples written in C#.   
#### Running Dotnet examples  
__Prerequsite__   
Ensure you have the .NET SDK installed. You can download it from the  [official .NET downloads page](https://dotnet.microsoft.com/download).  
Check if you have _dotnet_ running on your machine.  
```bash
$ dotnet --verion
```  
__Build and run a dotnet application__  
Create, build and run a dotnet application as follows:
```bash
# Create a console application
$ dotnet new console -n MyApp
# Build the solution
$ cd MyApp
$ dotnet build
# Run the application
$ donet run
```  
You can add a `.gitignore` file to you newly created application
```bash
$ dotnet new gitignore
```
__Dotnet solution templates__  
To view a list of all the application template or types of application you can create with dotnet CLI do:
```bash
$ dotnet new list
```

__Deploy and distribute__  
If you want to create a distributable version of your application, you can publish it. Use the following command to publish your application:
```
$ dotnet publish -c Release -o publish
```  
This command will create an optimized and platform-specific version of your application in the publish folder.

### The Design Patterns
__Creational__
* Abstract Factory
* Builder
* Factory Method
* Prototype
* Simple Singleton
* Simple Factory  

All the creational patterns focus on producing products.

__Structural__
* Adapter
* Bridge
* Composite
* Decorator
* Facade
* Flyweight
* Proxy

__Behavioral__
* Chain of Responsibility
* Command
* Interpreter
* Iterator
* Mediator
* Memento
* Observer
* State
* Strategy
* Template Method
* Visitor

## Chapter 1: Laravel Basics

## Chapter 2: Let's Grow a SOLID Garden
Checkout the _solid_desing_ branch from the github repo to view sample of code for the SOLID principle  
```
$ git checkout solid_design
```  
and look in the `src` directory.  

__Solid Principles__  
1. __Single Responsibility Principle__  
It states that a class should have a single responsibility.
Don’t take the single responsibility principle too far. The less change a class experiences, the less all these principles really matter.  
2. __Open/Close Principle__  
It states that classes should be open for extension but closed for modification.  
3. __Liskov Substitution Principle__   
Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.  
You should not return a different type from the override method of sub classes than the parent class.
This is not an issue in strongly typed languages like Java or C#.    
4. __Interface Segregation Principle__  
Keeping your interfaces small follows the interface segregation principle: many client-specific interfaces are better than one general purpose interface.  
5. __Dependency Inversion Principle__  
The DIP states that one should depend on abstractions (i.e an interface, or abstract class) instead of concretions (i.e a concrete class).  
Another sure way to pick up on violations of dependency inversion is when you start seeing _new_ keywords in your code.  

One point to note: _dependency inversion is not the same thing as dependency injection_. Another way to do dependency inversion is by using an inversion of control container.

When you violate one of the five SOLID principles, chances are that other principles are being violated as well. The SOLID principles work together in harmony.

## Chapter 3: Abstract Factory
To checkout the abstract factory branch on the sample code
```
$ git checkout abstract_factory
```
and look in the `src` directory.

__Definition__   
The abstract factory provides an interface for creating families of related or dependent objects without specifying their concrete classes.  
Abstract Factory patterns work around a super-factory which creates other factories.  

[GeeksForgeek: Abstract Factory Pattern](https://www.geeksforgeeks.org/abstract-factory-pattern/)

## Chapter 4: Builder
To checkout the abstract factory branch on the sample code
```
$ git checkout builder
```
and look in the `src` directory.

__Definition__  
The Builder pattern separates the construction of a complex object from its representation so that the same construction process can create different representations.  

__Description__  
In the Builder pattern, the building process is delegated to a _Director_ that instructs the _Bulder_ on steps to be taken to build the product. There may be two or more _Builders_ each of which may build the the product using different material in every step of the building process.  

__Implementation__  
We build a house to demonstrate the Builder pattern. Our director is represented by the _Architect_. We also have two Carpenters, _NoviceCarpenter_ and _ExpertCarpenter_ both of which implements the _CarpenterInterface_.  
In the _CarpenterInterface_ the steps required to build the house is represented by methods in the interface.  

## Chapter 5: The Factory Methods
To checkout the factory method branch on sample code
```
$ git checkout factory_method
```

__Definition__   
The factory method defines an interface for creating an object but defers the creation of the object to a subclass.  

__Description__  
Factories are used to replace the _product_ calls constructor so that no logic exists in the _product_ class constructor.  

__Implementation__  
Here we have a Factory which is represented by the _TomatoGarden_. The _TomotaGarden_ factory class extends the _Garden_ abstract class which contains the _harvest()_ abstract method that generate the product an object of the _TomatoPlant_.  
Similarly, we can have another Factory class such as the _OnionGarden_.    
