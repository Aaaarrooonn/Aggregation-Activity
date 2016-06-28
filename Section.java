public class Section
{
	private	CourseInfo info;
	private String room;
	private String section;
	private Teacher faculty;
	private Student[] classlist;
	
	public Section(String courseCode, String courseTitle, double units, int term, int year, int studentno)
	{
		info = new CourseInfo(courseCode, courseTitle, units, term, year);
		classlist = new Student[studentno];
	}
			 
	public void setSection(String section)
	{
		this.section = section;
	}
	
	public void setRoom(String room)
	{
		this.room = room;
	}
	
	public void setTeacher(String name, int id)
	{
		faculty = new Teacher(name, id);
	}

	public void setTeacher(String name, int id, String[] list)
	{
		faculty = new Teacher(name, id, list);
	}

	public boolean isInClass(String name)
    {
	   if(classlist == null)
		   return false;
	   else{
		   int i = 0;
		   boolean found = false;
		   while (i < classlist.length && classlist[i] != null && !found)
			   if(classlist[i].getName().equalsIgnoreCase(name))
				   found = true;
			   else i++;
		   
		   return found;
	   }
    }

	public boolean addStudent(Student s)
    {
	   int i;
	   if(isInClass(s.getName()) == false){
		   if(classlist == null){
			   classlist = new Student[45];
			   for(i = 0; i < classlist.length; i++)
				   classlist[i] = null;
			   
			   classlist[0] = s;
			   return true;
		   }
		   else if(classlist[classlist.length - 1] != null){
			   // making sure there is at least 1 slot
			   i = 0;
			   while(i < classlist.length && classlist[i] != null)
				i++;
			
			   classlist[i] = s;
			   
			   return true;
		   }
		   else{
			   System.out.println("Class is full");
			   return false;
		   }
		   
	   }
	   else{
		   System.out.println("Student is already in the class");
		   return false;
	   }
		   
   }
   
	public Student[] getClasslist()
	{
		return classlist;
	}
	
}