//Java Encapsulation
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.htm

/**
Notes:
  Encapsulation is used to hide sensitive data from users
    declare class variables/attributes as private
    provide public get and set methods to access and update the value of private variables

  Getters and Setters
    the 'get' method returns the variable value, and the set method sets the value.

*/

  public class Encapsulation{
  private String attribute; //private restricts access to the class it is apart of

  //Getter
  public String getAttribute(){
    return attribute; //returns the value of the variable "attribute"
  }
  
  //Setter
  public void setAttribute(String newAttribute){
    this.attribute = newAttribute;//accepts the parameter newAttribute and assigns it to the 'attribute' variable.
    //'this' refers to the current object.

  }

  public static void main(String[] args){


  }
}

/*
Common Errors:

*/

/*
Practice:

*/