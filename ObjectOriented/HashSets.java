//Java HashSet
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/**
Notes:
HashSet is a collection of items with unique values

To use a HashSet import the java.util.HashSet; class
*/

import java.util.HashSet;

class HashSets {
  public static void main (String[] args){

    //create an object of the HashSet class
    HashSet<String> aSet = new HashSet<>();

    //use the add(); method to add vaules
    aSet.add("zero");
    aSet.add("zero");//this second zero will not show up because each value must be unique
    aSet.add("one");
    aSet.add("two");
    aSet.add("three");

    System.out.print("The values in aSet are: ");
    System.out.println(aSet);

    //use the contains(); method to check if a value exists in the HashSet
    //aSet.contains("one");
    System.out.print("The return value of aSet.contains(\"one\");");// the \ is an escape character
    System.out.println(aSet.contains("one"));

    //use the size(); method to return the length of the HashSet
    //aSet.size();
    System.out.print("The size of aSet is: ");
    System.out.println(aSet.size());

    //use a for-each loop to loop through a HashSet
    System.out.print("Looping: ");
    for(String spot : aSet){
      System.out.print(spot);
      System.out.print(" ");
    }
    System.out.println("");

    //item in HashSets are OBJECTS NOT PRIMITIVES. To use primitive types use the wrapper class for that type. (Integer, Boolean, Character, Double.. etc)
    HashSet<Integer> numSet = new HashSet<>();
    HashSet<Boolean> boolSet = new HashSet<>();
    HashSet<Character> charSet = new HashSet<>();
    HashSet<Double> duoSet = new HashSet<>();
    
    //use the remove(); method to remove a value
    aSet.remove("three");
    System.out.print("The values in aSet after aSet.remove(\"three\"): ");
    System.out.println(aSet);

    //use the clear(); method to clear the HashSet
    aSet.clear();
    System.out.print("The values in aSet after using aSet.clear(): ");
    System.out.println(aSet);
  }
}

/*
Common Errors:

*/

/*
Practice:

*/