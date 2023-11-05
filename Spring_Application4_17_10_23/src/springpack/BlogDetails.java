package springpack;

public class BlogDetails 
{
	private int id;
	private String nameOfBLog;
	private String blogDescription;
	
	public BlogDetails(int id, String nameOfBLog, String blogDescription) 
	{
		super();
		this.id = id;
		this.nameOfBLog = nameOfBLog;
		this.blogDescription = blogDescription;
	}


	public String toString() 
	{
		return "BlogDetails [id=" + id + ", nameOfBLog=" + nameOfBLog + ", blogDescription=" + blogDescription + "]";
	}
	
}
