package Exeption;

import java.util.Scanner;

public class Pagar {
	
	public String name="exceptional";
	public String getName(){
		return name;
	}
	

	static void Pagar (int salary) throws Handle {
		
		if (salary<2100)
		{
			throw new Handle("U need to work hard ");
		}
		
		else if (salary >2100 && salary <= 5000)
		{
			throw new Handle ("Your salary is somehow good. ");
		}
		else if (salary>5100 && salary <=9000)
		{
			throw new Handle("Your salary is very good. ");
		}
		
}	
	
	public static void main(String [] args){
		
		Scanner oj =new Scanner(System.in);
		System.out.println("Enter The Salary Amount : ");
		int salary=oj.nextInt();
		
		 try{
			 Pagar(salary);
		    }
		
		 catch (Exception m){
			 System.out.println("Exception occured :  " +m.getMessage());
		 }
		 System.out.println("code is done");
		}
	
static class Handle extends Exception{
	Handle(String s){
		super(s);
	}
}
}

