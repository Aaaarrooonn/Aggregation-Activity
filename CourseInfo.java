public class CourseInfo
{
   private String courseCode;
   private String courseTitle;
   private double units;
   private int term;
   private int year;
   
   public CourseInfo(String courseCode, String courseTitle, double units,
				 int term, int year)
   {
	   setCode(courseCode);
	   setTitle(courseTitle);
	   setTerm(term);
	   setYear(year);
	   setUnit(units);
   }
	
   
   public void setCode(String code)
   {
       if (code.length() == 7)
	      courseCode = code;
	   else System.out.println("Invalid course code");	  
   }
   
   public void setTitle(String title)
   {
		courseTitle = title;
   }
   
   public void setTerm(int term)
   {
		this.term = term;
   }
   
   public void setYear(int year)
   {
		this.year = year;
   }
   
   public void setUnit(double units)
   {
		if(units == 0.5 || units == 1 || units == 2 || units == 3 || units == 4)
			this.units = units;
		else System.out.println("Invalid number of units");	 
   }
   
   public int getTerm()
   {
	   return term;
   }
   
   public double getUnits()
   {
	   return units;
   }
   
   public String getTitle()
   {
	   return courseTitle;
   }
   
   public String getCode()
   {
	   return courseCode;
   }
   
   public int getYear()
   {
		return year;
   }
}