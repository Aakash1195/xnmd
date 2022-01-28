package Exeption;

import java.io.IOException;

public class complileException {

	void m() throws IOException, ClassNotFoundException
	{
		 throw new IOException ("Device Error");
		
	}
	void n() throws IOException, ClassNotFoundException
	{
		m();
	}
	
	void o() throws IOException, ClassNotFoundException
    {
		try{
			n();
	 	   }
		catch (Exception e) {
			System.out.println("Exception Handling");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getClass());
			
		                    }
	}

		public static void main(String [] args) throws ClassNotFoundException, IOException {
	   complileException pk =new complileException();
		pk.o();
			
			System.out.println("The system is printed");
		
		}
	}
	

	

