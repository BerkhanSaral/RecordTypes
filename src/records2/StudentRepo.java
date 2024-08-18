package records2;

import java.util.ArrayList;
import java.util.List;

//repo classlarini db ile ilgili islemlerde kullamiriz
public class StudentRepo {

    List<Student> students=new ArrayList<>();

    public void save(Student student){
        this.students.add(student);
    }

    public void printAllStudents(){
        for (Student student:students){
            System.out.println(student);
        }
    }
    public void delete(Student student){
        this.students.remove(student);
    }

}
