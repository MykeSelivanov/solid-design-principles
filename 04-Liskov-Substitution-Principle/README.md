# Liskov Substitution Principle

#### Principle defines that objects of a superclass can be replacable with objects of its subclasses without breaking the application
- requires the objects of subclasses to behave in the same way as objects of superclasses
- methods which use a superclass type must be able to work with the subclass without any issues

#### An overridden method of a subclass needs to accept the same input parameter values as the method of the superclass
- do not implement any stricter validation rules on input parameters than implemented by the parent class, because any code 
that calls this method on an object of the superclass might cause an exception, if it gets called with an object of the subclass

#### The return value of a method of the subclass needs to comply with the same rules as the return value of the method of the superclass
- you can only apply stricter rules by returning a specific subclass of the defined return value or by returning a subset of the valid return values of the superclass

#### In order to follow LSP, the subclass must enhance functionality, but nor reduce functionality

#### LSP is closely related to the Single responsibility principle and Interface Segregation Principle
- if a base class has more functionality than a subclass, then it might not support some of the functionality and therefore does violate LSP

#### LSP extends Open/Closed Principle
- the Open/Closed principle states, that a class should be open for extension and closed for modification:
    - we override the original class and implement the functionality to be changed in the overriding class
    - when the subclass object is used in place of the super-class, the overriden functionality is executed
    - this behavior is exactly in ling with the Liskov Substitution Principle
    