package springpack;

import java.util.List;
import java.util.Iterator;


public class Blogger
{
	private int id;
	private String nameOfBlogger;
	private List<BlogDetails> blogDetails;
	
	

	public Blogger(int id, String nameOfBlogger, List<BlogDetails> blogDetails) {
		super();
		this.id = id;
		this.nameOfBlogger = nameOfBlogger;
		this.blogDetails = blogDetails;
	}
	
	public void Show()
	{
		System.out.println("Show");
	}
	
	public void printBloggerDetails()
	{
		System.out.println("ID of Blogger is:"+id);
		System.out.println("name of blogger is:"+nameOfBlogger);
		System.out.println("Blogger Details are: \n");
		
		Iterator<BlogDetails> iterator =blogDetails.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
} 
