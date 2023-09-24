package objectoriented;
//Java ArrayLists 
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
Covered in this file:
//> Importing java.util.ArrayList
//> <E> ?
//> What are ArrayLists?
//> Declaring an ArrayList.
//> Initializing with Arrays.asList()
//> ArrayList Methods
//> Simple ArrayList Traversal
//> Deleting Elements from an ArrayList while Traversing
 
The ArrayList class is a resizeable array.
To use an ArrayList import the java.util.* package
Arrays can hold primitives or objects but...
ArrayLists can only hold objects. They cannot hold primitives. 

*/


//============================================================================================================================================================================//
//Importing ArrayLists
import java.util.ArrayList;//importing the ArrayList class to create ArrayLists
import java.util.Arrays;// importing the Arrays class to use Arrays.asList
import java.util.Collections;//used for the Collections.sort(); method to sort an ArrayList
//import java.util.* //imports all util Classes

class ArrayLists {
//============================================================================================================================================================================//
// What are ArrayLists?
  //> a dynamic(changeable) array-like object provide by the java.util package
  //> dynamically sized > the length of the array can change without creating a new array
  //> ordered collection > elements are ordered in the list
  //> duplicates > can contain duplicate elements
  //> null > can contain null values
  //> generic > you can specify the type of object stored
  //> methods > including add, remove, get, set, size, isEmpty, and contains
  //> iterable > for, while, and enhanced for loops can be used to iterate
  
  public static <E> void main(String[] args){ 
  //============================================================================================================================================================================//
  // <E> ? 
    //> allows for generic type <E>
    //> See Generics for understanding <E>
    //> <E> is a place holder for a type specified later
    //> when using <E> reference parameters and return types are <E>
   
  //============================================================================================================================================================================//
  // Declaring an ArrayList.  
    //> ArrayList<type> identifier = new ArrayList<>();
    //> no need to specify a size
    //> ArrayList<>() constructor creates empty list
    
    
    //create an ArrayList object and specifies the string data type in <> diamond operator
    ArrayList<String> aList = new ArrayList<String>(); 
                                // this was necessary in older versions of Java, but not anymore.
    //Try this instead
    ArrayList<String> list = new ArrayList<>();
    
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
    
  //============================================================================================================================================================================//
  // Initializing with Arrays.asList()
    //> ArrayLists can be initialized with values using the Arrays.asList() method
    //> must import the java.util.Arrays class
    
   
    //creates an ArrayList object and specifies the string data type then Arrays.asList(values) creates the list of values. This is mutable.
    ArrayList<String> anotherList = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
    System.out.println(anotherList);
    
  //============================================================================================================================================================================//
  // ArrayList Methods
    //> add() > adds an element to the end of the ArrayList
    //> get(<index>) > returns the element at index
    //> set(<index>, <value>) > changes the element at index to value
    //> remove(<index>) > removes the value at index and shifts remaining values left one index, returns the removed value
    //> size() > returns the number of elements in the ArrayList
    //> clear() > removes all elements from the ArrayList
    
    
    //the ArrayList class has the add(); method to add elements to the ArrayList
    list.add("added to index 0");
    list.add("added to index 1");
    list.add("added to index 2");
    list.add("added to index 3");
    list.add("added to index 4");
    

    //the ArrayList class has the get(); method to access an element
    //list.get(<index>);
    list.get(0);

    //the ArrayList class has the set(); method to modify and element
    //list.set(<index>,<value>);
    list.set(0, "element at index 0 set");
   
    //the ArrayList class has the remove(); method to remove and element
    list.remove(0);
   
    //the ArrayList class has the size(); method to output the number of elements (similiar to length and length());
    //list.size();
    list.size();

    //the ArrayList class has the clear(); method to remove all elements 
    list.clear();
    
    
  //============================================================================================================================================================================//
  // Simple Array List Traversal
    //> while
    //> for
    //> for each/ enhanced for
    //> See ProcessingArrays for more algorithms
    
    //while loop
    int i = 0;
    while(i < list.size()) {
      System.out.print(list.get(i) + " ");
      i++;
    }
    
 
    
    //for loop
    for (int index = 0; index < list.size();index++){
      System.out.print(list.get(index) + " ");
      //loops through the ArrayList and prints out the value of the index on the same line seperated by a space. 
    }
    
    

    //Looping through and ArrayList with a for-each loop
    //> when using an enhanced for loop do not add or remove elements (ConcurrentModificationException)
    for(String elem : list){
      System.out.print(elem + " ");
    }
    
  //============================================================================================================================================================================//
  // Deleting Elements While Traversing 
    //> when you remove an element, all subsequent elements' indexes shift left by 1.
    //> when an element is removed decrease the index by 1 to ensure all elements are traversed
    
    ArrayList<String> delList = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
    //  starting length = 6;                 starting indexes  0   1   2   3   4   5
    
    for(int index = 0; index < delList.size(); index++) {
      if( delList.get(index).equals("B") || delList.get(index).equals("C") ) {
        delList.remove(index);
        index--; //> remove this and "C" will be skipped. 
      }
    }
    
    
  //============================================================================================================================================================================//
  // Sorting an ArrayList with the Collections Class
    //> import java.util.Collections;

    ArrayList<String> sortList = new ArrayList<>();
    sortList.add("zero");
    sortList.add("one");
    sortList.add("two");
    sortList.add("three");


    Collections.sort(sortList);//sorts the ArrayList either alphabetically or numerically
    System.out.println("This list was sorted with Collections.sort(sortList);: ");
    for(int index=0; index < sortList.size(); index++){
      System.out.print(sortList.get(index) + ", ");
    }
    
    
  }
  
}

/*
Common Errors:
ArrayIndexOutOfBoundsException

*/

/*
Practice:

*/