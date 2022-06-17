package cscourses;

/**
 *
 * @author Poten
 */
public class CSCourses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Course course1= new Course("CSC 112", 501);
        Course course2= new Course("CSC 212", 761);
        Course course3= new Course("CSC 312", 901);
        Course course4= new Course("CSC 812", 001);
        
        
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
        System.out.println(course4);
        
        Student student1 = new Student ("Amber Janosh");
        
        student1.AddCourse(course1);
        student1.AddCourse(course2);
        student1.AddCourse(course3);
        student1.AddCourse(course4);
        
        System.out.println(student1);
    }   
   
    
}
