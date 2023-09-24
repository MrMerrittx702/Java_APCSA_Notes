package functional;
//Java Variables 
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  Covered in this file:
  //> What are Literals?
  //> What are Variables?
  //> Variable Naming Rules
  //> Declaring and Initializing Variables
  //> Using Variables in Operations
  //> Parameters
  //> Instance Variables and Modifiers
  //> Final Variables
  //> Static Variables
  //> Variable Scope 
*/

class Variables {
//============================================================================================================================================================================//
//What are literals?
  //> A literal is the source code representation of a fixed value.
  //> (an actual value, does not represent something else.)
 
//============================================================================================================================================================================//
// What are Variables?
  //> variables are identifiers given to locations in memory that are used to store data. 
  //> a name that has a value that can change (vary)
  //> The memory that associated with a variable holds the literal value of primitive data. 
  //> Variables that hold the same string value reference the same location in memory (called interning)
  //> Variables have default values when declared, but no initialized.

//============================================================================================================================================================================//
// Variable Naming Rules
/*
  Follow these naming rules for creating identifiers for variables, methods, and objects.
  General Naming rules:
    > must begin with a letter
    > may contain letters, digits, underscores and dollar signs
    > start with lower case and no whitespace (camelCase)
    > can begin with $ and _ 
    > names are case sensitive 
    > reserved words cannot be used as names.
    > Use descriptive names to make your code easier to read and maintain
    > Short names are easier to type, but not easy to read
*/
 
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //see Methods.java for an explanation of the 'main' method
   
  //============================================================================================================================================================================//
    //Declaring and Initializing Variables
      //> syntax : type identifier = literalValue;
      //> alias are variables that represent the same value
    
    //declaring a variable
    int num; //> 0
    double duo; //> 0.0
    boolean bool; //> false
    String str; //> null
    
    
    //declaring and initializing a variable
    int initNum = 0;
    double initDuo = 0.0;
    boolean initBool = false;
    String initStr = null;
    
    //Declare multiple variables of the same type with a comma separated list:
    int a = 1, b = 2, c = 3;
    
    //or one value to multiple variables
    a = b = c = 100;
    
    //aliases
    int num1 = num;
    int num2 = num1;
    int num3 = num2;
    // num, num1, num2, num3 are all aliases
    
    
  //============================================================================================================================================================================//
    //Using Variables in Operations
      //> variables can be used in operations in place of literals
    int x = 2;
    int y = 5;
    
    String front = "Hello ";
    String back = "World";
    
    System.out.println(x + y);
    System.out.println(x * y);
    System.out.println(x - y);
    System.out.println(x / y);
    System.out.println(x % y);
    
    System.out.println(front + back);  
  }
  
//============================================================================================================================================================================//
  //Formal Parameters
    //> Formal Parameters appear in the method header
    //> These are special variables for passing values to a method
    //> These variables have a local scope to the method (they do not exist outside the method definition)

//{----IGNORE THIS FOR NOW----}{-----------------FOCUS HERE------------------}
  public static void methodName(int num, double duo, boolean bool, String str) {
    return;                     //In the parenthesis of a method header formal parameters(variables) are declared
  }                             //These variable only exist between the {} of the method
                                //When the method is called actual parameters(arguments) aka values are used to initialize the formal parameters. 

//============================================================================================================================================================================//
  //Instance Variables and Modifiers
    //> instance variables are associated with objects of a class
    //> instance variables are declared in the class definition, and initialized in a special method called a constructor
    //> modifiers determine the accessibility of these variable outside of the declared class
      //> default : accessible in the same package
      //> public  : accessible anywhere
      //> private : only accessible in the declared class
      //> protected : accessible in the same package
    
    //examples
    int num;
    public int num1;
    private int num2;
    protected int num3;
    
    double duo;
    boolean bool;
    String str;
    
//============================================================================================================================================================================//
  // Final Variables
    //> the final keyword prevents a variable's value from being changed
    //> often used for constants
    
    final double pi = 3.14159;

//============================================================================================================================================================================//
  //Static Variables
    //> static means unchanging
    //> static variables belong to the class they are declared in.
    //> static variables are the same for all instances of a class.
    //> typically declared and initialized in the class definition.
    
    static int unchanging = 10;
    
//============================================================================================================================================================================//
  //Variable Scope 
    //> variables have scope (what part of the program they can be accessed from)
    //> variables can only be accessed after they have been declared. 
    //> variables declared in the class definition (fields) are accessible from the entire class
    //> variables declared in a method are accessible in that method only
    //> variable declared inside of a loop, or conditional are accessible in loop/conditional block only
    
    
  //example
    //> A code block is all of the code between curly braces.
    //> code before the variable cannot access it.
    //> code after the variable can access it.
    //> code outside of the curly braces cannot access variables defined inside of the braces.
    //word scope =============================================================//
    String word;                                                              //
                                                                              //
    public static void method(int number) {// number scope~~~~~~~~~~//        //
                                                                    //        //
      for(int spot = 0; spot < 5; spot ++) {// spot scope -----//   //        // 
          continue;                                            //   //        //
                                                               //   //        //
      }// spot scope ------------------------------------------//   //        //
                                                                    //        //
    }// number scope~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//        //
                                                                              //
   //word scope ==============================================================//
    
 
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