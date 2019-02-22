import java.util.HashMap;

public class VehicleDetails
{
	String name,mileage,price;
	
	HashMap<Integer,VehicleDetails>hashDetails=new HashMap<>();
	
	public VehicleDetails(){}
	
	public VehicleDetails(int j) 
	{
		enterDetails(j);
	}
	
	public VehicleDetails(String a,String b,String c) 
	{
		
		this.name=a;
		this.mileage=b;
		this.price=c;
	}
	
	void enterDetails(int sel)
	{
		VehicleDetails v[]=new VehicleDetails[6];
		
		v[0] = new VehicleDetails("Royal Enfield Classic 350","37Kmpl","1213212"); 
			hashDetails.put(1, v[0]);
			
		v[1]=new VehicleDetails("Royal Enfield Thunderbird 350x","35Kmpl","1,56,000");		
			hashDetails.put(2, v[1]);
			
		v[2]=new VehicleDetails("Royal Enfield Himalayan","45Kmpl","1,67,550");		
			hashDetails.put(3, v[2]);
			
		v[3]=new VehicleDetails("Royal Enfield Continental GT 650","26Kmpl","2,65,000");		
			hashDetails.put(4, v[3]);
			
		v[4]=new VehicleDetails("Royal Enfield Thunderbird 500x","38Kmpl","1,98,000");		
			hashDetails.put(5, v[4]);
			
		v[5]=new VehicleDetails("Royal Enfield Classic Chrome","34Kmpl","1,88,868");		
			hashDetails.put(6, v[5]);
			
			VehicleDetails temp=new VehicleDetails();
			temp=hashDetails.get(sel);
			System.out.println("\n\nYou have Selected " + temp.name + "\nPrice: " + temp.price+"\nMileage:"+temp.mileage);
			
			Register r1=new Register();
			r1.initial();
		
		
	}
	
}
