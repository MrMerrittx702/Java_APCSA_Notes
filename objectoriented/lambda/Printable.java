//Used with LambdaExpressions.java

/*
  This is called a SAM interface for single abstract method
  It can only contain one abstract method
  Lambdas can only work with functional interfaces
*/
package objectoriented;

@FunctionalInterface//this is an annotation
public interface Printable {

  void print();//implements must create an implementation of this method.

}