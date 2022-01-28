package Exeption;

import java.util.Scanner;

public class ThrowClass {
	
	static int add(int a, int b){
		if (a> 800){
			throw new ArithmeticException("The Value of a is Greter than 800 so exception Occured"); 
		}
		else {
			System.out.println("Both The values are Corrrect");
		}
	
	return a+b;
	}

public static void main (String [] args){
	int res=0;
	
	Scanner oj =new Scanner(System.in);
	System.out.println("Enter The First Value : ");
	int a=oj.nextInt();
	
	System.out.println(" ");
	
	System.out.println("Enter the Second Value : ");
	int b=oj.nextInt();
	
	try {
		res=add(a,b);
	}
	catch (ArithmeticException Ae){
	
		System.out.println("Result is : "+res);
}
}
}