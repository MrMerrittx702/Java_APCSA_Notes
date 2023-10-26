package commandline;
//Java Command Line Arguments
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/



/**
Notes:
  The main method can recieve string arguments from the command line

  This is just like how arguments are passed to methods. 

  on the command line try
    java CommandLineArguments arg0 arg1 arg2 ...
    ex:
    java CommandLineArguments "one" "two" "three"

  if you run the program with no strings passed. the array is created with new String[0]
  In this case, the array is empty with length 0. args references to this empty array. Therefoer. args is not null, but args.length is 0.
*/


class CommandLineArguments {
  public static void main(String[] args){
    for(int i = 0; i < args.length; i++){
      System.out.println(args[i]);
    }
  }
}
/*
Common Errors:

*/

/*
Practice:

*/


