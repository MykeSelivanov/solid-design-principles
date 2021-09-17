# Interface Segregation Principle 
Defined by Robert C. Martin, while consulting Xerox to build software for new printer systems
- "Clients should not be forced to depend upon interfaces that they don't use"
    - a client should not implement an interface if it does not use a method in that interface
    - happens, when one interface contains more than one functionality, and the client only needs one functionality and not the other one

#### The goal of the Interface Segregation Principle is to reduce the side effects and frequency of required changes by splitting software into multiple, independent parts

#### Interface design is a tricky job, since once you release yor interface, you cannot change it without breaking all implementation

#### Using the 'interface' keyword in Java means that you have to implement all of the methods in the interface before any class can use it
- If you follow Interface Segregation Principle, you'll have less methods to implement, because each interface will have a single functionality

#### Interface Segregation Principle avoids the design drawbacks associated with a fat interface (interface that has a lot of functionalities), by refactoring fat interface into multiple segregated interfaces
- each segregated interface is a lean interface, as it only contains methods which are required for a specific client
- a lean interface doesn't mean one method per interface
- a lean interface caters to a consumer of a specific type of functionality or a specific set of customers all of whom have the same functional needs


    