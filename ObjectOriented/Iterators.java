//Java Iterator\
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  an Iterator is and object aht can be use to loop through collections like ArrayList or HashSet.
  Iterating is the technical term for looping

  Java tokens are smallest elements of a program which are identified by the compiler. 
  Tokens in java include identifiers, keywords, literals, operators and, separators.
*/


//to use an iterator import the java.util package
import java.util.ArrayList; // import the ArrayList class
import java.util.Iterator; // import the Iterator class

class Iterators{
  public static void main(String[] args){
    ArrayList<String> iterList = new ArrayList<>();
    iterList.add("zero");
    iterList.add("one");
    iterList.add("two");
    iterList.add("three");
    iterList.add("four");

    Iterator<String> iter = iterList.iterator();//gets the iterator

    //use the next() method. Returns the next complete token.
    System.out.print("The iterator is printing the next value in iterList: ");
    System.out.println(iter.next()); //Print the first item in this case

    //use the hasNext() method. Returns true if scanner has another token
    System.out.print("Looping through iterList and printing: ");
    while(iter.hasNext()) {
      System.out.print(iter.next());
      System.out.print(" ");
    }
    System.out.println("");

    //use the remove() method to remove items while iterating
    ArrayList<Integer> numList = new ArrayList<>();
    numList.add(0);
    numList.add(5);
    numList.add(10);
    numList.add(15);
    numList.add(20);
    numList.add(25);
    System.out.print("Values in numList: ");
    System.out.println(numList);

    //Iterate through numList and remove values less than 15
    Iterator<Integer> numIter = numList.iterator();
    while (numIter.hasNext()) {
      Integer spot = numIter.next();
      if(spot < 15){
        numIter.remove();
      }
    }
    System.out.print("The remaining values in numList: ");
    System.out.println(numList);

    //using a for loop or a for-each loop would not work correcly beacuse the 
    collection is changing size at the same time that the code is trying to loop
  }
}

