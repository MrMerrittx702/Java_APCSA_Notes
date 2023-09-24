//Used with LambdaExpressions.java
package objectoriented;

public class Thing implements Printable,PrintableParam,PrintableReturn{

  public void print(){
    System.out.println("Printing from class Thing print() method.");
  }

  public void printParam (String suffix){
    System.out.println("Printing from the class Thing printWithParam method." + suffix);
  }

  public String printReturn (String s){
    return "Print from the class Thing printReturn method." + s;
  }
}