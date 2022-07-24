/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

//Java Strings

import java.util.Objects;//ignore for now.

class Strings {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //Don't worry we will come back to this later.

    //Java Strings
    /*
    Strings are immutable (cant be changed)
    They cannot cross lines:
    	ex: "This would 
    		result in a compiler error";
    */
    //strings : syntax String identifier = "<text>";
    String aString = "This is a string.";
    
    // strings are an object that contains methods to perform operations on strings
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //use .length() to return the length of a string
    System.out.println("Length of string identified as alphabet is: " + alphabet.length());

    //use .toLowerCase() to change the string to all lower case
    System.out.println("To lower case " + alphabet.toLowerCase());

    //use .toUpperCase() to change the string to all upper case
    System.out.println("To upper case " + alphabet.toUpperCase());

    //use the .indexOf() method to find the index of a character in a string 
    // it accepts characters or strings as parameters
    // ! remember spaces count in string indeces 
    System.out.println("M is index number " + alphabet.indexOf("M") + " in the alphabet");

    // to concat use + or you can use the concat() method to concatenate two strings
    String name1 = "Jane";
    String name2 = " Smith";
    System.out.println(name1.concat(name2));

    //use .equals() to compare two strings
    String someText = "String";
    String otherText = "String";
    
    //DO NOT use == to compare two strings
    boolean compareText = someText == otherText;
    System.out.println("== If this is: " + compareText);

    compareText = someText.equals(otherText);
    System.out.println(".equals() and this is: " + compareText);

    //why does it matter if we use == or .equals()?

    String moreText = new String("String");    
    
    compareText = someText == moreText;
    System.out.println("== But now it is: " + compareText);//but they are the same string?

    //Lets try .equals
    compareText = someText.equals(moreText);
    System.out.println(".equals() And now it is: " + compareText);

    //another example to ponder
    System.out.println(new String("test").equals("test"));// true : same value
    System.out.println(new String("test") == "test"); // false : different object
    System.out.println(new String("test") == new String("test")); //false : different object
    System.out.println("test" == "test"); //true : literals are interned by the compiler and thus refer to the same object.
    System.out.println("test" == "te" + "st"); //true : string literals are concatenated by the compiler and the results are interened
    //for context: string interning is a method of storing only one copy of each distinct string value, which must be immutable.

    /*
    It matters because:
    == tests for reference equality (whether they are the same object).
    .equals() tests for value equality (whether they are logically "equal").

    == will not always return the correct value
    .equals() will return the correct value

    note: if you are testing whether or not two values are the same object then == is acceptable.
    */

    //finally you can also use Objects.equals() : it checks for null before calling .equals() so you don't have to.
    //must import java.util.Objects;
    Objects.equals("test", new String("test")); // true
    Objects.equals(null, "test"); // false
    Objects.equals(null, null); // true












    




  }
}