public class Teacher
{
   public Teacher(String name)
   {
      this(name, 11600001);
   }

   public Teacher(String name, int id)
   { 
      this(name, id, null);
   }

   public Teacher(String name, int id, String[] list)
   { 
      this.name = name;
            
      if (id >= 11600000 && id <= 99999999)
         this.id = id;
      else this.id = 11600001;

      a = list;
   }

   public String getName()
   {   
      return name;
   }

   public int getID()
   {
      return id;
   }

   public String[] getA()
   {
      return a;
   }
   
   public void setA(String[] content)
   {
	   if (a != null)
		   System.out.println("Replacing old entry");
	
       a = content;
   }

   public String toString()
   {  String temp = "";
      int x;
      if (a != null)
        for (x = 0; x < a.length; x++) 
           temp = temp + a[x] + "\n";  

      return name + " (" + id + "): \n" + temp;
   }

   public boolean isInList(String key)
   {
      boolean found = false;

      if (a == null)
        return false;
      else {
         int i = 0;
         while (i < a.length && !found)
            if (a[i].equalsIgnoreCase(key))
               found = true;
            else i++;
 
         return found;
     }           
   }

   public boolean isSameA(Teacher otherTeacher)
   {
       if (a == null && otherTeacher.a == null) {
           System.out.println("both are empty");
		   return true;
	   }
       else if (a == null || otherTeacher.getA() == null)
           return false;
       else {
         int i;
         boolean eq = true;
         for (i = 0; i < otherTeacher.a.length; i++)
           if (isInList(otherTeacher.a[i]) == false)
              eq = false;
         return eq;
      } 
   } 

   private String name;
   private final int    id;
   private String[]     a; 
}