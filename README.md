# Dependency Injection with Kotlin


## The Dependency injection done in this repo includes



 ```bash

  1) Constructor Injection
  2) Field Injection
  3) Method Injection : Done when the injected object is is a is needed in a dependency
  4)Modules and provider Method:
     A) This is used in cases where we use libraries that where not created in the project (ie in situations where we cannot add the @Inject annotation to the constructor or in cases)
     B) In cases where  we need to do some configuration after instantiation of a class .
   The module creates the adds the object to the dependency graph through the provider is used to instantiate the class.In the example the Wheel class will act as the class that we are not allowed to add the @Inject
      annotator.
   5) Injecting with Binds Annotation : In this case the we have to extend an interface and use the concrete object and inject it a s a dependency into a constructor
   6) Injecting values at runtime :In this case the value is passed on the instantiation of the dagger component class hence the create method will be disabled during the instantiation of the component class

 ```



## Note

   1) Dagger does dependency injection in this order
   
             A) Constructor injection

             B) Field Injection

             C) Method Injection

   2) When a  method in a module class(Method annotated with @provides) requires an instance variable you cannot use make
       the method static (Which is more efficient than an instance method).

   3)If all of your methods in your modules class are static then make the class abstract.

 
