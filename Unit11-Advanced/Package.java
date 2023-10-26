//Java Packages
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
A project is an IDE-level grouping; its a set of source files, configurations, assets, ect. 
that make up a working application.

A package, on the other hand, is a grouping of related classes/source files.
It is a way of organizing your code, and also works as the addressing scheme
used by Java to find code you are importing.

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

//Creating your own packages
package apackage; // use the package keyword  and package name in lower case 'apackage'
class Package {
    public static void main(String[] args) {
      System.out.println("This is a package!");
    }
}


//run javac Package.java to compile
//run javac -d . Package.java to compile the package
//this creates a 'apackage' package
// -d specifies the destination for where to save the class file. (use . to keep the package in the same directory).
// when the compiled, a new folder with/ the package name is created

/*
Common Errors:

*/

/*
Practice:

*/