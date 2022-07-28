//Java Polymorphism
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  Polymorphism literally 'many' 'forms' allows for the use of methods to perform different tasks. 
  Different classes can inherit a method and perform a different function
*/



class Parent{
  public void sayClassName(){
    System.out.println("sayClassName prints Parent");
  }
}

class Child1 extends Parent{
  public void sayClassName(){
    System.out.println("sayClassName prints Child1");
  }
}

class Child2 extends Parent{
  public void sayClassName(){
    System.out.println("sayClassName prints Child2");
  }
}

class Polymorphism {
  public static void main(String[] args){
    Parent parentObj = new Parent();
    Child1 child1Obj = new Child1();
    Child2 child2Obj = new Child2();

    parentObj.sayClassName();
    child1Obj.sayClassName();
    child2Obj.sayClassName();
  }
}

/*
Common Errors:

*/

/*
Practice:

*/