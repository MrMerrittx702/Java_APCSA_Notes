//Java Nested Classes
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:

*/

//Classes inside classes

class OuterClass {
  public int x = 10;

  class InnerClass {
    public int y = 5;
  }

  /*private class PrivateInner{ //if you try to access this class you will get an error.
    int z = 2;
  }*/

  /*static class StaticInner{ //you can access this class without creating an object of the outer class.
    int a = 9;
  }*/

  /*class InnerAccessOuter{
    public int innerMethod(){
      return x;
    }
  }*/
}

public class Nested_Classes {
  public static void main(String[] args){
    OuterClass outerObj = new OuterClass();
    
    OuterClass.InnerClass innerObj = outerObj.new InnerClass();
    System.out.println(innerObj.y + outerObj.x);

    //OuterClass.PrivateInner privateInnerObj = outerObj.new InnerClass();//errors 
    //System.out.println(privateInnerObj.z + outerObj.x);
    
    //OuterClass.StaticInner staticInnerObj= new OuterClass.InnerClass;
    //System.out.println(staticInnerObj.a);

    //OuterClass.InnerAccessOuter accessOuterObj = outerObj.new InnerAccessOuter
    //System.out.println(accessOuterObj.innerMethod());
  }
}

/*
Common Errors:

*/

/*
Practice:

*/