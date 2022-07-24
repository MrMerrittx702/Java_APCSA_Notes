//Java Inheritance
//subclass or child: class that inherits from another class
//superclass or parent: the class being inherited from

// Use the 'extends' keyword, to inherit from a class.

class Parent{
  public String parentAttribute = "This attribute is inherited from the parent.";
  public void parentMethod(){
    System.out.println("This method is inherited from the parent.");
  }
}

class Child extends Parent{
  public String childAttribute = "This attribute is owned by Child.";    
}

class Inheritance {
  public static void main(String[] args){
    Child childObject = new Child();

    childObject.parentMethod();
    System.out.println(childObject.parentAttribute + " " + childObject.childAttribute);

  }
}