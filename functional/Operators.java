package functional;
//Java Operators 
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

/**
Notes:
  Covered in this file:
  //> Assignment Operators
  //> Arithmetic Operators
  //> Compound Assignment Operators
  //> Relational Operators
  //> Logical Operators
  //> Operator Precedence
*/
  

class Operators {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //see Methods.java for an explanation of the 'main' method
    
    //============================================================================================================================================================================//
    // Java Operations
      //> all expressions are evalueated to produce a single value
      //> the value of an expression has a type based on the evalutaiton of the expression
      //> operators in java follow operator precedence
      //> and now the math begins...
    
    //============================================================================================================================================================================//
    //Assignment Operator
      //> The = operator is used for assigning and changing values of variables
  
    int num = 1;
    double duo = 2.0;
    boolean bool = true;
    String str = "Hello World";
    
    num = 5;
    duo = 3.14;
    bool = false;
    str = "Goodbye World";

    //============================================================================================================================================================================//
    // Arithmetic Operators
      //> + addition / concatenation
      //> - subtraction
      //> * multiplication
      //> / division
      //> % modulus (remainder)
      //> ++ increment (add 1)
      //> -- decrement (sub 1)
      //> Follow Order of Operations (PEMDAS)
        //> Parenthesis, Exponents, Multiplication/Division, Addition/Subtraction 
        //> From left to right
    
    System.out.println(1 + 2);//add
    System.out.println(2 - 1);//subtract
    System.out.println(2 * 2);//multiply
    System.out.println(4 / 2);//divide
    System.out.println(10 % 3);//modulus (remainder)

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

    //Rounding a double
    double x = 1.5; //round up
    double y = 1.2; //round down
    double z = -1.5; //round up

    //add 0.5 for positive doubles
    System.out.println((int)(x + 0.5)); // 2
    System.out.println((int)(y + 0.5)); // 1
    //sub 0.5 for negative doubles
    System.out.println((int)(z - 0.5)); // -2

    
    int m = 0;
    System.out.println(++x); //pre-increment x by 1
    System.out.println(--x); //pre-decrement x by 1
    System.out.println(x++);//post-increment x by 1
    System.out.println(x--);//post-decrement x by 1
    //> there is a difference
    	//> pre : increment/decrement first then use the value
    	//> post: use the value first then increment/decrement

    //> use operators with variables to perform operations on their values
    int n = 5;
    int o = 6;
    System.out.println(m + n);
    //> welcome to math with even more letters!!!!
    
    //============================================================================================================================================================================//
    // Compound Assignment Operators
      //> += add and assign
      //> -= subtract and assign
      //> *= multiply and assign
      //> /= divide and assign
      //> %= modulus and assign
      
    int e = 10;
    e += 1; //same as e = e + 1 (important) adds 1 to e and sets that value to e
    e -= 1; //same as e = e - 1 (important) subtracts 1 from e and sets that value to e
    e *= 2; //same as e = e * 2 
    e /= 2; //same as e = e / 2
    e %= 2; //same as e = e % 2
    
    //won't use these in this class, but good to know----------|
    e &= 3; //same as e = e & 3 (bitwise AND operator)         |
    e |= 3; //same as e = e | 3 (bitwise OR operator)          | 
    e ^= 2; //same as e = e ^ 2 (bitwise XOR operator)         |
    e >>= 1; //same as e = e >> 1 (signed right shift operator)| 
    e <<= 1; //same as e = e << 1 (signed left shift operator) |
    //---------------------------------------------------------|
    
    
    //============================================================================================================================================================================//
    // Relational Operators
      //> mostly inequalities from math class
      //> includes more than just inequalities
      //> used for boolean expressions 
      //> == is equal to
      //> != not equal to
      //> > greater than
      //> < less than
      //> >= greater than or equal
      //> <= less than or equal
      //> instanceof checks if an object is an instance of a class
    
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
    
    Object obj = new Object();
    System.out.println(obj instanceof Object); //checks if an object is an instance of a class
    
    //============================================================================================================================================================================//
    //Logical Operators
      //> ! NOT (Negation)
      //> ^ bitwise XOR
      //> && logical AND (Conjunction)
      //> || logical OR (DIsjunction)
    
      //> Truth tables allow us to see how these operators evaluate
    
    //NOT (!)
    System.out.println( !true  ); //> False
    System.out.println( !false ); //> True

    //XOR (^) (exclusive or)
    System.out.println(  true ^ true  ); //> False
    System.out.println(  true ^ false ); //> True
    System.out.println( false ^ true  ); //> True
    System.out.println( false ^ false ); //> False

    //AND (&&)
    System.out.println(  true && true  ); //> True
    System.out.println(  true && false ); //> False
    System.out.println( false && true  ); //> False
    System.out.println( false && false ); //> False

    //OR (||)
    System.out.println(  true || true  ); //> True
    System.out.println(  true || false ); //> True
    System.out.println( false || true  ); //> True
    System.out.println( false || false ); //> False
    
    //Examples
    System.out.println(f < 10 && f < 6); // && is and 
    System.out.println(f < 4 || f < 10); // || is or
    System.out.println(!(f < 4 && f < 1)); // ! is not
    System.out.println(f < 6 ^ f < 4); // ^ is XOR (exclusive or) 
    // each of these will print true or false ie evaluate to a boolean value
    
    
    //============================================================================================================================================================================//
    //Operator Precedence
      //> Generally Arithmetic, then Relational, then Logical, then Assignment.
      //> From first to last: (In general think PEMDAS)
      // 1 var++ and var--
      // 2 ++var and --var
      // 3 (type) (casting)
      // 4 ! (not)
      // 5 *,/,% Multiplication, Division, and Modulus(remainder)
      // 6 +,- Binary addition and subtraction concatenation from left to right
      // 7 <,<=,>,>= (Comparison/Relational)
      // 8 ==, != (Equality)
      // 9 ^ (XOR)
      // 10 && (And)
      // 11 || (Or)
      // 12 =,+=,-=,*=,/=,%= (Assignment)
     
  }
}

/*
Common Errors:
  Math...
  PEMDAS
  Floating point error --> see FLOPErrors.java

*/

/*
Practice:

*/