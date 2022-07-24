//Java Object-Oriented Progamming(OOP)
//Benefits of OOP
    //faster and easier to execute
    //provides a clear structure for programs
    //prevents repetition of code DRY "Don't Repeat Yourself" 
    //code is easier to maintain, modify, and debug.
    //makes it possible to make full reuseable applications with less code and shorter development time. 

//Everything in java is associated with classes and objects. 

//Classes and Objects the two main aspects of OOP
//A class is a template for  objects
//objects are a instance of a class that inherit variables and methods from the class. 

public class OOP{//Created the class OOP
    private int x = 0;
    private int y = 1;
    private int z;
    //the variables above are "attributes" of the class "OOP"
    // attributes can also be called fields

    // a constructor is a special method that is used to initialize objects.
    // the constructor is called when an object of a class is created. 
    // it can be used to set initial values for attributes
    public OOP(int number){// this is a class constructor for th OOP class
        //the contructor has the parameter "number"
        z = 2;//setting the initial value of the z attribute
        a = number;// the parameter is stored as the attribute a
        //there is no limit to the number of parameters
    }

    public static void main(String[] args){
        //Using multiple objects
        OOP anObject = new OOP();//created the object "anObject" of the class "OOP"
        System.out.println(anObject.x + "\n" + anObject.y);
        //attributes are accessed by creating an object of a class and then using dot syntax (object.attribute)
        
        OOP anotherObject = new OOP();//created the objext "anotherObject" of the class "OOP"
        anotherObject.z = 2;//setting the value of attribute z
        anotherObject.x = 1;//overriding the existing value of x
        System.out.println(anotherObject.x + "\n" + anotherObject.y + "\n" + anotherObject.z);

        //values of attributes can be changed without effecting other objects of the class
        OOP otherObject = new OOP();
        otherObject.x = 5;
        System.out.println("anObject.x --> " + anObject.x + "\n" + "otherObject.x --> " + otherObject.x);
    
        OOP fromConstructor = new OOP();// creating an object of the class OOP calls the constructor
        System.out.println("The intial value of z is:" + fromConstructor.z);// printing the intial value of z from the constructor. 
        
        OOP constructWithParameter = new OOP(10);//object with passed argument
        System.out.println("The passed value for a is:" + constructWithParameter.a);
    }
}



