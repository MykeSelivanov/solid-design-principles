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




    