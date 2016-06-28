public class Name
{
	public Name(String a, String b, String c)
	{
		first = a;
		middle = b;
		last  = c;
	}
	
	public void setName(String a, String b, String c)
	{
		first = a;
		middle = b;
		last  = c;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getMiddle()
	{
		return middle;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public String getName()
	{
		return (first + " " + middle + " " + last);
	}
	
	private String first;
	private String middle;	
	private String last;
}