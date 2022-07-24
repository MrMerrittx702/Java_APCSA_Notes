//Java Packages
//packages in java group related classes. Like a folder/directory
  //packages avoid name conflicts 
    //Build in packages come with the Java API
    //User-defined Packages are your own packages

//The Java API (application programming interface) is a collection of built in code that you can use.
  //It is divided into packages and classes
  //Use the import keyword to use the packages and classes.

//import package.name.Class; Imports a single class
//import package.name.*; Imports the whole package


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