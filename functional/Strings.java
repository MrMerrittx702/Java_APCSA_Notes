package functional;
//Java Strings
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  Covered in this file:
  //> Declaring and Initializing Strings
  String Methods
  //> length()
  //> toLowerCase() and toUpperCase()
  //> indexOf()
  //> substring()
  //> concat()
  //> splits()
  //> equals()
  //> compareTo()

*/

import java.util.Objects; //> ignore for now.

public class Strings {
  public static void main(String[] args){
    //> ignore this above for now, but make sure it is in every program you write or they will not work.
    //> see Methods.java for an explanation of the 'main' method

    //============================================================================================================================================================================//
    // Declaring and Initializing Strings
      //> Strings are reference types (objects)
      //> Strings are immutable (cannot be changed)
      //> Strings cannot cross multiple lines
      //> String identifier = "<text>"; or String identifier = new String("<text>");

    String str = "Hello World!";
    //> OR
    String str1 = new String("Goodby World!");
    
    String str2;
    //============================================================================================================================================================================//
    //String Methods
      //> strings are an object that contains methods to perform operations on strings
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
    //============================================================================================================================================================================//
    // length()
      //> returns the number of characters in the string including space characters

    alphabet.length(); //> 26

    //============================================================================================================================================================================//
    // toLowerCase() and toUpperCase()
      //> toLowerCase() coverts and returns all characters in a string in lower case
      //> toUpperCase() converts and returns all characters in a string in upper case
  
    alphabet.toLowerCase(); //> abcdefghijklmnopqrstuvwxyz

    alphabet.toUpperCase(); //> ABCDEFGHIJKLMNOPQRSTUVWXYZ

    //============================================================================================================================================================================//
    // indexOf()
      //> use the .indexOf() method to find the index of first occurrence of a character/string in a string 
      //> it accepts characters or strings as parameters
      //> ! remember spaces count in string indexes

    alphabet.indexOf("M"); //> 12

    //============================================================================================================================================================================//
    // substring()
      //> use .substring() to create a substring of a larger string.
      //> ! remember spaces count in string indexes
      //> substring(index) creates a substring from index to the end of the string
      //> substring(index1, index2) creates a substring from index1 up to but not including index2

    String s = new String("Hello");
    String s1 = "This is a String.";

    s1.length(); //17
    String s2 = s1.substring(13); //'ing.' 
    String s3 = s1.substring(6,9); //"s a" 

    //============================================================================================================================================================================//
    // concat()
      //> to concat use + or you can use the concat() method to concatenate two strings
    
    String name1 = "Jane";
    String name2 = " Smith";
    name1.concat(name2);

    //============================================================================================================================================================================//
    // splits()
      //> use .splits() to break up a string into an array of characters/strings
      //> split("") returns and array of each character from a string
      //> split(<arg>) returns an array of strings split at <args>
      //> The new array does not include the split character

    alphabet.split(""); //> "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"

    String phrase = "The quick brown fox jumps over the lazy dog.";
    phrase.split(" ");//> "The","quick","brown","fox","jumps","over","the","lazy","dog."
    //> Splits the string into an array at spaces
    

    //============================================================================================================================================================================//
    // equals()
      //> use equals() to compare strings instead of ==
      //> == compares if two objects are identical (aliases)(same location in memory)
      //> the String equals() method compares the values of two strings
      //> equals() is an overridden method from the 'Object' class
      //> == cannot be overridden

      String txt1 = "Hello World"; //----------------------------------------------------------//
      String txt2 = "Hello World"; // These 3 variables all reference the same place in memory //
      String txt3 = txt1;//Alias   //----------------------------------------------------------//
      String txt4 = "Goodbye World";

      // using == 
      System.out.println(txt1 == txt2); //> true
      System.out.println(txt1 == txt3); //> true
      System.out.println(txt2 == txt3); //> true
      System.out.println(txt1 == txt4); //> false
	    System.out.println(txt2 == txt4); //> false

      // using equals()
      System.out.println(txt1.equals(txt2)); //> true
      System.out.println(txt1.equals(txt3)); //> true
      System.out.println(txt2.equals(txt3)); //> true
      System.out.println(txt1.equals(txt4)); //> false
	    System.out.println(txt2.equals(txt4)); //> false

      //> But there was no difference why do we need equals()
      //> What about when the objects do not reference the same location in memory?
      
      txt1 = new String("Hello World"); //> creating a new object memory location
      txt2 = "Hello World";
      txt3 = new String("Hello World");
      
      boolean test;

      test = txt1 == txt2; //> false, but the values are identical?
      test = txt1.equals(txt2); //> true

      test = txt1 == txt3; //> false
      test = txt1.equals(txt3); //> true

      test = "Hello World" == "Hello World"; //> true, literals are interned by the compiler and thus refer to the same object.
      test = "Hello World" == "Hello" + "World"; //> true, string literals are concatenated by the compiler and the results are interned
      //> for context: string interning is a method of storing only one copy of each distinct string value, which must be immutable.

    /*
    It matters because:
    == tests for reference equality (whether they are the same object).
    .equals() tests for value equality (whether they are logically "equal").

    == will not always return the correct value
    .equals() will return the correct value

    .equals() can be overridden
    == cannot be overridden

    note: if you are testing whether or not two values are the same object then == is acceptable.

    
    */
   //finally you can also use Objects.equals() : it checks for null before calling .equals() so you don't have to.
    //must import java.util.Objects;
    Objects.equals("test", new String("test")); // true
    Objects.equals(null, "test"); // false
    Objects.equals(null, null); // true

   //============================================================================================================================================================================//
   // compareTo()
    //> returns a value < 0 is this is less than other
    //> returns a value of 0 if this is equal to other
    //> returns a value  > 0 is this is greater than other
    //> Lexicographically determines if one is greater than another
      //> Using Unicode values it checks each value. If the unicode value of one is less then that string is less. 

    str1 = "apple";
    str2 = "banana";

    int result = str1.compareTo(str2);

    if (result < 0) {
        System.out.println(str1 + " is lexicographically less than " + str2);
    } else if (result > 0) {
        System.out.println(str1 + " is lexicographically greater than " + str2);
    } else {
        System.out.println(str1 + " is lexicographically equal to " + str2);
    }
    
    String a = "a"; //unicode 97
    String b = "b"; //unicode 98
    
    System.out.println( a.compareTo(b) ); //> returns -1

    
  }

}

/*
Common Errors:

*/

/*
Practice:

*/