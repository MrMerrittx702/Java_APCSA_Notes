//Java Interface
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  Interfaces are completely abstract classes that group related methods with empty bodies

*/

//interface
interface AnInterface {
  public void interfaceMethod();
  public void secondInterfaceMethod();
  public void thirdInterfaceMethod();
}

interface OtherInterface {
  public void thirdInterfaceMethod();
}

//to access interface methods use the implements keyword (not extends)
//the implement class provides the methods body
//access multiple interfaces by seperating them with a comma
class Implemented implements AnInterface, OtherInterface{//
  public void interfaceMethod(){
    System.out.println("The interfaceMethod was called");
  }
  public void secondInterfaceMethod(){
    System.out.println("The secondInterfaceMethod was called");
  }
  public void thirdInterfaceMethod(){
    System.out.println("The thirdInterfaceMethod was called");
  }
}

class Interfaces{
  public static void main(String[] args){
    Implemented implementedObj = new Implemented();
    implementedObj.interfaceMethod();
    implementedObj.secondInterfaceMethod();
    implementedObj.thirdInterfaceMethod();

  }
}

/*
Common Errors:

*/

/*
Practice:

*/