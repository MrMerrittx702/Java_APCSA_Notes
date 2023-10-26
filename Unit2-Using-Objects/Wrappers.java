//Java Wrapper Class
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  Wrapper class provide a way to use primitive data types as objects
  Covered in this file:
  //> Wrapper Classes
  //> Autoboxing
  //> Unboxing
  //> Integer Wrapper Class
  //> Double Wrapper Class
  //>

  Wrapper classes:
    Byte
    Short
    Integer
    Long
    FLoat
    Double
    Boolean
    Character
*/
import java.util.ArrayList;

class Wrappers {
  //============================================================================================================================================================================//
  // Wrapper Classes
    //> Wrapper classes provide and object-oriented representation of primitive data types
    //> The class 'wraps' or encapsulates primitive types into objects
    
    //> Why wrapper classes are necessary:
      //> Collections like ArrayList, HashMap, and HashSet store objects not primitives
      //> Generics
      //> Nullable Values (objects can be null primitives cannot)
      //> Methods, wrapper classes provide methods for converting, parsing, and performing operations not available for primitive types

    Integer num = new Integer();
    Double duo = new Double();
    Boolean bool = new Boolean();
    Byte bit = new Byte();
    Short sho = new Short();
    Long lon = new Long();
    Float flo = new Float();
    Character cha = new Character();


  //============================================================================================================================================================================//
  // Autoboxing
    //> the automatic conversion that the Java compiler makes between  primitive types and their corresponding object wrapper classes.
    //> occurs when:
      //> a primitive value is passed as a parameter to a method that expects an object of the corresponding wrapper class
      //> a primitive value is assigned to a variable of the corresponding wrapper class


  private static void autoboxing(){
    //Integer num = new Integer(8);
    Integer num = 8;
    //Double duo = new Double(3.1415926535);
    Double duo = 3.1415926535;
    //Double boo = new Boolean(true);
    Boolean boo = true;
  }

  //============================================================================================================================================================================//
  // Unboxing 
    //> the automatic conversion by the Java compiler from the wrapper class to the corresponding primitive type. 
    //> occurs when:
      //> a wrapper class object is passed as a parameter to a method that expects a value of the corresponding primitive type
      //> a wrapper class object is assigned to a variable of the corresponding primitive types
 
  private static void unboxing(){
    Integer num = new Integer(10);
    int unbox = num;
    System.out.println("Value of num: " + num);
    System.out.println("Value of unbox: " + unbox);

    //manual unbox
    int manual = num.intValue();
  }
  
  //============================================================================================================================================================================//
  // Integer Wrapper Class
  
   //Integer intObj = new Integer(5);
  
   new Integer(5); //> constructs a new Integer object

   int min = Integer.MIN_VALUE; //> The minimum value represented by an int or Integer value > -2,147,483,648
   int max = Integer.MAX_VALUE; //> The maximum value represented by an int or Integer value >  2,147,483,647

   intObj.intValue(); //> returns the value of 'this' Integer as an int
  
  //============================================================================================================================================================================//
  // Double Wrapper Class

  Double duoObj = new Double(3.14);

  new Double(3.14); //> constructs a new Double object

  duoObj.doubleValue(); //> returns the value of 'this' Double as a double

  //============================================================================================================================================================================//
  // Examples

  private static void objectTypes(){
    //creating a instances of wrapper class
    Integer numObj = new Integer(8);
    Double duoObj = new Double(3.1415926535);
    Character charObj = new Character('A');
    System.out.print(numObj); System.out.print(" "); System.out.println(numObj.getClass().getName());
    System.out.print(duoObj); System.out.print(" "); System.out.println(duoObj.getClass().getName()); 
    System.out.print(charObj); System.out.print(" "); System.out.println(charObj.getClass().getName()); 
    System.out.println();

    //to get the values associated with the wrapper object
    // intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
    
    int num = numObj.intValue();
    double duo = duoObj.doubleValue();
    char character = charObj.charValue();

    System.out.print(num); System.out.println(": primitive int");
    System.out.print(duo); System.out.println(": primitive double");
    System.out.print(character); System.out.println(": primitive character");
  }

  /** an example that incorporates Autoboxing/Unboxing */
  private static void example1(){
    Integer a = new Integer(10);//creating an instance of the Integer class
    Integer b = 15;//Autobox to object
    int c = 20;//primitive 
    int d = new Integer(25);//unbox to primitive

    //Autobox and unboxing automatically
    //                 Unbox   Unbox   primitive   primitive
    System.out.println(  a   +   b   +     c     +     d     ); //70

    //                  Manual Unbox    Manual Unbox   primitive  primitive
    System.out.println( a.intValue()  + b.intValue()  +   c     +    d     );//70

    //                 Unbox   Unbox        error           error
    //System.out.println(  a  +   b     +  c.intValue() + d.intValue());//Object cannot be dereferenced
    //dereferencing is the process of  accessing the value referred to by the object reference
    //c and d are primitives and not objects
  }

  /** Autoboxing and unboxing with ArrayLists 
      ArrayLists cannot hold primitive types. 
      Primitives are autoboxed to their wrapper class */
  
  private static void example2(){
    ArrayList<Integer> autobox = new ArrayList<>();

    //Adding primitive by manual boxing
    autobox.add(Integer.valueOf(10));

    //Adding primitive with autoboxing
    autobox.add(20);

    System.out.println(autobox);

    //Unboxing value at index 0
    int num0 = autobox.get(0);
    System.out.println(num0);

    

  }

  public static void main(String[] args){
 
    //objectTypes();
    //unboxing();
    //example1();
    //example2();


  }
  
}

/*
Common Errors:
  Misunderstanding Autoboxing and Unboxing

*/

/*
Practice:

*/