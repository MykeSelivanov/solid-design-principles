# Programming to an Interface

#### "Program to an interface" really means "Program to a supertype"
- the declared type of the variables should be a supertype, usually an abstract class or interface
- the objects assigned to those vars can be of any concrete implementation of supertype
- class declaring those vars doesn't have to know about actual object types

#### Do not declare variables to be instances of a particular concrete class

#### Always program for the interface and nor for implementation
- will lead to flexible code which can work with any new interface implementation

#### Programming to an interface is a common theme of the design patterns

#### Abstract class vs Interface
- with support of default methods in Java 8, gap between abstract class and interface has been reduced

- variables in interface are public static final, abstract classes can have other access modifiers

- methods in interface are public or public static, methods in abstract class can be private and protected

- utilize abstract classes to establish relationship between interrelated objects: when you want to share code
amongst several closely related classes, then common state or behavior can be put in abstract class

- utilize interfaces to establish relationship between unrelated classes: for eg interfaces Comparable and Clonable are implemented by many unrelated classes

- utilize interfaces if you want to specify the behavior of a particular data type, but are not concerned, who implements this behavior

- utilize interfaces if you want to take advantage of multiple inheritance

- you might create an interface and then have abstract class implement that interface




