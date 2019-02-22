import java.util.Scanner;

public class Vehicle {

	
	
	public static void main(String[] args)
	{
		
		//Vehicle v1=new Vehicle();
			
		
		System.out.println("*****ROYAL ENFIELD VEHICLE MANAGEMENT*****\n\n");
		
		frontview();
		
			
	}
	
	static void frontview()
	{
		System.out.println("1. BUY\n2. SELL \n3. MODIFICATION\n4. REGISTER\n5. Exit");
		
		System.out.println("\nSelect an option:\n");
		
		selection();
		
	}
	static void selection()
	{

		int i;
		Scanner sc=new Scanner(System.in);

		i=sc.nextInt();
		
		switch(i)
		{
			case 1:

				
				Buy B1=new Buy();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Selection\nPlease try again.");
				sc.close();
				selection();
				
		}
		sc.close();
		
	}
	
	
}
