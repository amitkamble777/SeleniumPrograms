package interviewString;

/*
 What is string 
 String is a sequence of charactes in java programming language 
 String is immutable once String Object  is created, its content can't be changed

  String is a java class defined in java lang package , its not a primitive data type like  int  and long
  
 How to create a String Object ?
  By using 2 ways 
  1. By String literal
  
   String literal is created by using double quotes
  
  2.By new Keyword
  
  
 */

public class String {

	public String(java.lang.String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(java.lang.String[] args) {
		
//String literal 
java.lang.String s= "Amit";

System.out.println(s);
//Sting By new Keyword

String ab= new String("Wipro");
		
System.out.println(" String:" +ab);
		
	}

}
