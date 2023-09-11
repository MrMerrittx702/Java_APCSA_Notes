//Java Modifiers
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


//Access Modifiers for classes
    //public: accessible by any other class
    //default: the class is only accessible by classes in the same package
        //used when you do not specify a modifier
//Non-access Modifiers for classes
    //final: class cannot be inherited by other classes
    //abstract: class cannot be used to create objects
public class Modifiers{
    //Access modifiers for attributes, methods, and constructors
        //public: code is accessible for all classes
        //private: code is only accessible within the declard class
        //protected: code is accessible in the same package and subclasses.
        //default: code is only accessible in the same package and subclasses
        public Object example;
        private Object example;
        protected Object example;
        Object example;

    //Non-access modifiers for attributes and methods
        //final: attributes and methods cannot be overridden/modified
        //static: attributes and methods belong to the class, rather than an object
        //abstract: can only be used in an abstract class, and can only be used on methods
        //transient: attributes and methods are skipped when serializing the object containing them
        //synchronized: methods can only be accessed by one thread at a time
        //volatile: the value of the attribute is not cached thread-locally, and is always read from he main memory
        final Object example;
        static Object example;
        abstract Object example;
        transient Object example;
        synchronized Object example;
        volatile Object example;
        
    public static void main(String[] args){
        
    }
}

/*class Modifiers{
    public static void main(String[] args){

    }
}*/


/*
Common Errors:

*/

/*
Practice:

*/