import TurtleGraphics.KeyboardReader;

public class TimeMethod {

	public void ReadTime()
	{
		KeyboardReader reader = new KeyboardReader();
		int min1,sec1,min2,sec2;
		System.out.println("Enter a time:");
		System.out.print("   Enter minutes: ");
		min1=reader.readInt();
		System.out.print("   Enter seconds: ");
		sec1=reader.readInt();
		System.out.println("Enter another time:");
		System.out.print("   Enter minutes: ");
		min2=reader.readInt();
		System.out.print("   Enter seconds: ");
		sec2=reader.readInt();
		
		
		AddTime(min1, sec1, min2, sec2);
		
	}
	public void AddTime(int minutes1, int seconds1,int minutes2, int seconds2)
	{
		int secondstotal, minutestotal, hourstotal = 0;
		
		secondstotal=seconds1+seconds2;
		minutestotal=minutes1+minutes2;
		while(secondstotal>=60)
		{
			secondstotal=secondstotal-60;
			minutestotal=minutestotal+1;
		}
		while(minutestotal>=60)
		{
			minutestotal=minutestotal-60;
			hourstotal=hourstotal+1;
		}
		
		DisplayTime(minutestotal, secondstotal, hourstotal);
		
	}
	public void DisplayTime(int m, int s, int h)
	{
		System.out.print("Your total time was:  "+h+":");
		
		if(m<10)
		{
			System.out.print("0"+m+":");
		}
		else
		{
			System.out.print(m+":");
		}
		
		if(s<10)
		{
			System.out.print("0"+s);
		}
		else
		{
			System.out.println(s);
		}
	}
	
	
}
