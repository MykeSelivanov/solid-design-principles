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


