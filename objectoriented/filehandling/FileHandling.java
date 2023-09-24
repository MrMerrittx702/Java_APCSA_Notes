//Java Files Handling
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:

*/
package objectoriented;

import java.io.File; //import the File class to used file related methods
import java.io.FileWriter; //import the FileWriter class to write to files
import java.io.IOException; // import the IOException class to handle errors
import java.io.FileNotFoundException;//import the FileNotFoundException to handle errors
import java.util.Scanner; // import Scanner class to read text files

class FileHandling{
  public static void main(String[] args){

   createFile("JavaTestFile.txt");
   writeToFile("JavaTestFile.txt");
   readFile("JavaTestFile.txt");
   getFileInfo("JavaTestFile.txt");
   deleteFile("JavaTestFile.txt");

   makeDirectory("TestDir");
   deleteDirectory("TestDir");

  }

  private static void createFile(String filename){
     try{
      //to use the File class create an object of the class and specifi the filename or directory name
      File fileObject = new File(filename);
      if (fileObject.createNewFile()){//createNewFile() returns bool creates an empty file
        System.out.println("File created: "+fileObject.getName());//getName() returns string name of the file
        /*
        To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the "\" 
        character (for Windows). File myObj = new File("C:\\Users\\MyName\\filename.txt");
        On Mac and Linux you can just write the path, like: /Users/name/filename.txt
        */
      }else{
        System.out.println("File already exists");
      }
    }catch(IOException e){
      System.out.println("You broke it, way to go.");
      e.printStackTrace();
    }
  }

  private static void writeToFile(String filename){
    try{
      File fileObject = new File(filename);
      FileWriter writeFile = new FileWriter(filename);
      writeFile.write("This file was created by FileHandling.java");//write(<string>) returns boolean and writes to file
      writeFile.close();//close() returns bool and closes the file you were writing.
      System.out.println("File written");
    }catch(IOException e){
      System.out.println("You broke it, way to go.");
      e.printStackTrace();
    }

  }

  private static void readFile (String filename){
    try{
      File fileObject = new File(filename);
      Scanner fileReader = new Scanner(fileObject);
      while (fileReader.hasNextLine()){
        String data = fileReader.nextLine();
        System.out.println(data);
      }
      fileReader.close();
    }catch (FileNotFoundException e){
      System.out.println("You broke it, way to go.");
      e.printStackTrace();
    }
  }

  private static void getFileInfo(String filename){
    File fileObject = new File(filename);
    if(fileObject.exists()){
      System.out.println("File name: " + fileObject.getName());
      System.out.println("Absolute path: " + fileObject.getAbsolutePath());
      System.out.println("Writeable: " + fileObject.canWrite());
      System.out.println("Readable " + fileObject.canRead());
      System.out.println("File size in bytes " + fileObject.length());
    }else{
      System.out.println("File not found.");
    }
  }

  private static void deleteFile(String filename){
    File fileObject = new File(filename);
    if (fileObject.delete()){
      System.out.println("Deleted file: " + fileObject.getName());
    }else{
      System.out.println("Failed to delete the file.");
    }
  }

  private static void makeDirectory(String dirName){
    File makeDir = new File(dirName);
    if(makeDir.mkdir()){
      System.out.println("Made Directory: "+ makeDir.getName());
    }else{
      System.out.println("Directory already exists.");
    }
  }

  private static void deleteDirectory(String dirName){
    File dir = new File(dirName);
    if (dir.delete()){
      System.out.println("Deleted directory: " + dir.getName());
    }else{
      System.out.println("Failed to delete the directory.");
    }
  }
}


/*
Classes used to read an write files in java
FileReader
BufferedReader
Files
Scanner
FileInputStream
FileWriter
BufferedWriter
FileOutputStream
*/

/* 
    Useful methods in the file class:
    canRead() returns bool and tests if file is readable
    canWrite() returns bool and tests if file is writable or not
    
    delete() returns bool deletes a file
    exists() returns bool tests whether a file exists
    
    getAbsolutePath() returns string absolute pathename of the file
    length()  returns long size of the file in bytes
    list() returns String[] array of the files in the drectory
    mkdir()returns bool creates a directory
    */