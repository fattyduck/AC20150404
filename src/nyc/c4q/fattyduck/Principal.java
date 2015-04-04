package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/4/15.
 *//**
 * Created by fattyduck on 4/4/15.
 */
import java.util.HashMap;


public class Principal {
    private String           name;
    private HashMap<String, Teacher> teachers;

    public Principal(String name)
    {
        this.teachers = new HashMap<String, Teacher>();
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void addTeacher(Teacher teacher){
        teachers.put(teacher.getName(), teacher);
    }
    // Given a color, return the number of students that have this
    // color lunchbox
    public int numOfStudentsWithCertainColorLunchbox(String color){
        int count=0;
        for(String teacher: teachers.keySet()){
            for(String S1:teachers.get(teacher).getStudents().keySet()){
                Student S2=teachers.get(teacher).getStudents().get(S1);
                if(S2.getLunchBox().getName().equals(color)){
                 count+=1;
                }
            }
        }
        return count;
    }

    // Similar to the one above except that you should print the
    // names of students that have this color lunchbox.
    public void studentsWithCertainColorLunchbox(String color){
        for(String teacher: teachers.keySet()){
            for(String S1:teachers.get(teacher).getStudents().keySet()){
                Student S2=teachers.get(teacher).getStudents().get(S1);
                if(S2.getLunchBox().getName().equals(color)){
                    System.out.println(S2.getName());
                }
            }
        }
    }

    // Given a student's name, return the student's teacher.
    // If no teacher is found, then print "new student"
    public String whoIsThisStudentsTeacher(String studentname){
       String myT="";
        for(String teacher: teachers.keySet()){
           Teacher myteach=teachers.get(teacher);
           if(myteach.getStudents().containsKey(studentname));
           myT=teacher;
       }
        return myT;
    }

    // Print the teachers who have students with less than 3 pencils
    // in their pocket.
    public void teachersThatHaveStudentsWithLessThanACertainNumberOfPencils(int numOfPencils ){
        for(String teacher: teachers.keySet()){
            for(String S1:teachers.get(teacher).getStudents().keySet()){
                Student S2=teachers.get(teacher).getStudents().get(S1);
               if(S2.getNumOfPencilsInPocket()<numOfPencils){
                   System.out.println(teacher);
                   break;
               }
            }
        }
    }

}