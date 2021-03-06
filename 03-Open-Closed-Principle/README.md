# Open Closed Principle
## Robert C. Martin considered this principle as the "the most important principle of object-oriented design"

#### Classes and methods should be open for extension (new functionality) and closed for modification
- a class should be easily extendable without modifying the class itself

#### A module is said to be open, if it is still available for extension
- it should be possible to add fields to the data structures it contains, or new elements to the set of functions it performs

#### A module is said to be closed, if it is available for use by other modules
- assumes that the module has been given a well-defined, stable description

#### General idea of open closed principle is that it tells you to write your code so that you will be able to add new functionality without changing the existing code
- prevents situations in which a change to one of your classes also requires you to adapt all depending classes
- reduces tight coupling

#### In modern object-oriented programming Open-Closed Principle was redefined and if often referred as Polymorphic Open-Closed Principle
- uses interfaces instead of super classes to allow different implementations
- interfaces can be reused through inheritance, but implementation need not be
- can easily substitute without changing the code that uses them: multiple implementations can be created and polymorphically substitute for each other

#### Interfaces are closed for modifications
- you can provide new implementations to extend the functionality
- new implementations must implement the interface
- interfaces introduce and additional level of abstraction, which enables loose coupling; interfaces are independent of each other and don't need to share any code(usually)

