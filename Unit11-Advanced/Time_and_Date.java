//Java Date and Time
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  There is no built in date class in java
  import java.time package to work with date and time
  we are using java's API or in other words code written by others.
    Classes in java.time
      LocalDate represents a date yyyy-MM-dd
      LocalTime represents a time HH-mm-ss-ns
      LocalDateTime represents both date and time
      DateTimeFormatter is used to display or parse date-time objects 

      note: Parsing is the process of analyzing text 
*/

import java.time.*; //import the entire java.time package
import java.time.format.*; //import the entire jave.time.format package

class Time_and_Date {
  public static void main (String[] args){
    LocalDate dateObject = LocalDate.now(); //Creates a date object
    System.out.println(dateObject);// prints current date

    LocalTime timeObject = LocalTime.now(); // creates a time object
    System.out.println(timeObject); // prints current time

    LocalDateTime dateTimeObject = LocalDateTime.now(); // creates a datetime object
    System.out.println(dateTimeObject); // prints current date and time

    DateTimeFormatter formatObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    /*
    ofPattern(); accepts many different values
      yyyy-MM-dd
      dd/MM/yyyy
      dd-MMM-yyyy
      E, MMM DD yyyy
    Try them out.
    */
    
    String formattedDate = dateTimeObject.format(formatObject);
    System.out.println("Formatted: " + formattedDate);
  }
}



