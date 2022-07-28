

//Java Regex
//Java API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/index.html

/* 
DISCLAIMER: 
This file is meant to highlight the code and what it is doing. 
You should not choose class, object, method, or variable names 
the way this file does. 
*/

/**
Notes:
  Regular expressions are sequences of characters that form a search pattern.
  Regex can bee used to for search patterns to describe what is beeing searched for.
    it can be a single character, or a more complicated pattern
    there is not a regulare expressions class bu there is the java.util.regex package    

      Classes in java.util.regex
      Pattern class = defines a pattern to be used in a search
      Matcher class = used to search for the pattern
      PatternSyntaxException class = indicates syntax error in a regular expression pattern
*/

import java.util.regex.Matcher; //import Matcher class
import java.util.regex.Pattern; //import Pattern class

class Regex {
  public static void main(String[] args){
    Pattern aPat = Pattern.compile("what Im looking for", Pattern.CASE_INSENSITIVE);//compile() method has parameters (searching for , case flag)
    //compile() method flags change depending on the search 
      //CASE_INSENSITIVE() case of letters will be ignored 
      //LITERAL special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search
      //UNICODE_CASE use it together with CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet.
    Matcher matcher = aPat.matcher("What Im Looking For Is In This Sentence."); //matcher(<string>) method searches for the pattern in the string
    boolean matchFound = matcher.find();//find() method returns true if the patern was found in the string and false if it was not.

    if(matchFound){
      System.out.println("Match Found");
    }else{
      System.out.println("Match not Found");
    }
  }
}

/*Brackets can be used to find a range of characters
Expression	Description
[abc]	      Find one character from the options between the brackets
[^abc]	    Find one character NOT between the brackets
[0-9]	      Find one character from the range 0 to 9

Metacharacters are character with a special meaning
Metacharacter	Description
|	            Find a match for any one of the patterns separated by | as in: cat|dog|fish
.	            Find just one instance of any character
^	            Finds a match as the beginning of a string as in: ^Hello
$	            Finds a match at the end of the string as in: World$
\d	          Find a digit
\s	          Find a whitespace character
\b	          Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
\uxxxx	      Find the Unicode character specified by the hexadecimal number xxxx

Quantifiers define quantities
Quantifier	Description
n+	        Matches any string that contains at least one n
n*	        Matches any string that contains zero or more occurrences of n
n?	        Matches any string that contains zero or one occurrences of n
n{x}	      Matches any string that contains a sequence of X n's
n{x,y}	    Matches any string that contains a sequence of X to Y n's
n{x,}	      Matches any string that contains a sequence of at least X n's

*/

/*
Common Errors:

*/

/*
Practice:

*/