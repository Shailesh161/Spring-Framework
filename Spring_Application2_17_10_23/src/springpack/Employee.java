package springpack;

public class Employee
{
    private int id;
    private String name;
    
    public Employee()
    {
        super();
    }
    
    public Employee(int id)
    {
        super();
        this.id=id;
    }
    
    public Employee(String name)
    {
        super();
        this.name=name;
    }
    
    public Employee(String name,int id)
    {
        super();
        this.id=id;
        this.name=name;
    }
    
    public void displayData()
    {
        System.out.println("Id of employee is:"+id);
        System.out.println("Name of employee is:"+name);
    }
}

