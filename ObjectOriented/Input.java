//Java User input

//import the java package class java.util.Scanner
import java.util.Scanner;

class Input {
  public static void main(String[] args){
    Scanner scannerObj = new Scanner(System.in); //Create a Scanner Object
    System.out.println("Enter your name:");//Prompts the user

    String name = scannerObj.nextLine(); //Reads user input
    System.out.println("User name accepted, Hello " + name);//Outputs the input

    //input types
    /*
    nextBoolean() reads a boolean value
    nextByte() reads a byte value
    nextDouble() reads a double value
    nextFloat() reads a float value
    nextInt() reads an integer value
    nextLine() reads a String value
    nextLong() reads a long value
    nextShort() reads a Short value
    */
  
    //reading values of different types
    System.out.println("Enter your grade: ");
    int grade = scannerObj.nextInt();
    System.out.println("Enter a rating from 0 to 1: ");
    double rating = scannerObj.nextDouble();
    System.out.println("Coding is fun(true/false): ");
    boolean codingFun = scannerObj.nextBoolean();

    System.out.println("Name: " + name +"\n"+"Grade: "+ grade + "\n" + "Rating: " + rating + "\n" + "Having Fun: " + codingFun);

    if (codingFun != true){
      System.out.println("Sorry you're not having fun... Let's change that.");
      codingFun = true;
      System.out.println("Now codingFun is " + codingFun); 
    }
  }
}