//Not finished yet

//Java Threads
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
Threads allow a program to operate more efficiently by doing multiple things at the same time.
threads can be used ot perform complicated tasks in the background without interrupting the main program.

There are two ways to create a thread
It can be created by extending the Thread class and overriding its run() method

*/

class MultiThreading extends Thread{
//extend Threads prevents the class form extending another.

//class MultiThreading implements Runnable{
//Threads can also be implemented with the Runnable interface
//The class can implement the runnable interface, the thread can be run by passing an instance of the class 
//to a Thread object's constructor and then calling the thread's start() method:
  
  private int threadNum;
  public MultiThreading (int threadNum){
    this.threadNum = threadNum;
  }

  public static void main (String[] args){
    MultiThreading thread1 = new MultiThreading(1);//creating object of MultiThreading object
    MultiThreading thread2 = new MultiThreading(2);

    //use start() instead of run() for concurrent threads
    thread1.start();
    thread2.start();

    System.out.println("This code is outside of the threads");

    while(thread1.isAlive() && thread2.isAlive()){
      //empty while loop used to wait until thread1 and thread2 are finished
    } 
    
    makeThreads();

  }
  

  //if the class extends the Thread class,the thread can be run by creating an instance of the class and call its start() method:
  @Override 
  public void run(){//called using start()
    for(int i = 0; i < 5; i++){
      System.out.println(i + "from thread: " + threadNum);

      try{
      Thread.sleep(1000);//in ms so this is 1 second
    }catch (InterruptedException e){
      
    }
    }
  }

  public static void makeThreads(){
    for (int i = 0; i<=3;i++){
      MultiThreading thread = new MultiThreading(i);
      thread.start();
    }
  }
}
//Concurrency Problems
/*Because threads run at the same time as other parts of the program there is no way
to know in what order the code will run. When the threads and main program are reading
and writing the same variables, the values are unpredictable. The resulting problem is 
called a concurrency problem.

to avoid concurrency problems, it is best to share as few attributes between threads as possible.
If attributes need to be shared, one possible solution is to use the isAlive() method of the thread
to check whether the thread has finished running before using any attributes that the thread can change.
*/

/*
Common Errors:

*/

/*
Practice:

*/