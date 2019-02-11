import java.util.Scanner;

public class Vehicle {

	static int i;
	public static void main(String[] args)
	{
		
		//Vehicle v1=new Vehicle();
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("*****VEHICLE MANAGEMENT SYSTEM*****\n\n");
		
		System.out.println("1. BUY\n2. SELL \n3. MODIFICATION\n4. REGISTER\n");
		
		System.out.println("Select an option:\n");
		
		i=sc.nextInt();

		switch(i)
		{
			case 1:break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:break;
			default:
				System.out.println("Invalid Selection");
				break;
		}
		
		//Buy b1=new Buy();
		
		
		sc.close();
	}
	
	static void selection()
	{
		
	}
	
}
