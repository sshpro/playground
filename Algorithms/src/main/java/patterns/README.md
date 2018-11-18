# [Design Patterns](https://en.wikipedia.org/wiki/Software_design_pattern)

* Creation -  Instantiation of objects Ex: Singleton, Factories
* Behavioural - Responsibilities and communication between objects Ex: Strategy, Command
* Structural - Composition and relations Ex: Adapter, Decorator 

## Creational
### Singleton
Restricts instantiation of class to one instance & provides global access to that instance

In this example ```AppExecutors``` is singleton, which gives access to three thread executor for different purpose 
in this particular example MainThread, I/O thread and Network thread, anything you do in your app relating to these things you 
use these 3 thread executor which are singleton and can be accessed throught the app.

### Builder
 * This pattern used to create object from bunch of other complex objects
 * Hide the creation of objects from client & same time the target object as well 
 * Example are when you want to add more configuration 
 * In this project I use simple ```Builder``` to buid ```Notification``` which is made up of more complex objects ```Title```, ```Message```, ```Contact```, and ```Attachments``` etc. Here once the food is ready automated notification is sent based on different configuration client wanted.

### Factory Method
* Factory method pattern uses factory methods to deal with the problem of creating objects
without having to specify the exact class of the object that will be created
* This is done by creating objects by calling factory method - either specified in an interface and implemented by child classes,
or implemented in a base class and optionally overridden by derived classes instead of calling constructor
* In this example createFood on ```TakeAway``` is abstract method which is implemented by child classes.
* Problem this pattern is trying to solve is, if you have multiple types food created by multiple takeaways let them handle the creation


### Abstract Factory
In this ex: lets assume that London has ```IndianTakeAway```, ```ChineseTakeAway``` and ```ItalianTakeAway```

Lets say as good will on August 15th(Indian Independence day) all TakeAways in London sell Indian Food

Does ```ChineseTakeAway``` need to create ```IndianFoodFactory``` for one day ? think about it

This is where Abstract factory pattern will come into picture, lets modify Food TakeAways to be abstract

Don't get confused with TakeAway and Factory in the example.

So in this case FoodTakeAway (from factory method pattern ) is modified to "have" abstract factory is now called ```TakeAwayWithAbstractFactory```

Note that in example ```ChineseTakeAway``` which is now ```ChineseTakeAwayWithAbstractFactory``` has two constructor
one default constructor which actually by default creates ```ChineseFoodFactory``` however if you notice the super class constructor
```ChineseTakeAwayWithAbstractFactory``` can accept any factory . this is where ```ChineseTakeAway``` can pass ```IndianFactory``` on Independence day :)

This allows further abstracting creating objects, and is promoting "open/close" solid principle.

## Behavioural
### Command
  Definition : Encapsulates a request(command), there by letting you parameterise the other objects with these commands, 
  commands have execute method and an optional unExecute method as well
  In the example here, Invoker i.e ```TVRemote``` sends the command to receiver i.e ```TV```
   
