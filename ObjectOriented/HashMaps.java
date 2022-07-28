//Java HashMaps
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
HashMaps are often called dictionaries in other languages like Python

HashMaps store key:value pairs

*/

import java.util.HashMap; // import the HashMap class

class HashMaps {
  public static void main(String[] args){
    //create a HashMap object
    HashMap<String, String> passwordHash = new HashMap<String, String>();

    //some HashMap methods
    // to add key:value pairs use the put() method. 
    passwordHash.put("jane", "password");
    passwordHash.put("john", "123456");
    passwordHash.put("devin", "1234567890");
    passwordHash.put("sarah", "password1");
    passwordHash.put("kirkendoll", "Airedale1");
    //please do not use passwords like these

    System.out.println("The HashMap passwordHash key:value pairs are: ");
    System.out.println(passwordHash);

    //use keySet() to access just the keys
    System.out.print(passwordHash.keySet());
    
    //use values() to access just the values
    System.out.println(passwordHash.values());

    //access and item with get() method
    //passwordHash.get(<key>);
    System.out.print("The value of the key is: ");
    System.out.println(passwordHash.get("kirkendoll"));

    //remove and item with remove() method
    passwordHash.remove("john");
    System.out.print("passwordHash after removing key:value john : ");
    System.out.println(passwordHash);

    //return the number of elements with the size() method;
    //passwordHash.size();
    System.out.print("The size of the passwordHash HashMap is: ");
    System.out.println(passwordHash.size());

    //Looping through a HashMap with a for-each loop
    System.out.print("Looping through the passwordHash HashMap: ");
    for(String spot : passwordHash.keySet()){
      System.out.print(passwordHash.get(spot));
      System.out.print(" ");
    }

      System.out.println(" ");

    //HashMap stores OBJECTS NOT PRIMITIVES. To access primitive data types use the wrapper class for each type(Integer,Boolean,Character,Double, etc.)
    HashMap<Integer, Integer> intMap = new HashMap<>();
    HashMap<Boolean, Boolean> boolMap = new HashMap<>();
    HashMap<Character, Character> charMap = new HashMap<>();
    HashMap<Double, Double> duoMap = new HashMap<>();

    //clear all items with the clear() method
    passwordHash.clear();
    System.out.print("passwordHash values after clear() method: ");
    System.out.println(passwordHash);
  }
}

/*
Common Errors:

*/

/*
Practice:

*/