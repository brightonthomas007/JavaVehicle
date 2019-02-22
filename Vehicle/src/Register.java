import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Register
{
	String userName;
	int age;
	long phno;
	String address;
	
	
	
	public void initial() 
	{
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		Register r=new Register();
		
		String s="";
		int x;
		long y;
		
		System.out.println("\nEnter your name:");
		s=sc.nextLine();
		r.setUserName(s);
		
		System.out.println("Enter your age:");
		x=sc.nextInt();
		r.setAge(x);
		
		System.out.println("Enter your Phone no:");
		y=sc.nextLong();
		r.setPhno(y);
		
		System.out.println("Enter your address:");
		s=sc.nextLine();
		s=sc.nextLine();
		r.setAddress(s);
		
		

		try {
			FileOutputStream fos = new FileOutputStream("EmployeeObject.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// write object to file
			oos.writeObject(r);
			System.out.println("\nRecord has been saved\n");
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		sc.close();
		
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
