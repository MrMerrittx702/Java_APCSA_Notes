/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

//Java Variables


class Variables {
  public static void main(String[] args){

//Follow these naming rules for creating identifiers for classes, objects, methods, and variables.
    /*General Naming rules:
      > may contain letters, digits, underscores and dollar signs
      > must begin with a letter
      > start with lowercase and no whitespace (camelcase)
      > can begin with $ and _ 
      > names are case sensitive 
      > reserved words cannot be used as names. 
    */



    //syntax for declaring variable --> type identifier = value ;
    int variable; //This is declaring the variable
    variable = 0; //This is initializing the variable
    //you can do both at the same time;
    int newVariable = 0; 

    //Strings
    String someText = "Your text here.";

    // Integers
    int someNumber = 5;

    // Boolean
    boolean someBool = true;


    // Identifiers are unique names that identify variables. 
    // Use descriptive names to make your code easier to read and maintain
    String firstName = "John";//this is easier to read. 
    //or
    String k = "John";// this can be confusing in large code files
    
    
    //print a variable to the console with System.out.print(<identifier>);
    System.out.println(someText);
    System.out.println(someNumber);
    System.out.println(someBool);

    //you can assign a new value to a variable without redeclaring a variable. 
    someText = "Some new text.";
    someNumber = 2;
    someBool = false;

    //use final to prevent a variable from being overwritten
    final String finalWord = "cannot change me."; 
    //finalWord ="Trying to change the finalWord variable generates an error."

    //Declare multiple variables of the same type with a comma seperated list:
    int a = 1, b =2, c = 3;
    
    //or one value to multipe variables
    a = b = c = 100;

    //concatenate text and a variables with the + operator
    String concatMe = "To concatenate means ";
    String concatenated = concatMe + "to link together in a chain or series.";
    System.out.println(concatenated);

    //or concatenate two variables 
    String concat1 = "Put two ";
    String concat2 = "and two together!";
    String concat3 = concat1 + concat2;
    System.out.println(concat3);

  }
}