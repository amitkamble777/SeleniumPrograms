package interviewString;

import java.lang.String;

public class Stringequal {

	public static void main(String[] args) {
	String s1= "Hello";
	
	String s2= new String ("Hello");
	
	java.lang.String s3="Hello1";
	
	if(s1.equals(2))  //if(s1.equals(s3))  we can use this method also
	{
		System.out.println("s1 and s2 equal");
	}
	
	else
	{
		System.out.println("s1 and s2 not equal");
	}
	
	if(s1==s3)  //String pool cant accept the duplicate value
	{
		System.out.println("s1 and s3 equal"); //Only one time Hello word save in String constan pool
	}
	else
	{
		System.out.println("s1 and s3 not equal");
	}
	}

}
