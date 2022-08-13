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
Methods enable code sharing an reuse.
They are also used to modularize code or break it up into parts that are easier to work with. 

Method Syntax
    modifier returnValueType methodName(list of parameters){
        //Method Code block
    }

We declare variables, but define methods
> declaring usually involves the allocation of memory.

*/

public class Methods{
//Java Methods are blocks of code that are only run when called (like a function or procedure in other languages)
    static void aMethod(){
        //static indicates that the method belongs to the Main class and can be run without creating an object of the class.
        //void indicates that the method does not have a return value.
        System.out.println("aMethod was executed!");

        //methods that do not return can use a return statement to terminate the method.
        //syntax
        return;
    }

//method with a parameter
    static void methodParameters(String name){//the string parameter name is added 
        System.out.println(name);
    }

//method with multiple parameters
    static void multiParameters(String name, int age){//(you can add as many parameters as you like)
    // declared method parameters are seperated by a comma
        System.out.println(name + ", " + age);
    }

//method that returns a value
    static int returnsValue(int x){
        return 2 + x;// when called the method outputs the value of 2 + x
        //return statements are required when the method returns a value.
    }

//method with an if statement
    static void checkIf(int x){
        if (x > 0){
            System.out.println("The method's if statement is true.");
        }else{
            System.out.println("The method's if statement is false.");
        }
    }

//overloaded method
static int methodOverload(int x, int y){
    return x + y;
}
//here the method is "defined" twice or overloaded allowing one method to work for both int and double here. 
//overloaded methods can have the same name, but must have different parameters.
static double methodOverload(double x, double y){
    return x + y;
}
//Ovverloading methods can make programs clearer and more readable. 
//Methods that perform the same function with different parameters should be given the same name. 

//Scope is defined as the area of a program where a variable is accessible. 
//Code is read from the beginning(top) to the end (bottom).
static void variableScope (){//A code block is all of the code between curly braces.
    //code before the variable cannot access it.
    String scope = "Code after this point can access the variable scope.";
    //code after the variable can access it.
    System.out.println(scope);
    //code outside of the curly braces cannot access variables defined inside of the braces.
}
//variables declared inside of a block(method, loop, etc.) have local scope.
//variables accessible throughout the program have global scope.

//Recursion occurs when a function calls itself
public static int sumRecursion(int x){
    if(x > 0){
        System.out.println(x);
        return x + sumRecursion(x - 1);
        //the method progressively calls itself each time reducing the value of x by 1.
    }else{
        System.out.println(x);
        return 0;
    }//recursive methods must have a halting condition, other wise infinite recursion could occur. 
}

//Static vs. Non-Static
//Static methods can be accessed without creating an object of the class
static void staticMethod(){//called and executed below
    System.out.println("staticMethod was called and executed");
}
//Public methods can only be accessed by objects
public void publicMethod(){//(run OOP2.java to see this used)
    System.out.println("publicMethod was called and executed.");
}

    public static void main(String[] args){

        aMethod();//aMethod is called (calling or invoking the method mean the same thing)

        //arguments are values passed to the parameters created when defining the method.
        //arguments are pass by value to methods meaning we provide the value not a reference. 
        methodParameters("Jane");// the method is called with the argument Jane
        
        methodParameters("Alice");// the method is called with the argument Alice
        
        multiParameters("John", 18); // the method is called with two arguments
        //when a parameter is passed to a method it is called an argument.
        
        returnsValue(1);//the method is called and returns 3 (but does not print)
        int r = returnsValue(1);//store results as variables for easier to read and maintain code.
        System.out.println(r);//Here the return value of returnsValue(1) is printed
        
        checkIf(1);
        int overloadInt = methodOverload(5,2);
        double overloadDouble = methodOverload(3.14,2);
        System.out.println(overloadInt + "\n" + overloadDouble);

        variableScope();

        int returnFromRecursion = sumRecursion(10);
        System.out.println(returnFromRecursion);

        staticMethod();
    }
}

/*
Common Errors:
arguments must match the parameters in order, number, and compatible type as defined in the method signature

*/

/*
Practice:

*/

/*
Additional Notes:
When a method is called the system creates and activation record or activation frame that stores parameters and variables for the method.
The activation record is placed in an area of memory called the call stack.
Call Stack aka ececution stack, runtime stack, or machine stack, is often shortened to just "the stack"
When a method calls another method the caller's activation record is kept intact, and the new activation record is created for the new method called.
When the method finishes its work and returns to its caller, its activation record is removed from the call stack. 
The call stack follow LIFO or last in first out

/*
