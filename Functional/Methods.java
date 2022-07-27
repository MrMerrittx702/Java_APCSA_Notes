//Java Methods

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 

*/


/**
Notes:

*/

public class Methods{
//Java Methods are blocks of code that are only run when called (like a function or procedure)
    static void aMethod(){
        //static indicates that the method belongs to the Main class
        //void indicate that the method does not have a return value.
        System.out.println("aMethod was executed!");
    }

//method with a parameter
    static void methodParameters(String name){//the string parameter name is added 
        System.out.println(name);
    }

//method with multiple parameters
    static void multiParameters(String name, int age){//(you can add as many parameters as you like)
        System.out.println(name + ", " + age);
    }

//method that returns a value
    static int returnsValue(int x){
        return 2 + x;// when called the method outputs the value of 2 + x
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
static double methodOverload(double x, double y){
    return x + y;
}

//Scope is defined as the area where a variable is accessible. 
//Code is read from the beggining(top) to the end (bottom).
static void variableScope (){//A code block is all of the code between curly braces.
    //code before the variable cannot access it.
    String scope = "Code after this point can access the variable scope.";
    //code after the variable can access it.
    System.out.println(scope);
    //code outside of the curly braces cannot access variables defined inside of the braces.
}

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

        aMethod();//aMethod is called

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

*/

/*
Practice:

*/
