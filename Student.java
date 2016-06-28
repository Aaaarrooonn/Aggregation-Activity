public class Student
{
	public Student(String a, String b, String c, int num, int courseno)
	{
		name = new Name(a, b, c);
		idnum = num;
		courses = new CourseInfo[courseno];
	}
	
	public int getidnum()
	{
		return idnum;
	}
	
	public String getName()
	{
		return name.getName();
	}
	
	private final Name name;
	private final int idnum;	
	private final CourseInfo[] courses;
}