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




    