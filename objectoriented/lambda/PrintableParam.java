//Used with LambdaExpressions.java

/*
  This is called a SAM interface for single abstract method
  It can only contain one abstract method
  Lambdas can only work with functional interfaces
*/
package objectoriented;

@FunctionalInterface//this is an annotation
public interface PrintableParam {

  public void printParam (String suffix);//implements must create an implementation of this method.
}