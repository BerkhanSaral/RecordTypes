package records1;

public class Runner {
    public static void main(String[] args) {

        Employee employee1=new Employee("Jack","Sparrow","jack@mail.com");
        System.out.println(employee1);


        //emaili değiştirmek istersek
        employee1.setEmail("jacksparrow@mail.com");
        System.out.println("emaili değişen çalışan : "+employee1);

        //bazı durumlarda bir kere değerlerini belirledikten sonra fieldları
        //bir daha değiştirilmeyen objelere ihtiyaç duyabiliriz.

        System.out.println("------------------immutable-------------------------------------");
        //Immutable Class:read-only
        EmployeeImmutable employee2=new EmployeeImmutable("Harry","Potter","potter@gmail.com");
        System.out.println(employee2);

        //emaili değiştirmek istersek
        //employee2.setEmail("");

        System.out.println("Emp2 nin ismi : "+employee2.getFirstname());

        EmployeeImmutable employee3=new EmployeeImmutable("Harry","Potter","potter@gmail.com");
        System.out.println("double equal ile : "+ (employee2==employee3));//false
        System.out.println("equals ile : "+(employee2.equals(employee3)));//true

        System.out.println("-----------------records----------------");

        //peki boiler plate(basma kalıp) kodları kullanmadan
        //immutable employee classını oluşturamaz mıyız?

        //CEVAP: Java 14 ile gelen record özelliği ile oluşturabiliriz.
        EmployeeRecord employee4=new EmployeeRecord("Ali","Can","alican@mail.com");
        System.out.println("Record emp : "+employee4);

        System.out.println("Record emp ismi : "+employee4.firstname());

        EmployeeRecord employee5=new EmployeeRecord("Ali","Can","alican@mail.com");
        System.out.println("== : "+(employee4==employee5));
        System.out.println("equals : "+(employee4.equals(employee5)));

    }
}