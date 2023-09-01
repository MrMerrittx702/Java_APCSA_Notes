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


public class Objects2{
    public static void main(String[] args){

      Objects anotherClassObj = new Objects();

      //Note this will only work if the attributes in the Objects class are not private

      //Accessing Class Attributes from another class (in this case Objects)
      System.out.println(anotherClassObj.staticNum);     
      System.out.println(anotherClassObj.staticBool);
      System.out.println(anotherClassObj.staticDuo);
      System.out.println(anotherClassObj.staticStr);
      System.out.println(anotherClassObj.staticStrArray); //prints memory location
      System.out.println(anotherClassObj.staticStrList);
      //OR
      System.out.println(Objects.staticNum);
      System.out.println(Objects.staticBool);
      System.out.println(Objects.staticDuo);
      System.out.println(Objects.staticStr);
      System.out.println(Objects.staticStrArray); //prints memory location
      System.out.println(Objects.staticStrList);

      
      //Accessing object attributes
      System.out.println(anotherClassObj.num);
      System.out.println(anotherClassObj.bool);
      System.out.println(anotherClassObj.duo);
      System.out.println(anotherClassObj.str);
      System.out.println(anotherClassObj.strArray); //prints memory location
      System.out.println(anotherClassObj.strList);
      
      //Calling Non Static Methods 
      anotherClassObj.nonStaticVoidMethod();
      anotherClassObj.nonStaticVoidMethodWithParameters(1,"default");
      anotherClassObj.nonStaticMethodWithReturn();
      anotherClassObj.nonStaticMethodWithReturnAndParameters(1,3);
      
      
      //Calling Static Methods from another class
      Objects.staticVoidMethod();
      Objects.staticVoidMethodWithParameters("Java", "Programming");
      Objects.staticMethodWithReturn();
      Objects.staticMethodWithReturnAndParameters("static and return");
        
    }
}

/*
Common Errors:

*/

/*
Practice:

*/