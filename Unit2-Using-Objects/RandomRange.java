package functional;
//Math.random Range problem
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/**
Notes:
  Below is a test to show the different equations between two values max and min inclusive.
  (int)((Math.random() * (max-min)+min)); //this is the correct method for random range with { two negatives }
  (int)((Math.random() * ((max-min) + 1)+min)); //this is the correct method for random range with a { negative and a positive or two positives }
*/

import java.util.Scanner;

class RandomRange {
  
  public static void main(String[] args){
    
    //Accept user input //////////////////////////////////////
    Scanner input = new Scanner(System.in);                 //
                                                            //
    System.out.println("Enter the max value.(integer)");    //
    int max = input.nextInt();                              //
                                                            //
    System.out.println("Enter the min value.(integer)");    //
    int min = input.nextInt();                              //
                                                            //
    input.close();                                          //
    //////////////////////////////////////////////////////////
    
    //simulates possible random values from Math.random 0 - 0.999999999999999.
    double[] array = {0,0.000000000000001,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,0.999999999999999};

    if ((max < 0) && (min < 0)){
      System.out.println("Two negatives");
      for (int i = 0; i<array.length; i ++){
        System.out.print((int)((array[i]) * (max-min) + min) + ", ");
        //> Algorithm: (int) (Math.random() * (max - min) + min)
      } 

    } else {
      System.out.println("Two positive or One positive, One Negative");
      for (int i = 0; i<array.length; i ++){
        System.out.print((int)((array[i]) * ((max-min)+1) + min) + ", ");
        //> Algorithm: (int) (Math.random() * (max - min + 1) + min)
      }
    }
  }
}

