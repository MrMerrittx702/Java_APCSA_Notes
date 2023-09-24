//Java LinkedList
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  LinkedLists are collections of objects of the same type with all of the same methods as an ArrayList
  a LinkedList stores items in containers and each container has a link to the next contianer in the list.
  Typically an ArrayList is used for storing and accessing data, and LinkedList is used to manipulate data.
  a LinkedList adds more methods to do certian operations more efficiently

  addFirst(); add an item to the beginning of the list
  addLast(); add and item to the end
  removeFirst();
  removeLast();
  getFirst();
  getLast();
*/

import java.util.LinkedList;

class LinkedLists {
  public static void main(String[] args){


    LinkedList<String> linkList = new LinkedList<>();
    linkList.add("a value");
    linkList.add("b value");
    linkList.add("c value");

    linkList.addFirst("z value");
    linkList.addLast("d value");
    System.out.print("linkList after adding first and last: ");
    System.out.println(linkList);

    linkList.removeFirst();
    linkList.removeLast();
    System.out.print("linkList after removing first and last: ");
    System.out.println(linkList);

    System.out.print("using getFirst() : ");
    System.out.println(linkList.getFirst());
    
    System.out.print("using getLast() : ");
    System.out.println(linkList.getLast());
  }
}

/*
Common Errors:

*/

/*
Practice:

*/