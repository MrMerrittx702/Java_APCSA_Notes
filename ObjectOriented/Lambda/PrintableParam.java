@FunctionalInterface
//called a SAM interface for single abstract method
//can only contain one abstract method
//lambdas can only work with functional interfaces
public interface PrintableParam {

  public void printParam (String suffix);//implements must create an implementation of this method.
}