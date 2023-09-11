//Java Operators 
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  You will be using operators quite alot in your programs 
  take care that you understand these operators.

  expessions are evaluated to produce a single value

  The value of an expression has a type based on the evaluation of the expression

  Math in java follows order of operations (PEMDAS)

  And now the math begins...
*/

class Operators {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //Don't worry we will come back to this later.


    // Java Operators
    //Assignment Operator-------------------------------------------------------------------------
    //The = operator is used for assigning and changing values of variables 
    int num = 1;
    double duo = 2.0;
    boolean bool = true;
    String str = "Hello World";



    //Arithmetic Operators------------------------------------------------------------------------ 
    System.out.println(1 + 2);//add
    System.out.println(2 - 1);//substract
    System.out.println(2 * 2);//multiply
    System.out.println(4 / 2);//divide
    System.out.println(10 % 3);//modulus (aka remainder)

    //Two ints evaluate to an int
    System.out.println(2 + 2); //4
    //An operation that includes a double evaluates to a double
    System.out.println(2.0 + 2);//4.0
    //Operators can be used to construct compound expressions 
    System.out.println(4 + 2 - 1 * 6);
    //Attempting to divide by 0 results in ArithmeticException to occur
    System.out.println(2/0); //ArithmeticException
    //Adding to a string results in concatenation
    System.out.println(2 + "Hello"); //2Hello

    //Rouding a double
    int x = 1.5; //round up
    int y = 1.2; //round down
    int z = -1.5; //round up

    //add 0.5 for positive doubles
    System.out.println((int)(x + 0.5)); // 2
    System.out.println((int)(y + 0.5)); // 1
    //sub 0.5 for negative doubles
    System.out.println((int)(z - 0.5)); // -2

    
    int x = 0;
    System.out.println(++x); //pre-increment x by 1
    System.out.println(--x); //pre-decrement x by 1
    System.out.println(x++);//post-increment x by 1
    System.out.println(x--);//post-decrement x by 1
    //there is a difference
    	//pre : increment/decrement first then use the value
    	//post: use the value first then increment/decrement

    //use operators with variables to perform operations on their values
    int y = 5;
    int z = 6;
    System.out.println(y + z);
    //welcome to math with even more letters!!!!
    //--------------------------------------------------------------------------------------------

    //Compound Assignment Operators------------------------------------------------------------------------
    int e = 10;
    e += 1; //same as e = e + 1 (important) adds 1 to e and sets that value to e
    e -= 1; //same as e = e - 1 (important) subtracts 1 from e and sets that value to e
    e *= 2; //same as e = e * 2 
    e /= 2; //same as e = e / 2
    e %= 2; //same as e = e % 2

    //won't use these in this class----------------------------|
    e &= 3; //same as e = e & 3 (bitwise AND operator)         |
    e |= 3; //same as e = e | 3 (bitwise OR operator)          | 
    e ^= 2; //same as e = e ^ 2 (bitwise XOR operator)         |
    e >>= 1; //same as e = e >> 1 (signed right shift operator)| 
    e <<= 1; //same as e = e << 1 (signed left shift operator) |
    //---------------------------------------------------------|
    //--------------------------------------------------------------------------------------------

    //Java Relational Operators-------------------------------------------------------------------
    // ! think back to inequalities in math class

    //These are boolean expressions
    //Boolean expressions return a value of true or false
    System.out.println(1 > 10);//returns false
    System.out.println(1 < 10);//returns true
    System.out.println(1 == 1);//returns true

    int f = 5;
    System.out.println(f == 2); // equal to
    System.out.println(f != 1); // not equal to
    System.out.println(f > 0); // greater than
    System.out.println(f < 4); // less than
    System.out.println(f >= 5); // greater than or equal to
    System.out.println(f <= 6); // less than or equal to
    instanceof //checks if an object is an instance of a class
    //Java logical Operators
    System.out.println(f < 10 && f < 6); // && is and 
    System.out.println(f < 4 || f < 10); // || is or
    System.out.println(!(f < 4 && f < 1)); // ! is not
    System.out.println(f < 6 ^ f < 4); // ^ is XOR (exclusive or) 
    // each of these will print true or false ie return a boolean value
    //-------------------------------------------------------------------------------------------
    //Operator Precedence------------------------------------------------------------------------
    /* 
     * Generally Arithmetic, Relational, then Logical
     * From first to last: (In general think PEMDAS)
     * var++ and var--
     * ++var and --var
     * (type) (casting)
     * ! (not)
     * *,/,% Multiplication, Division, and Modulus(remainder)
     * +,- Binary addition and subtraction
     * <,<=,>,>= (Comparison/Relational)
     * ==, != (Equality)
     * ^ (XOR)
     * && (And)
     * || (Or)
     * =,+=,-=,*=,/=,%= (Assignment)
     */
  }
}

/*
Common Errors:
  Math...
  PEMDAS
  Floating point error

*/

/*
Practice:

*/