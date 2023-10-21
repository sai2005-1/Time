
public class PrimeMethods {
	
	public boolean IsPrime (int number)
	
	{
		boolean Prime=true;
		 int counter=2;
		 while(counter<number)
		 {
		    if(number % counter == 0)
		    {
		  Prime = false;
		 	break;
		    }
		    counter++;
		    
		 }
		 return Prime;
	}

}
