//This file is meant to highlight the code and what it is doing. You should not choose class, object, method, or variable names the way this file does. 
//Java ArrayLists 

/*
The ArrayList class is a resizeable array.
To use an ArrayList import the java.util.* package
Arrays can hold primitives or objects but...
ArrayLists can only hold objects. They cannot hold primitives. 
*/

import java.util.ArrayList;//importing the ArrayList class to create ArrayLists
import java.util.Arrays;// importing the Arrays class to use Arrays.asList
import java.util.Collections;//used after line 91 to use Collections.sort(); to sort an ArrayList

class ArrayLists {
  
  public static void main(String[] args){
    //create an ArrayList object and specifies the string data type in <> diamond operator
    ArrayList<String> aList = new ArrayList<String>(); 
    
    //creates an ArrayList object and specifies the string data type then Arrays.asList(values) creates the list of values. This is mutable.
    ArrayList<String> anotherList = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
    System.out.print("Printing the ArrayList anotherList created with Arrays.asList: ");
    System.out.println(anotherList);

    
    //the ArrayList class has the add(); method to add elements to the ArrayList

    aList.add("index 0");
    aList.add("index 1");
    aList.add("index 2");
    aList.add("index 3");
    aList.add("index 4");

    System.out.print("aList values after add: ");
    System.out.println(aList);

    //the ArrayList class has the get(); method to access an element
    //aList.get(<index>);

    System.out.print("Accessing the element with get() method: ");
    System.out.println(aList.get(0));

    //the ArrayList class has the set(); method to modify and element
    //aList.set(<index>,<value>);

    aList.set(0, "Added to index 0");
    System.out.print("aList values after set() method used: ");
    System.out.println(aList);

    //the ArrayList class has the remove(); method to remove and element

    aList.remove(0);
    System.out.print("aList values after remove() method used: ");
    System.out.println(aList.get(0));
    aList.set(0, "index 0");

  
    //the ArrayList class has the size(); method to output the number of elements (similiar to length and length());
    
    //aList.size();
    System.out.print("The number of elements returned by the size() method: ");
    System.out.println(aList.size());

    //Looping through an ArrayList:
    //use a for loop to loop through an ArrayList

    for (int spot = 0; spot< aList.size();spot++){
      System.out.print(aList.get(spot) + " ");
      //loops through the ArrayList and prints out the value of the index on the same line seperated by a space. 
    }
    System.out.println("");

    //Looping through and ArrayList with a for-each loop
    for(String spot : aList){
      System.out.print(spot + " ");
    }
    System.out.println(" ");

    //the ArrayList class has the clear(); method to remove all elements 

    aList.clear();
    System.out.print("Cleared ArrayList values: ");
    System.out.println(aList);


    //Elements in an ArrayList are actually OBJECTS NOT PRIMITIVES 
    //In java String is an object not a primitave
    //to use other types specify the equivalent wrapper class 
    
    // int is Integer
    ArrayList<Integer> numList = new ArrayList<>();
    numList.add(72921);
    
    //boolean is Boolean
    ArrayList<Boolean> boolList = new ArrayList<>();
    boolList.add(true);

    //char is Character
    ArrayList<Character> charList = new ArrayList<>();
    charList.add('A');

    //double is Double
    ArrayList<Double> doubleList = new ArrayList<>();
    doubleList.add(3.14159265358979);


    //Sorting an ArrayList with  the Collections class
    //import java.util.Collections;

    ArrayList<String> sortList = new ArrayList<>();
    sortList.add("zero");
    sortList.add("one");
    sortList.add("two");
    sortList.add("three");


    Collections.sort(sortList);//sorts the ArrayList either alphabetically or numerically
    System.out.println("This list was sorted with Collections.sort(sortList);: ");
    for(int spot=0; spot < sortList.size(); spot++){
      System.out.print(sortList.get(spot) + ", ");
    }
  }
}