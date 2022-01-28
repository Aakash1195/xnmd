package Exeption;

import java.util.Scanner;

public class CustomeException {

	static void validate (int age) throws Invalied
	{
	
		
		if (age<18)
		
		throw new Invalied("The candidate is Not Eligable");
		
		else
		
			System.out.println("The candidate is Eligable");
		}
	
	
	public static void main (String [] args){

		Scanner oj =new Scanner(System.in);
		System.out.println("Enter The First Value : ");
		int age=oj.nextInt();
		
		try {
			validate(age);
		    }
		catch(Exception e)
		{
			System.out.println("Exception Occured" +e.getMessage());			
		}
			System.out.println("The entier code is Done");
	}
}
			
	class Invalied extends Exception{
		
		Invalied(String s){
		super(s);
	}
}
