# Dependency Inversion Principle
Dependency inversion principle states that entities must depend on abstractions and not on concretions
- the goal is to reduce dependencies on concrete classes

#### Abstractions should not depend upon details
- details should depend upon abstractions

#### High level classes must not depend on low level classes
- both high-level classes and low-level classes should depend upon abstractions
- the lower-level classes implementation is accessible to the higher-level class via an abstract interface
- actual implementation of lower level class can then vary

#### The "Inversion" in the name "Dependency Inversion Principle" is there because it inverts the way you typically might think about Object Oriented design
- top to bottom dependency has inverted itself, with both high-level and low-level classes now depending on an abstraction


#### Dependency Inversion removes tight coupling that comes with a top-down design approach 
- each higher class in top-down is tightly coupled with its lower level concrete class:
    - any change in the lower class will have a ripple effect in the next higher level class
    - this top-down approach makes it extremely difficult and costly to maintain and extend the functionality of the layers
    
#### Dependency Inversion principle introduces the layer of abstraction between each higher level class and lower level concrete class 
- higher level classes depend only on a common abstraction
- lower-level classes can then be modified or extendeed without the fear of distributing higher-level classes

#### Dependency inversion provides loose coupling between higher and lower level classes by introducing an abstraction layer
- highly beneficial for maintaining and extending the overall system

#### Object Oriented guidelines for adhering to Dependency Inversion principle
- No variable should hold a reference to a concrete class
    - use the factory design pattern to avoid this
    
- No class should subclass from a concrete class 
    - if you subclass from a concrete class, you are depending on a concrete class
    - sublclass from an abstraction (an interface or an abstract class)
    
- No method should override an implemented method of any of its base classes
    - if you override an implemented method, then your base class was not really an abstraction to start with
    - methods implemented in the base class are meant to be shared by all your subclasses
    
- All above are the guidelines, but not the strict rules that should be followed all the times
    - if you have a class that is not likely to change, and you know it, then it is ok to instantiate a concrete class
    - we instantiate String objects all th time and this violates the principle, however the String class is very unlikely to be changed


    


    