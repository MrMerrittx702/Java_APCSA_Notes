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
  
 /*
  * public vs. private
  * attributes private
  * methods public
  * constructors public
  * accessor and mutator methods getters vs sette4rs
  * objects are pass by reference meaning if the object is mutable you could changes its value in other locations
  * best practice is to create a copy of the object 
  * when a mutable object is a construcot parameter, the instance variable should be initialized with a copy of the referenced object. 
  * no constructor is written -> java provides default no arg constructor
  * comments are ignored by the compiler
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
  
  String name;
  
  //Constructor no parameter
  public WritingClasses() {
    
  }
  
  //Constructor overloaded with parameters
  public WritingClasses(String name) {
    
  }
  
  //Mutator/Setter
  public void setName(String name) {
    this.name = name;
  }
  //Accessor/ Getter
  public String getName() {
    return name;
  }
  
  //Overridden equals from Objects class
  public boolean equals(Object obj) {
    return false;
  }
  
  //Overridden toString() from Objects class
  public String toString() {
    return name;
  }
  
  

}

