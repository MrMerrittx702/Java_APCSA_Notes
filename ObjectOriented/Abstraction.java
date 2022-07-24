//Java Abstraction
//Abstraction hides details

//abstract keyword is a non-access modifiers used for classes and methods
// abstract classes cannot be used to create objects and to access the class it must be inherited form another class
// abstract methods can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

abstract class Abstracted {
  public abstract void abstractMethod();
  public void regularMethod(){
    System.out.print("The method is apart of Abstracted.");
  }
}

class Inherited extends Abstracted {
  public void abstractMethod(){
    //here is the body of abstractMethod
    System.out.println("This method is apart of Inherited.");
  }
}

class Abstraction{
  public static void main(String[] args){
    //Abstracted abstractedObj = new Abstracted();// generates and error

    Inherited inheritedObj = new Inherited();
    inheritedObj.abstractMethod();
    inheritedObj.regularMethod();
  }
}