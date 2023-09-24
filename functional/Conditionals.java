package functional;
//Java Conditionals
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  Covered in this file:
  //> Boolean Expressions
  //> De Morgan's Laws
  //> Conditional Syntax
  //> Chained Conditionals
  //> Nested Conditionals
  //> Ternary Operators
  //> Switch Statements
  
use the if keyword to begin and if statement
  syntax:
  if(condition){
    <code to be executed>

  } else if (condition){

    <code to be executed>

  } else {

    <code to be executed>
  }

  else if & else are not required but can be used.

  curly braces {} help us keep track of the code in our statements in some cases they are required
  in some they are not. It is good practice to always use curly braces whether they are required
  or not. It makes your code easier to read.
*/

class Conditionals {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //see Methods.java for an explanation of the 'main' method
  //===============================================================================================================================================//
  // Boolean Expressions
    //> boolean expressions are like arithmetic expressions, but use boolean values (true/false)
    //> use the NOT, XOR, AND, OR order of operations

    //> Truth tables allow us to see how these operators evaluate

    //NOT (!)
    !true; //False
    !false; //True

    //XOR (^) (exclusive or)
    true ^ true; //False
    true ^ false; //True
    false ^ true; //True
    false ^ false; //False

    //AND (&&)
    true && true; //True
    true && false; //False
    false && true; //False
    false &&  false; //False

    //OR (||)
    true || true; //True
    true || false; //True
    false || true; //True
    false || false; //False

    //> There are many ways you might see an boolean expression. Here are several examples:
    boolean expressionA = true && false; // Result: false
    boolean expressionB = true || false; // Result: true
    boolean expressionC = !(true && false); // Result: true
    boolean expressionD = (true || false) && true; // Result: true
    boolean expressionE = !(true && true) || (false && true); // Result: false

    int number1 = 5;int number2 = 10;int number3 = 15;
    // Complex Boolean Expressions with relational operators
    boolean expression1 = (number1 < number2) && (number2 > number3); // Result: false
    boolean expression2 = (number1 <= number2) || (number2 >= number3); // Result: true
    boolean expression3 = !(number1 <= number2 && number2 >= number3); // Result: true
    boolean expression4 = ((number1 == number2) || (number2 != number3)) && (number1 <= number3); // Result: true
    boolean expression5 = (!(number1 < number2 && number2 < number3)) || (number1 >= number3 && number2 < number3); // Result: false

    String str1 = "Hello"; String str2 = "World";String str3 = "JAVA";
    // Complex Boolean Expressions with strings and relational operators
    boolean expression6 = str1.equals(str2) || str1.equalsIgnoreCase("hello"); // Result: true
    boolean expression7 = str1.startsWith("H") && str2.endsWith("d"); // Result: true
    boolean expression8 = str1.compareTo(str2) < 0 && str3.compareToIgnoreCase("java") == 0; // Result: true
    boolean expression9 = str1.contains("e") || str2.contains("o"); // Result: true
    boolean expression10 = !str1.equals("Hello") || (str2.length() > 4 && str3.length() < 10); // Result: true

    /*
      Short-Circuited evaluation:
      When the result of a boolean expression using && or || can be determined by evaluating only the first Boolean operand, the second is not evaluated. 
    */

    //===============================================================================================================================================//
    // De Morgan's Laws
      //> De Morgan's Laws are a pair of fundamental rules in Boolean algebra and set theory that describe how to simplify logical expressions involving negations (NOT), conjunctions (AND), and disjunctions (OR) 
      //> 1. Negation of a Conjunction
      //> 2. Negation of a Disjunction
      boolean a;
      boolean b;
      //> 1. Negation of a Conjunction
      !(a && b) == !a || !b;

      //> 2. Negation of a Disjunction
      !(a || b) == !a && !b;

      //REMEMBER:
      !(a && b) != !a && !b;
      !(a || b) != !a || !b;


    //===============================================================================================================================================//
    // Conditional Syntax
      //> conditionals are control flow statements that are used to run code based on a condition
      //> If statements are the most common conditional
      //> If statements use boolean expressions as conditions
    boolean condition;

    //If statement
    if (condition){
      //This block runs if the condition is true, and skips if the condition is false
    }

    //If else statement
    if(condition){
      //runs if the condition is true
    }
    else{
      //runs if the condition is false

    }
    
    boolean firstCondition; boolean secondCondition;
    //If, else if, else
    if (firstCondition){
      //runs only if firstCondition is true
    }
    else if (secondCondition){
      //runs only if firstCondition is false and secondCondition is true
    }
    else{
      //runs only when firstCondition and secondCondition are false

    }

    //===============================================================================================================================================//
    // Chained Conditionals
      //> a chained conditional included multiple else if statments

    if(condition1){
      
    }
    else if(condition2) {

    }
    else if (condition3){
      //There can be as many else if statements as necessary
    }
    else if(condition4) {
      
    }
    else if(condition5) {
      
    }
    else{

    }

    //===============================================================================================================================================//
    //Nested Conditionals
      //> Conditionals can be placed inside of one another

    boolean condition1 = true;boolean condition2 = true;boolean condition3 = false;

    if (condition1) {
        System.out.println("Condition 1 is true.");
        
        if (condition2) {
            System.out.println("Condition 2 is true.");
            
            if (condition3) {
                System.out.println("Condition 3 is true.");
            } 
            else {
                System.out.println("Condition 3 is false.");
            }
        } 
        else {
            System.out.println("Condition 2 is false.");
        }
    } 
    else {
        System.out.println("Condition 1 is false.");
    }

    //===============================================================================================================================================//
    //Ternary Operators
      //> DO NOT use these. They don't make you smart they make code hard to read.
      //> ternary operators are a shorthand if else statement
      //> variable = (condition) ? whenTrue : whenFalse;
      //> condition ? expression_if_true : expression_if_false
    //Examples
    int x = 5;int y = 10;
    int max = (x > y) ? x : y; // If x > y, max = x; otherwise, max = y.
    System.out.println("Max value: " + max); // Output: Max value: 10

    boolean isHappy = true;
    String message = isHappy ? "I'm happy!" : "I'm not happy.";
    System.out.println(message); // Output: I'm happy!
        
    int number = 7;
    String result = (number % 2 == 0) ? "Even" : "Odd";
    System.out.println("Number is " + result); // Output: Number is Odd

    int temperature = 25;
    String weather = (temperature > 30) ? "Hot" : "Moderate";
    System.out.println("Weather is " + weather); // Output: Weather is Moderate
    
    //===============================================================================================================================================//
    //Switch statements
      //> large chained conditionals can become a problem
      //> switch statements can replace large chained conditionals

    int day = 5;
    switch (day){ //switch to specify many alternate blocks of code to execute
      case 1: System.out.println("Monday");
      case 2: System.out.println("Tuesday");
      case 3: System.out.println("Wednesday");
      case 4: System.out.println("Thursday");
      case 5: System.out.println("Friday");//after the code reaches a true case it executes everything after it unless you break.
      case 6: System.out.println("Saturday");
      case 7: System.out.println("Sunday");
        break;
      default: break;
    }
    /*
    Switch statements follow these rules:
    * switch is evaluated once, value is compared with each case, if there is a match code is executed.
    * break is used to break out of the switch block
    * default specifies some code to run is there is no case match.
    * switch (switch-expression) the switch expression must yield a value of char,byte,short, int, or String
    * The value of each case must have the same type as the switch expression
    */
   }
}

/*
Common Errors:
  A common error that is missed by the compiler
    if ( x = 0){} did you notice the error?
      in this case we performed a assignment statement instead of a comparison
  Best practice is to reverse the comparison
    if (0 = x){} this will be caught by the compiler because numbers cannot be used as identifiers for variables
  SO
    if (0 == x){}

*/

/*
Practice:

*/