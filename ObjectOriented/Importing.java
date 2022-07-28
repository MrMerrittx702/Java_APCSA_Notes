//Java Importing
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
packages in java group related classes. Like a folder/directory
  packages avoid name conflicts 
  Build in packages come with the Java API
  User-defined Packages are your own packages

The Java API (application programming interface) is a collection of built in code that you can use.
  It is divided into packages and classes
  Use the import keyword to use the packages and classes.

import package.name.Class; Imports a single class
import package.name.*; Imports the whole package
*/

//importing the java.util whole package
import java.util.*;
//importing the 'Scanner' class from the java.util package
import java.util.Scanner;

class Importing {
  public static void main(String[] args){
    Scanner anObject = new Scanner(System.in);//System.in accepts user input
    System.out.println("Enter username");

    String userName = anObject.nextLine();
    System.out.println("Username is: " + userName);
  }
}

/*
Common Errors:

*/

/*
Practice:

*/

