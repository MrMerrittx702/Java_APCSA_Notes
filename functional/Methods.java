package functional;
//Java Methods
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 

*/

/**
Notes:
    Covered in this file:
    //> Method Syntax
    //> Access Modifiers
    //> Static vs. Non Static Methods
    //> Return types
    //> Formal vs. Actual Parameters (parameters vs. arguments)
    //> Overloaded Methods
    //> Overridden Methods
    //> Recursive Methods
    //> Special Methods (Constructors and 'main') 
    
    Methods enable code sharing an reuse.
    They are also used to modularize code or break it up into parts that are easier to work with. 
    Methods employ procedural abstraction allowing a programmer to use the method by knowing what the method does even if they do not know how the method is implemented. 
    We declare and initialize variables, but define and call methods
    > declaring usually involves the allocation of memory.

    //> Code is executed from the beginning(top) to the end (bottom) and left to right.
    //> Scope is the area of a program where a variable is accessible. 
    
*/

public class Methods{
//Java Methods are blocks of code that are only run when called (like a function or procedure in other languages)

/*
Method Syntax
    accessModifier keyword returnValueType methodName(list of parameters){ 
        //Method Code block
    }


    This is the method header:
        accessModifier keyword returnValueType methodName(list of parameters)

    This is the method signature:
        methodName(list of parameters)
        
*/
//{------------------METHOD HEADER---------------------}
//                   {--------METHOD SIGNATURE---------}
  public static void example(String para1, String para2) {
    return;
  }



//============================================================================================================================================================================//
//Method Access Modifiers (default, public, private, protected) 
    //> methods are usually public so that they can be used outside of the class
    //> see Modifiers.java for more

    void defaultVoidMethod(){ //>package and subclass access only
        return;
    }

    public void publicVoidMethod(){//> any class access
        return;
    }

    private void privateVoidMethod(){//> declared class access only
        return;
    }

    protected void protectedVoidMethod(){//> package and subclass access only
        return;
    }

    //> default, public, private, and protected are combined with keywords and return types in method signatures
//============================================================================================================================================================================//
//Static vs Non Static Methods
    //> 'static' can be defined as unchanging
    //> In this context static indicates that the method is the same for all instances of the class
    

    //Static Method
    public static void staticMethod(){
        return;
    }
    //> static methods do not require an object to call
    //> static methods are called with the class name in other classes


    //Non Static Method
    public void nonStaticMethod(){
        return;
    }
    //> non static methods require an object
    //> non static methods have access to an object's instance variables 

//============================================================================================================================================================================//
// Return Types
    //> methods require a data return type
    //> 'void' is the return type for methods without a return value
    //> 'return' is the keyword used to indicate the value to be returned
    //> the return is what the method brings back when called
    //> methods that do not return can use a return statement to terminate the method.
    //> return statements can evaluate expressions
    //> return statements end the method (code after return will not be executed)
    //> the return value is returned to the point in the program where the method was called
    //> return does not print, and if you do not store/use the return value it is forgotten

    public static void voidReturnMethod(){
        return; //ending the method
    }

    public static int intReturnMethod(){
        return 1;
    }

    public static boolean boolReturnMethod(){
        return true;
    }

    public static double duoReturnMethod(){
        return 3.14;
    }

    public static String strReturnMethod(){
        return "Hello World";
    }

    public static int arithmeticExpressionReturnMethod(){
        return 5 + 2 + 1 - 3 * 5 / 2;
    }

    public static boolean booleanExpressionReturnMethod(){
        return true && false || true; 
    }

//============================================================================================================================================================================//
// Formal vs. Actual Parameters (parameters vs. arguments)
    //> Formal parameters (parameters) appear  in the method header
    //> Actual parameters (arguments) appear when the method is called 
    //> Formal parameters declare the type and name of a variable
    //> Actual parameters (arguments) provide the actual values of the formal parameters
    //> Parameters are passed using call by value. The formal parameters are intialized with copies of the actual parameters.
    //> Formal/Actual parameters are separated with a comma
    //> Formal/Actual parameters must appear in the same order
    //> There can be as few or as many parameters as needed
    //> parameters have a local scope meaning they only exist inside the method definition
    //> variables declared and initialized inside methods also have a local scope
    
    public static void methodWithParameters(int num, boolean bool, double duo){
        System.out.println(num);
        System.out.println(bool);
        System.out.println(duo);
        return;
    }
    //> see line 309 - 320 for the method calls and actual parameters
    
    
    //>Variable Length Arguments (varargs)
    //> type... allow you to pass multiple arguments of type without specifying the exact number 
    public static void methodWithVariableLengthParameters(String... strings) {
    
      for(String str : strings) {
        System.out.print(str + " ");
      }
      
    }


//============================================================================================================================================================================//
// Overloaded Methods
    //> overloaded methods have the same name, but a different type or number of parameters. (different signatures)
    //> overloaded methods can have a different return type
    //> often used with constructors
    //> overloading methods can make programs clearer and more readable. 
    //> methods that perform the same function with different parameters should be given the same name.

    public static void overloadedMethod(){
        return;
    }
    
    public static void overloadedMethod(String str){
        return;
    }

    public static void overloadedMethod(int num){
        return;
    }

    public static void overloadedMethod(double duo){
        return;
    }

    public static void overloadedMethod(boolean bool){
        return;
    }
    
    //Example
    public static int add(int x, int y){
        return x + y;
    }

    public static double add(double x, double y){
        return x + y;
    }


//============================================================================================================================================================================//
// Overridden Methods
    //> overridden methods are methods inherited from another class that are given a different implimentation
    //> commonly overridden methods include equals() and toString() from the 'Object' class
    //> overridden methods must have the same signature(returnType methodName (list of Formal Parameters))

    //overridden from Object.equals()
    public boolean equals(Object obj){
        if (this == obj) {
        return true;
        }
        
        obj = (Methods) obj;
        if(this.toString().equals(obj.toString())) {
          return true;
        }
        return false;
        
    }

    //overriden from Object.toString()
    public String toString(){
        return this.str;
    }

//============================================================================================================================================================================//
// Recursive Methods (call themselves)
    //> recursive methods call themselves
    //> must have a halting condition to prevent infinite recursion
    //> see Recursion folder for more

    public static int recursiveMethod(int n){
        if(n >= 1){//> halting condition
            System.out.println(n); //>to help visualize what is happening
            return 1;
        }
        System.out.println(n); //>to help visualize what is happening
        return recursiveMethod(n - 1) + n; //> recursive call
        //> the method progressively calls itself each time reducing the value of n by 1.
        //> this method returns the sum of all values from 0 to n.
    }

//Special Methods (Constructors)
    //> a constructor is a special method used to instantiate object instance variables
    //> set the initial state of an object
    //> a constructor has the same name as the class
    //> constructors have no return type
    //> if a constructor is not a defined there is a default constructor for the class
    //> constructors are often overloaded 
    //> a 0 parameter/arguments constructor initializes default values
    //> a constructor is called when an object of a class is created. 
    //> What is the purpose of a constructor? Answer: constructors initialize instance variables
    private int num; private double duo; private boolean bool; private String str;
    
    // 0 parameters/arguments constructor
    public Methods(){
        this.num = 1;
        this.duo = 3.14;
        this.bool = true;
        this.str = "Hello World";
    }

    //Overloaded
    public Methods(int num, double duo, boolean bool, String str){
        this.num = num;
        this.duo = duo;
        this.bool = bool;
        this.str = str;
    }

//============================================================================================================================================================================//
//Special Methods ('main')
    //> the 'main' method is special method  that acts as the starting point for the execution of a program
    //> has a special signature

    //This method must have this exact header
        //> String[] args is an array that stores command line arguments to be used in the program.
    public static void main(String[] args){

        
        

        //Below methods defined in the sections above will be called. 
            //> Methods can be called in other methods
            //> Unless specified non static methods called inside of nonstatic methods will refer to the same object
            //> non static methods called in static methods must specify an object
            //> calling/invoking a method is the same thing
            //> a method call interupts the sequential execution of a program, executing the method statements first, then returning to the point immediately following the method call. 

        //Instantiating objects to be used with Non Static Methods
        Methods myObject1 = new Methods(); // calling the no parameter/args constructor
        Methods myObject2 = new Methods(2, 2.17, false,"Goodbye World");// calling the constructor


        //Calling Static Methods
        staticMethod(); //> Only works when called in the same class it was created.
        Methods.staticMethod(); //> Class.staticMethodName() works in all classes that have access to the method.
        //> With Return
            //> the return value is returned to the point in the program where the method was called
        intReturnMethod();//> Returns the value 1 to this point in the program
        Methods.intReturnMethod(); //> Returns the value 1 to this point in the program

        //Calling Non Static Methods
        myObject1.nonStaticMethod(); 
        myObject2.nonStaticMethod(); //> object.methodName() works anywhere that the object exists and has access to the method

        //> With Return
        myObject1.toString(); //> Returns the value "Hello World" to this point in the program
        myObject2.toString(); //> Returns the value "Goodbye World" to this point in the program


        //Calling a method with parameters
            //> Actual parameters(arguments) are values passed to the parameters created when defining the method.
            //> Actrual parameters(arguments) are pass by value to methods meaning we provide the value not a reference to it.
        methodWithParameters(5,false,1.68);
        Methods.methodWithParameters(5,false,1.68);
        
        add(2,2); //> Static with Parameters only works in the class it was defined 
        Methods.add(2,2); //> Static with Parameters

        myObject1.equals(myObject2);//> Non Static with Parameter


        //Calling recursive method
        recursiveMethod(5);
        Methods.recursiveMethod(5);


    }
}

/*
Common Errors:
//> arguments must match the parameters in order, number, and compatible type as defined in the method signature
//> calling non statice methods in a static context
//> NullPointerException
*/

/*
Practice:

*/

/*
Additional Notes:
    When a method is called the system creates and activation record or activation frame that stores parameters and variables for the method.
    The activation record is placed in an area of memory called the call stack.
    Call Stack aka execution stack, runtime stack, or machine stack, is often shortened to just "the stack"
    When a method calls another method the caller's activation record is kept intact, and the new activation record is created for the new method called.
    When the method finishes its work and returns to its caller, its activation record is removed from the call stack. 
    The call stack follows LIFO or last in first out

*/
