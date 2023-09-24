package functional;

public class Test {
  
  public boolean squirrelPlay(int temp, boolean isSummer) {
    
    return ((temp > 59 && (isSummer && temp <=100)) || temp <= 90 );
  }
}
