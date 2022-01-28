package Exeption;

public class mulipleHandling {
	int a =909;
	
	public static void main (String [] args){
		
		try
	{
			
				int a[]=new int [4];
				a[7]=5;
				int mm =6/0;
				
			}
		
		catch (ArithmeticException dd){
			System.out.println("The numbers can not be devided");
			
		}
		
		catch(ArrayIndexOutOfBoundsException aae)
		{
		System.out.println("The Arrey index error");	
		}
		catch (Exception s1)
		{
			System.out.println("The subclass");
		}
		finally {
			System.out.println("Rest of the code");
		}
	}
	

}
