# Programming to an Interface

#### "Program to an interface" really means "Program to a supertype"
- the declared type of the variables should be a supertype, usually an abstract class or interface
- the objects assigned to those vars can be of any concrete implementation of supertype
- class declaring those vars doesn't have to know about actual object types

#### Do not declare variables to be instances of a particular concrete class

#### Always program for the interface and nor for implementation
- will lead to flexible code which can work with any new interface implementation

#### Programming to an interface is a common theme of the design patterns





