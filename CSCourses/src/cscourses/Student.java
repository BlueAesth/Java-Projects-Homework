package cscourses;

/**
 *
 * @author Poten
 */
public class Student 
{
    private static final int MAX_COURSES = 6; /*Static, every instance of student would share it, exsisting once.*/
    private int numCourses;
    private String name;
    private Course[] courseList;
    
    
    public Student(String name) 
    {
        this.name = name;
        courseList = new Course[MAX_COURSES];
        numCourses = 0;
    }

    public void AddCourse(Course c)
    {
        if (numCourses != MAX_COURSES)
        {
            courseList[numCourses] = c;
            numCourses++;
        }
        else
        {
            System.out.println("Could not add course.");
        }
    }
    @Override
    public String toString() 
    {
        String msg;
        
        msg = "Student name=" + name + "\n" +
                "Number of courses=" + numCourses + "\n";
        
        for(Course temp : courseList)/*For loop that you cannot get out early from, unless you put a if or forbidden break statement, temp moves up elements*/
        {
            if(temp != null)
            msg += temp.toString() + "\n";
        }
                
        return msg;
    }
    
    
}
