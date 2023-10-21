import TurtleGraphics.KeyboardReader;

public class PrimeMain {

	public static void main(String[] args) {
		
		
		
		KeyboardReader reader = new KeyboardReader();
		 PrimeMethods  object = new  PrimeMethods ();
	
		 
		 
		 
		 
			 int number, useless=0;
				boolean sai;
		
				System.out.print("Enter a number: ");
		
				 number = reader.readInt();
			    sai= object.IsPrime(number);
				
				System.out.println();
				if(sai==true)
				{
					System.out.println(number+" is a prime number");
				}
				else
				   {
					System.out.println(number+" is not a prime number");
				   }
			   
		
	
		
		 
		 
		 
		 
	} 
		 
		 
		 

	}



