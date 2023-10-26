package functional;
//Java Your First Program 
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

//single line comment
//Comments are ignored by the compiler

/* 
Multi-
    Line
        comment
comments allow programmers to make notes about their code. 
It is good practice to make comments in your code so that you and others can understand the code. 
*/

/** 
   This is a javadoc comment. Javadoc comments are used for commenting an entire class or an entire method.
 * They can be extracted into an HTML file using the JDK's javadoc command.
 * Must precede the class or the method header in order to be extracted to an HTML file.
*/


/** 
Notes:
Covered in this file:
//> Intro to Java
//> First Program

Java is a class based, object-oriented programming language
    Developed by Sun Microsystems in 1995.
    It is intended to be write once run anywhere(WORA). 

Java code is compiled into byte code, which is then interpreted by a Java Virtual Machine(JVM)
    This allows java to be run on all platforms that support java. 
    Java code does not need to be recompiled to run on multiple platforms.
    Java remains one of the most popular programming languages today.

Check if Java is installed on command prompt
    C:\Users\YourName\java -version

Every application begins with a class name, that must match the filename.
classes should always start with an uppercase letter. 

to compile the program to byte code use > javac Main.java
to execute use > java Main
    If you are not using this file "Main" should be replaced with the name of your file.
*/

//Script Kiddies first program..
public class Main {
    public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //Don't worry we will come back to this later.

        //Here we will tell the computer to print out Hello World to the console.
        System.out.println("Hello World"); //each code statement must end with a ;
        System.out.print("Hello World"); // print vs. println --> print does not move your cursor to the next line, but println does.   
    }
}
/*
Common Errors:

    Errors will show up when coding
    There are 3 types of errors:
    Syntax errors: errors that are detected by the compiler due to incorrectly written syntax
    Runtime errors: errors that cause the program to crash unexpectedly
    Logic errors: errors that cause the program to operate other than intended.
         
    Common errors to think about:
        Missing braces {}
        Missing semicolon ;
        Missing quotation mark ""
        Misspelling names
         

*/

/*
Practice:
Make your own "Hello World" program. (This is every programmers' first program by convention)
    Try changing what the program prints out. 
*/


