# Delegation principle

### Delegation is the concept of one class "delegating" its behavior to another class
- don't do all stuff by yourself, delegate it to respective class

### Delegation can be viewed as a relationship between objects where one object forwards certain method calls to another object, called its delegate

### Delegation is an extreme example of object composition
- shows that you can always replace inheritance with object composition as a mechanism for code reuse

### Better than inheritance for many cases
- it does not force you to accept all the methods of the super class
- you can provide only the methods that really make sense

#### Advantages
- primary advantage is run-time flexibility  - makes it easier to compose behaviors at run-time and to change the way 
they are composed
- delegation is a good design choice only when it simplifies more than it complicates
- design patterns with delegation - state, strategy, visitor

