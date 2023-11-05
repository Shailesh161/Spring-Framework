package springpack;

public class Employee 
{
	private int id;
	private String name; 
	private Address address;
	
	public Employee() 
	{
		super();
	}

	public Employee(int id) 
	{
		super();
		this.id = id;
	}

	public Employee(String name) 
	{
		super();
		this.name = name;
	}

	public Employee(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Address address) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	
	public void string_obj() 
	{
		System.out.println("Employee [id=" + id + ", name=" + name + ", address=" + address + "]");
	}
	
	
	
	
	
}
