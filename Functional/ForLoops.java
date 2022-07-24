/*
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names the way this file does. 
*/

//Java For loops

class ForLoops {
  public static void main(String[] args){
    //ignore this above for now, but make sure it is in every program you write or they will not work.
    //Don't worry we will come back to this later.

    //Java For Loop----------------------------------------------------------------------------------------------------------------------------------------------------------
    /*
    For loops are used when the number of loops is known
    They are great for looping through arrays and ArrayLists

    syntax:
    for ()
    //for (statement1;statement2;statement3){
        <code to be executed>
    }

    //Statement1 executes once for the code block
    //Statement2 defines the condition for for executing the code block
    //Statement3 is executed every time after the code block has been executed
    
    Think of it like this:
        for (start,end,pace) 
    */

    //typically you will see loops use the variables i and j, but that is not a rule just convention.
    for(int i = 0; i < 10; i++){
        System.out.println("For Loop printing i: " + i); 
        //why does it stop at 9?
    }


    //to make things a little less confusing we will use spot instead of i
    for(int spot = 0; spot < 3; spot++){
        System.out.println("Used spot this time: " + spot);
    }


    //for loops are great for looping through arrays
    int[] array = {1,2,3,4,5,6,7,8,9,10};

    for (int spot = 0; spot < array.length; spot++){
        System.out.println("Printing array values: " + array[spot]);
        //why use array.length?
        //why use array[spot]?
    }

    //looping through String arrays
    String[] stringArray = {"Value1", "Value2", "Value3"};

    for(int spot = 0; spot < stringArray.length; spot++){
        System.out.println("Value at index: " + spot + " is: " + stringArray[spot]);
    }

    //for-each loops can do the same thing
    //syntax : for (type element: array){}
    for (String loop : stringArray) {
        System.out.println("The value is:" + loop);
    }

    //The break statement can also be used to break out of loops
    for (int spot = 0; spot < 5; spot++){
        if (spot == 4){
            break;
        }
        System.out.println(spot);//why does it not print 4?
    }

    //The continue statement breaks one iteration of the loop then returns to the loop
    for (int spot = 0; spot < 5; spot++){
        if (spot == 3){
            continue;
        }
        System.out.println(spot);//why does it not print 3?
    }

    //Nested for loops : here is where j is typically used
    for (int i = 0; i < 5; i++){
        System.out.println("Nested for Loop printing i: " + i);
        for (int j = 0; j < 2; j++){
            System.out.println("Nested for Loop printing j: " + j);
        }
    }


    //think of this like a table with rows(row) and columns(col) 
    for (int row = 0; row < 5; row++){
        System.out.println("Nested for Loop printing row: " + row);
        for (int col = 0; col < 2; col++){
            System.out.println("Nested for Loop printing column: " + col);
        }
    }



    //Nested For loop to get elements from a two dimensional array
    int[][] twoDArray = {
        {0,1,2,3,4},
        {5,6,7,8,9}
    };
    for (int row = 0; row < twoDArray.length;row++){//iterate through array 1
        for (int col = 0; col < twoDArray[row].length; col++){//iterate through array 2
            System.out.println(twoDArray[row][col]);//print the value of index i and index j
        }
    }



  }
}