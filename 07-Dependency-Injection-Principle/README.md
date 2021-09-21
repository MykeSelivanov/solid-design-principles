# Dependency Injection Principle

## Dependencies
- A Java class has a dependency on another class, if it uses an instance of this class
    - referred to as a class dependency
    - for eg a class which accesses a logger service has a dependency on this service class

- Java classes should be as independent as possible from other Java classes
    - this increases the possibility of reusing this classes and to be able to test them independently from other classes
    
- If Java class creates an instance of another class via the 'new' operator, it cannot be used(and tested) independently from this class
    - this is called a hard dependency

- Dependency injection solves the issue of 'hard' dependencies

## Dependency Injection

#### Dependency Injection is a technique whereby one object supplies the dependencies of another object
- enables you to replace dependencies without changing the class that uses them

#### A Dependency is an object that can be used (service)

#### An Injection is the passing of a dependency to a dependent object (a client) that would use it

#### Allows us to remove the hard-coded dependencies and make our application loosely coupled, extandable and maintainable

#### Dependency Injection is one form of the broader technique of dependency inversion
- it supports the dependency inversion principle

#### The Client delegates the responsibility of providing its dependencies to external code (the injector)

## Roles in dependency injection

#### If you want to use dependency injection, you need classes that fulfill 4 basic roles
- the service you want to use
- the client that uses the service
- an interface that is used by the client and implemented by the service
- the injector which creates a service instance and injects it into a client

#### You already implement 3 of the above roles by following the Dependency Inversion principle
- the service and the client are the two classes between which the dependency inversion principle intends to remove the dependency by introducing an interface
- and the injector is the only role that is not required by the Dependency Inversion principle

#### Injection types
- constructor injection
    - the dependencies are provided through a class constructor <br>
    ```java
// Constructor
Client(Service service){
 // Save the reference to the passed-in service inside this client
 this.service = service;
 }  
```

- setter injection
    - the client exposes a setter method that the injector uses to inject the dependency
    ```java
// Setter method

```
    
- interface injection
    - the dependency provides an injector method that will inject the dependency into any client passed to it 
    - client must implement an interface that exposes a setter method that accepts the dependency
    
 

    


    