package springpack;

public class Student 
{
	private String name;
	private String address;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public void displaydata()
	{
		System.out.println("Name of student is :"+name);
		System.out.println("Address of student is :"+address);
		
	}
}
