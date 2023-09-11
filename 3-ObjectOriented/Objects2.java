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
  Covered in this file:
  //> Object Instantiation from another class
  //> Object Scope
  //> Accessing Instance Variables and Static Fields from another class
  //> Accessing Methods from another class  
    
*/


public class Objects2{
  public static Objects testObject = new Objects();//> see Object Scope line 40

    public static void main(String[] args){

      //============================================================================================================================================================================//
      //Object Instantiation from another class
        //> If you can access the class you are trying to create an object of, then nothing changes. 

        Objects anotherClassObject = new Objects();

        //Zero parameter/argument constructor
        Objects anotherDefaultObj = new Objects();//No args constructor
        
        
        Objects anotherValuesProvidedObj = new Objects( 5 ,true, 2.54, "Constructor", new String[]{"con","str","uct","or"},new ArrayList<>(Arrays.asList("ro","tcu","rts","noc"))); 

      //============================================================================================================================================================================//
      //Object Scope
        //> objects exist in the class they were created in, not their type class. 
        //> objects scope is limited to the class/method they were created. 
        Objects obj = new Objects();

        //> Here we cannot access 'obj' from the 'main' method of the 'Objects' class
        //> The 'obj' we created here only exits in this 'main' method of the 'Objects2' class
        //> What about our 'testObject' that is created in the class definition of both 'Objects' and 'Objects2'

        //> The == operator will compare if two objects exist at the same place in memory
        System.out.println(Objects.testObject == Objects2.testObject);
        //> The way we access these values is a hint to their difference!

      //============================================================================================================================================================================//
      //Accessing Instance Variables and Static Fields from another class
      //Note this will only work if the fields in the Objects class are not private

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
      

      //============================================================================================================================================================================//
      // Accessing Methods from another class 

      //> Calling Non Static Methods 
      anotherClassObj.nonStaticVoidMethod();
      anotherClassObj.nonStaticVoidMethodWithParameters(1,"default");
      anotherClassObj.nonStaticMethodWithReturn();
      anotherClassObj.nonStaticMethodWithReturnAndParameters(1,3);
      
      
      //> Calling Static Methods from another class
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