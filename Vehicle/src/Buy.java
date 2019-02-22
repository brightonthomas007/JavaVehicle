import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Buy {
	

	
	Buy()
	{
		view();
	}
	
	static public void view()
	{
		  String filedirectory="D:/JavaProjects/Vehicle/src/VehicleDetails.txt";
		try
		{
		  File file = new File(filedirectory);
		  FileReader fr = new FileReader(file);
		  BufferedReader br = new BufferedReader(fr);
		  String line;
		  while((line = br.readLine()) != null){
		      System.out.println(line);   
		  }
		  br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("\n1.Select a bike of your choice\n2.Go back to previous screen.\n3.Exit");

		view2();
		
	}
	
	static void view2()
	{
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		switch(i)
		{
		case 1:
			System.out.println("\nEnter Bike no:\n");
			int j=sc.nextInt();
			if(j<1 || j>6)
			{
				System.out.println("Wrong bike number.Try Again..");
				view2();
				break;
			}
			VehicleDetails vd=new VehicleDetails(j);
			break;
		case 2:
			Vehicle.frontview();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Selection. Try again.");
			view2();
			break;
		}
		sc.close();
		
	}
	
}
