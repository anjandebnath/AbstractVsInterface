## Interface
Interface is a blueprint for your class that can be used to implement a class ( abstract or not)

## Abstract class
  Abstract classes are a bit different from interfaces. These are also used to create blueprints for concrete classes but abstract classes may have implemented methods. But to qualify as an abstract class, it must have at least one abstract method. Abstract classes can implement one or more interfaces and can extend one abstract class at most.
  

This [Link](https://medium.com/modernnerd-code/java-for-humans-abstract-classes-interfaces-aa4b2ee37418) will give you clear idea about when to use what.

### When to use Abstract class
An abstract method is a method that has no body and requires subclasses of the abstract class its in to implement its body.
 
This is useful when you have a method that you want all subclasses to have but you want to leave it up to the different subclasses to implement the method how they want. Further, a subclass of an abstract class must implement all of its abstract methods.

Take the Human class’s attack() instance method. 
- We want every subclass of the Human class to have a method of attacking another Human opponent,but we expect each subclass to have a different way of attacking. 
- We should make our attack() method abstract instead of implementing it in the Human class as well as every subclass. 

- That way, we won’t be able to forget to implement it in every subclass and we will keep our code clean by not writing expectantly useless code in our superclass. 

### When to use Interface

Take the Character class's all general method.

We expect all characters to be able to attack other characters, defend themselves from attacks, jump, and heal themselves among other functions. 

These functions are functions all characters can perform, not only Human instances: