package springpack;

public class BlogDetails 
{
	private int id;
	private String nameOfBLog;
	private String blogDescription;
	
	
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNameOfBLog() {
		return nameOfBLog;
	}


	public void setNameOfBLog(String nameOfBLog) {
		this.nameOfBLog = nameOfBLog;
	}


	public String getBlogDescription() {
		return blogDescription;
	}


	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}


	

	public String toString() 
	{
		return "BlogDetails [id=" + id + ", nameOfBLog=" + nameOfBLog + ", blogDescription=" + blogDescription + "]";
	}
	
}
