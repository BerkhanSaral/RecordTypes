package records2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Student student1=new Student("Victor","Hugo","123456");
        Student student2=new Student("Lev","Tolstoy","123789");

        StudentRepo repo=new StudentRepo();

        repo.save(student1);
        repo.save(student2);

        //tüm kayıtları listeleyelim
        System.out.println("-- Tüm Öğrenciler --");
        repo.printAllStudents();



        System.out.println("-------------------------------------------------");

        //listedeki 1. indexteki öğrencinin numarası yanlış girilmiş
        //değiştirmek istiyoruz...


        List<Student> studentList=repo.students;

        Student newStudent=new Student(studentList.get(1).firstname(),
                studentList.get(1).lastname(),
                "123000");

        repo.save(newStudent);

        //eski öğrenciyi de silelim
        repo.delete(student2);

        //tüm kayıtları listeleyelim
        System.out.println("-- Tüm Öğrenciler --");
        repo.printAllStudents();

        student1.printStudentName();


    }
}