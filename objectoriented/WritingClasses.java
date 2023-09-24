package objectoriented;


/*
Notes:
Covered in this file:
//> Private Attributes and Public Methods
//> Default vs. Private vs. Public Constructors
//> Accessor Methods (getters)
//> Mutator Methods (setters)
//> Parameters: Pass by Reference or Value?
//> Returns: By Reference or Value?
//> Preconditions and Postconditions
//> Common Overridden Methods: toString() and equals()

 */

public class WritingClasses {
//============================================================================================================================================================================//  
// Private Attributes and Public Methods
  //> Attributes are typically private
    //> Encapsulation: prevent direct access and modification from outside the class
    //> Controlled Access: allow you to control how values are modified
    //> Security: preventing unauthorized access to sensitive data
    //> Maintainability: reduces the ripple effect of modification
  
  private String name;
  private int number;
  private static String shared = "This value is share amongst all instances of the class.";
  
  
  //> Methods are typically public
    //> Encapsulation: provides controlled access to object
    //> Access: allows access to functionality from outside of the class
  public void example() {
    return;
  }
  
  
//============================================================================================================================================================================// 
// Default vs. Private vs. Public Constructors
  //> if no constructor is written -> java provides default no arg constructor
  //> constructors should be public
  //> a private construct prevents instantiating objects outside of the class
  
  /*
  //Private Constructor: for preventing the creation of objects outside of the class.
  private WritingClasses() {
    return;
  }//Should appear by itself when used. 
  */
  
  //Constructor no parameter
  public WritingClasses() {
    name = "default";
    number = 0;
  }
  
  //Constructor overloaded with parameters
  public WritingClasses( String name, int number ) {
    this.name = name;
    this.number = number;
  }

//============================================================================================================================================================================// 
// Accessor Methods (getters)
  //> provide controlled access to private attributes
  //> can be used to control how and what values are returned
 
  public String getName() {
    return name;
  }
  
  public int getNumber() {
    return number;
  }
  
//============================================================================================================================================================================// 
//Mutator Methods (setters)
  //> provide controlled access to modify the internal state of objects
  //> can be used to control how values are modified
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setNumber(int number) {
    this.number = number;
  }
 
//============================================================================================================================================================================// 
//Parameters: Pass by Reference or Value?
  //> Pass by Value (Primitives): a copy of the value is passed to the method
    //> Modifying the passed value does not affect the original
    //> pass a copy of the value

  
  
  //> Pass by Value (Reference Types): a copy of the reference(memory location) is passed to the method
    //> Modifying the passed reference modifies the original
    //> Reference Types (Objects) pass a copy of the reference
  
  
  public static void passByValuePrimitive(int para) {
    para = 10;
    System.out.println("para value: " + para);
    
  }
  
  public static void passByValueObjects(WritingClasses para) {
    para.name = "New Name";
    System.out.println("para references: " + para);
  }
  
  public static void main(String[] args) {
    int num = 0;
    System.out.println("num value before: " + num);
    
    passByValuePrimitive(num);
    System.out.println("num value after: " + num);
    
    
    
    WritingClasses obj = new WritingClasses(); 
    System.out.println("obj reference before: " + obj);
    System.out.println("obj.name before: " + obj.name);
    
    passByValueObjects(obj);
    //Obj has been modified.
    System.out.println("obj reference after: " + obj);
    System.out.println("obj.name after: " + obj.name);
  }
 /*
 
  
  
  
  * best practice is to create a copy of the object 
  * when a mutable object is a construcot parameter, the instance variable should be initialized with a copy of the referenced object. 
  

  * preconditions are conditions tha must be true just prior to the execution of a section of code
  * postconditions are conditions that must always be true afte the execution of a program
  * returns are return by value (makes a copy)
  * toString() method is called when an object is passed to System.out.print() and System.out.println()
  * mutators often void methods that change the values of instance variables
  * accessors
  * good practice not to modify mutible objects that are passed as parameters
  * primitives are pass by value
  * reference types are pass by reference
  * local variables are declared in method bodies and cannot be public/private
  * when a local variable has the same name as an instance variable the local variable is referenced

  */
  

  
  
  
  
  

  
  //Overridden equals from Objects class
  public boolean equals(Object obj) {
    return false;
  }
  
  //Overridden toString() from Objects class
//  public String toString() {
//    return name;
//  }
  
  

}

