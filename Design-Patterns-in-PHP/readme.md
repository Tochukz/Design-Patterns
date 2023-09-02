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
You should not return different a type from the override method of sub classes than the parent class.
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
