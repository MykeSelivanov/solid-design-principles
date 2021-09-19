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



    


    