//Java Variables 
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  Variables: are the identifiers given to locations in memory that are used to store data. 
    in other words, names for values that can change.

  The memory that assiciated with a variable holds the literal value of primitive data. 

  Follow these naming rules for creating identifiers for variables, methods, and objects.
    General Naming rules:
      > may contain letters, digits, underscores and dollar signs
      > must begin with a letter
      > start with lowercase and no whitespace (camelcase)
      > can begin with $ and _ 
      > names are case sensitive 
      > reserved words cannot be used as names. 
*/

class Variables {

  static void variableScope (){//A code block is all of the code between curly braces.
    //code before the variable cannot access it.
    String scope = "Code after this point can access the variable scope.";
    //code after the variable can access it.
    System.out.println(scope);
    //code outside of the curly braces cannot access variables defined inside of the braces.
  }
  //variables declared inside of a block(method, loop, etc.) have local scope.
  //variables accessible throughout the program have global scope.

  public static void main(String[] args){
  //ignore this above for now, but make sure it is in every program you write or they will not work.
  //Don't worry we will come back to this later.


    //syntax for declaring variable --> type identifier = value ;
    int variable; //This is declaring the variable
    variable = 0; //This is initializing the variable

    //you can do both at the same time;
    int newVariable = 0; 

    //Strings: for words and sentences
    String someText = "Your text here.";

    // Integers: for whole numbers
    int someNumber = 5;

    // Booleans: for true and false values
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
    
    //or one value to multiple variables
    a = b = c = 100;

    //concatenate text and variables with the + operator
    String concatMe = "To concatenate means ";
    String concatenated = concatMe + "to link together in a chain or series.";
    System.out.println(concatenated);

    //or concatenate two variables 
    String concat1 = "Put two ";
    String concat2 = "and two together!";
    String concat3 = concat1 + concat2;
    System.out.println(concat3);

    //the concat() method can be used, but only for strings
    String string1 = "concat";
    String string2 = "enated";
    concatenated =  string1.concat(string2);
    System.out.println(concateneated);
  }
}

/*
Common Errors:
  Forgetting a semicolon ;
  Forgetting quotes ""
  Forgetting the type when declaring the variable
  Redeclaring the variable when changing its value


*/

/*
Practice:
Create a program that prints out your full name, age and answers the true/false question below:
  Booleans come from a form of math called boolean algebra. (true/false)?

*/