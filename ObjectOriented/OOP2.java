//Java Object Oriented Programming 2
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
Using Multiple Classes    
    Multiple class can be created

    Here we will create an object of the class OOP from another file
*/


public class OOP2{
    public static void main(String[] args){
        OOP thirdObject = new OOP();//created an object "thirdObject" of the class OOP 
        System.out.println(thirdObject.x + "\n" + thirdObject.y);

        //Here we are accessing the class Methods
        Methods methodsObject = new Methods();//creating an object of the class "Methods"
        methodsObject.publicMethod();//calling the public method "publicMethod" 
        //methods are also accessed through (.) syntax object.method();
        
        //it is good practice to create an object of a class and access it in another class. 
        
    }
}

/*
Common Errors:

*/

/*
Practice:

*/