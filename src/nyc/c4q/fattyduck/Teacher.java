package nyc.c4q.fattyduck;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Created by fattyduck on 4/4/15.
 */

public class Teacher {
    private String name;
    private HashMap<String, Student> students = new HashMap<String, Student>();

    public Teacher(String name)
    {
        this.name = name;
        this.students = students;
    }

    public String getName()
    {
        return name;
    }
    public void addStudent(Student student){
        students.put(student.getName(), student);
    }
    public HashMap<String, Student> getStudents(){
        return students;
    }
}