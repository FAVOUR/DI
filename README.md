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
   7) Injecting  values at runtime using  component.builders and BindsInstance
   8) Scoping with singleton class :You can scope wherever there is annotations with the Inject  provides and module but be sure how you want to scope before you begin.
         However this Approach has a caveat which is, the the ability of the singleton class is limited to a single instance of the  its  component class (CarComponent) because on configuration changes a new instance of the singleton class is created
         A more efficient way could be to instantiate the component class  in the application class.

         Note :
        A) If the module class is Scoped you will as well need to Scope the component class else dagger wil throw an error

   9)Custom Scope and component Dependencies : This is used in the cases where we need to have a single instance of a class just for thr lifecycle of the activity or fragment
       Note :
       This @Singleton component cannot depend on scoped components ie scoped component can be in the overall component class (Carcomponent class and Car class ) and you can use @Singleton in the dependencies (ProvideDriver method and AppLevelComponent class)
       else you will get the error  This @Singleton component cannot depend on scoped components:

  10)Sub components Instead of adding a dependency to a the fields in the component annotation  you can use a sub-component annotation instead which can access all the component (i.e the dependency graph) of the parent component without thr parent component exposing it's component explicitly
     Note :
     You have to create a method that returns the class that was has the  subcomponent annotation the parent Interface Class

  11) Subcomponent builder : It follows the same implementation as the injecting parameters at runtime (number 7 using component.builder) but
   this time it will be subcomponent.builder and then we will do away with the method required to return the  AppLevelScope(Because the subcomponent knows about its parent graph)

  12)  Subcomponent factory :This is a more concise way of implementation then the sub component builder annotation the subcomponent builder is used in cases where the parameters of constructors cannot be skipped though the subcomponent builder id useful in cases where you acn parameters at build time

  13) Component factory :Similar to the  the component factory they only differ because of their annotation because a a class annotated with subcomponent can only have a subcomponent.factory class and vice versa

    ``



## Note

   1) Dagger does dependency injection in this order
   
             A) Constructor injection

             B) Field Injection

             C) Method Injection

   2) When a  method in a module class(Method annotated with @provides) requires an instance variable you cannot use make
       the method static (Which is more efficient than an instance method).

   3)If all of your methods in your modules class are static then make the class abstract.



 
