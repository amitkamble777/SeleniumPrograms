package ASampleProgram;

public class FactorialNum {

public static void main(String[] args) {
int num=5;          // if we given  num = 0  output will be one
int factorial=2;  // if we given factorial = 0 output will be zero

//factorial= 1  1*2*3*4*5= 120
//factorial = 2 = 120*2= 240;  facorial = 3   120*3=360

for (int i=1; i <= num; i++)
	// in for loop if give i=3  then output will be 3*4*5=60
//In for loop if given i=0 --> output will be zero
{
 factorial*=i;	
}
System.out.println("Factorial of number:" + factorial);
}

}
