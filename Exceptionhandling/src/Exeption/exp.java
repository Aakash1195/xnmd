package Exeption;

public class exp {
	
	public static void main (String [] args){
		
	
	int num1,num2,num3;
	num1=100;
	num2=0;
	
	try {
	num3=num1/num2;
	System.out.println("The result is "+num3);	
	}
	
	catch (ArithmeticException AE)
	{
		System.out.println("The number cant be divided by 0 ");
	}
	catch(Exception ae1) 
	{
		System.out.println("i am before the subclass exception");
	}
	finally 
	{		
		System.out.println("So this Finally block will be executed");
	}
	
	num3=num1+num2;
	System.out.println("The addition is "+num3);
	}
}
