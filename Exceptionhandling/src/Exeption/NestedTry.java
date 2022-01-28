package Exeption;

public class NestedTry {
	
	static int A[]= new int [9];

	public static void main (String [] args){
		try {
			
			checkException();
			
			 try{
			checkException2();
			 }
	
		finally {
			System.out.println("Successfully Executed ");
				} 
			 }
		catch (ArithmeticException s2)
			 {
			System.out.println("The Unresolved Method");
			 }
	}
	
	public static void checkException(){
		
		try {
			
			
			A[3]=7/1;
					
			
		}
		finally
		{
			System.out.println("Nested finally block will execute first");
		}
	}

	public static void checkException2(){
		try 
		{
			A[7]=8/0;
		}
		
		finally 
		{
			System.out.println("checkException2 is calling");
		}
	}
	}

