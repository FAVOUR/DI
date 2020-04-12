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

 ```



## Note

   Dagger does dependency injection in this order
   
     1) Constructor injection
     
     2) Field Injection
     
     3) Method Injection


 
