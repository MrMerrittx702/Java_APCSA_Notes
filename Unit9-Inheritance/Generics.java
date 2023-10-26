package objectoriented;

public class Generics {
  
  public static <E> void println(E value){
    System.out.println(value);
  }
  
  public static <E> void print(E value){
    System.out.print(value);
  }

  public static void main(String[] args) {
    
    println(2 + 2);
  }

}
