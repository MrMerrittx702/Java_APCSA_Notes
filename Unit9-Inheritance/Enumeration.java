//Java Enums
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  enums is a special class the represents a group of constants
  use the enum keyword
  seperate the constants with a comma. The should be in uppercase.

*/

public class Enumeration {
  enum Enumerated{
    LOW,
    MEDIUM,
    HIGH
  }
  //access enum constants with the dot syntax

  public static void main(String[] args){
    Enumerated aVar = Enumerated.MEDIUM;
    System.out.println(aVar);

    //enum in a switch
    Enumerated secondVar = Enumerated.HIGH;
    switch(secondVar){
      case LOW:
        System.out.println("Low");
        break;
      case MEDIUM:
        System.out.println("Medium");
        break;
      case HIGH:
        System.out.println("High");
        break;
    }

    //enum type has a values() method that returns an array of all enum constants. 
    for(int i = 0; i < Enumerated.values().length;i++){
      System.out.println(Enumerated.values()[i]);
    }
  }
}

/*
Common Errors:

*/

/*
Practice:

*/

