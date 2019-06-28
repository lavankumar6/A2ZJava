# A to Z Java - Learn , Share and Collaborate.

This is the place i want to store all my learnings and practise examples about about the JAVA. I am going to include all the Java Examples i come across from day to day work life. 

> **One Word: Finally Share Knowledge to Gain the Knowledge**

## CORE JAVA
###  Language Fundamentals
  * **ABOUT JAVA**
    
    Java is nothing but the ```programming language``` and also a platform.
    When talking about the Java , we need to say it is a high level language that can be popupalarized by following keywords.
    - ***Simple***
      
      It is the simple programming language where it is easily readable by humans rather program languages like PASCAL, C etc.
      In Java, all the programs written have the extention ```.java``` , these are called ```source files``` i.e. where we write
      the java program in simple human readable format.
      Java uses the ```javac``` command to compile the java source program , where it can be understand by computer. Computer generally
      understands only 1's and 0's. all this work done by Java Compiler. Here ```.class``` is created out of java compiler such that
      computer can understand it correctly and perform the tasks written in JAVA source program.
      Again, this ```.class``` is processed with help of JVM Java Virtual Machine , where all 1's and 0's are created for machine
      understable language.
    - ***Object Oriented***
      
      It means using a methodology which enables a system to be modeled as a set of objects which can be controlled and 
      manipulated in a modular manner.
      
      Everything revolves around the objects in the JAVA programming language. 
      Object is a model in which programs are organized around the data called object , rather than the functions and logics.
      A object is nothing but data field that have the unique attributes like properties and behaviour.
      
      
    - ***Platform Independent and Portable***
    
      A platform is the hardware or software environment in which a program runs. eg Microsoft Windows, Linux OS, Apple OS.
      Java is famous becuase of it one of the features called Platform independent, with slogan ```write once and run 
      anywhere.``` 
      Whenever the Java program is compiled, the ```javac``` compiler will generate the ```.class``` file .
      This ```.class``` file can be used in any platform to generate the platform dependent code 
      (JVM on the platform generates it corresponding binary file which is understantable respectively platforms 
      i.e. if we are running in windows, JVM generates a windows understandable binary file,
      so that system will correct output to console.)
      That's how we can say Java is Platform Independent and makes easy to portable.
      
    - ***Multi Threaded and Dynamic***
      
      A Thread is nothing a but single process of the execution within a program. In simple terms, 
      we can say it is independent path of execution through the given program. For example consider the task, where 
      user is required to build the road in a given street. We use a 10 to 15 workers to do the work , based on the amount of the
      work. Here the work is divided into 3 parts 
      -- mix the material(sand,cement etc) 
      -- clear the path and lay the material on the path
      -- make it even on the path.
      All workers are capable to do all divided parts of the work. consider all workers , work at same pace . 
      We can firmly say that more no of workers will finishe job sooner than less of workers working on the task.
      In the above eg, consider each worker to a thread and process of building road as the program . 
      we assign 15 threads to do the task faster . each thread is independent of work and do the same the job here.
      This whole concept is called multi threading environment. 
      
    - ***Secure and Robust and High Performance.***
      
      Any program or application is called as secure and robust when it is not easy to hack and performe with small amount of memory.
      
      
    
  * The Java Environment
  
    Use this link for [The Java Environment](https://www.geeksforgeeks.org/setting-environment-java/)
    
  * Installation
    
    Use this link for [official JAVA Installation guide](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html)
    
  * Java Source File Structure
  * Compilation & Executions
  * Basic Language Elements.
  * Data Types
  * Variables
  * Identifiers
  * Lexical Tokens, Identifiers
  * Keywords, Literals, Comments
  * Primitive Data types
  * Operators
  * Condition Statements
  * Control Statements
  * Arrays
  * Command line Arguments
  * Working with Eclipse IDE
  * Creating a Java Project
  * Type Casting
  * Enum Type
  * Varags
###  Object Oriented Programming
* OOPS Fundamentals.
* Object & Object reference.
* Constructors.
* Method Overloading,Recursion.
* Access Specifiers & Access Modifiers.
* Design of Accessor and Mutator Methods.
* Inheritance
* Inner Class & Anonymous Classes
* Abstract Class
* Interfaces
* Cloning Objects, shallow and deep cloning
* Encapsulation
* Polymorphism
* Reflection
  * API
  * String
  * String Buffer
  * String Builder
  * String Tokenizer
  * Interfaces
###  Packages
* Organizing Classes and Interfaces in Packages
* Package as Access Protection
* Defining Packages
* CLASSPATH Setting for Packages
* Making JAR Files for Library Packages
* Import and Static Import
* Naming convention for Packages

###  Exception Handling
* The idea behind Exception
* Exceptions & Errors
* Types of Exception
* Control Flow In Exceptions
* JVM reaction to Exceptions
* Use if try,catch,finally,throw,throws in Exception Handling
* In-built and User Defined Exceptions
* Checked and Un-Checked Exceptions
* Multi Threading
* Understanding Threads
* Needs of Multi-threaded Programming
* Thread Life-Cycle
* Creating Child Threads
* Multi Threads in a program
* Thread Priorities
* Synchronizing Threads
* Inner Communication of Threads
* Critical Factor in Thread DeadLock

###  Input/Output Operation in Java(java.io Package)
* Streams and the new I/O Capabilities
* Understanding Streams
* The Classes for Input and Output
* The Standard Streams
* Working with File Object
* File I/O Basics
* Reading and Writing to Files
* Buffer and Buffer Management
* Formatted Input/Output
* Sequence Input
* Random Access
* Serializing Objects
* Character Streams
###  Collections Framework & Utility Classes
* Utility Methods for Arrays
* String Tokenizer
* Observable and Observer Objects
* Date & Time
* Data structures
* Timer and Timer Task for Job Scheduling
* Using Scanner
* Regular Expression
* Collections of Objects
* Colletion Types
* List
* Set
* Map
* Understanding Hashing
* Use of ArrayList & Vector
* Hashtable & HashMap
---
## ADVANCED JAVA
###  Database Programming using JDBC
* Introduction to JDBC
* JDBC Drivers & Architecture DriverManager, Connection, Statement, Resultset
* CRUD Operation using JDBC Prepared Statement
* Calling SQL functions, Database stored
* proceduresCallableStatement ResultSetMetaData & DatabaseMetadata Connecting to non-conventional Databases
* Overview of Database Driver Architecture &
* JDBC Driver Types Batch Updates Scrollable Resultset Updated Resultset Working with Rowsets
* Handling Binary Data(Operation on Image files) Using Savepoint
* Connection Pooling
###  Servlets
* Need of Server side Programming
* Comparison with CGI
* Architecture and challenges of Web Application Introduction to Servlets
* Servlet Life Cycle
* Developing and Deploying Servlets Generic Servlets
* ServletConfig, Servlet Context, ServletRequest, ServletResponse Database Operation Using Servlets
* Deploying Servlets in Apache Tomcat Server, Weblogic Server etc Exploring Deployment Descriptor(web.xml)
* HttpServlets
* Session Tracking & Management Transferring Request
* Accessing Web Context
* Passing INIT and CONTEXT Parameter Filtering Request and Response
* Filter Servlets Servlet Chaining
* Include & Forward Mechanism
###  Java Server Pages
* Basic JSP Architecture
* Life Cycle of JSP
* JSP Tags and Expressions Comparison with Servlets & JSP
* Scriptlets, Declarations, Expressions & Directives
* JSP to Servlets & Servlets to JSP Java Beans in JSP
* JSP Session
* JSP Scope
###  Hibernate Framework
* Hibernate Overview and Benefits
* Configuring Hibernate
* Features of ORM Framework
* Working with sessions and Persistent Objects
* Logging-log4j Overview and configuration for Hibernate CRUD Operations
* HQL- Hibernate Query Language
* Named Queries, Projection Queries, Aggregate Queries
* Query By Criteria
* Query BY Example
* Persistent, transient, and detached objects Hibernate first-and secong-level cache Object Relationship Overview
* Mapping Collections of Value Objects Entity Relationships: 1-N, N-1, N-N, 1-1
* Queries Across Relationships(Lazy and Eager) Native SQL queries
* Inheritance Mapping
* Collection Mapping Versioning
###  WebServices - REST
* Introduction to Web services
* Web service Architecture
* Interoperability
* RESTful Webservices using jersey
* GET PUT POST DELETE RESTFUL webservices flow
###  Spring Framework
* Introduction to Spring Framework
* Inversion of Control Pattern
* Dependency Injection
* IoC Container, Spring Containers
* Simple Spring Examples
* Spring MVC
* Spring Modules Spring Core Module Spring DAO Module Spring ORM Module Spring JEE Module
* Spring Web MVC Module Spring AOP
* Transaction Management in Spring Spring Integration with Web Services Spring Integration with Java Mail Spring Remoting
* AspectJ pointcut expression language
###  Junit
* Introduction
* Writing Tests
* Creating Dynamic and Parametrized Tests
* Extending Junit
###  Maven
* Introduction
* ANT vs Maven
* Maven Structure
* Maven Dependencies
* Maven Repositories
* Maven Plugins

*************************************************************************************************************************************
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
