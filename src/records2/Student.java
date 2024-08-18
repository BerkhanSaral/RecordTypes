package records2;

public record Student(String firstname, String lastname, String studentNumber) {

    public void printStudentName() {
        System.out.println("Öğrencinin adı : " + this.firstname);
    }

//    public void setStudentNumber(String  number){
//        this.studentNumber=number;
//    }
    //recordlar defaul olarak read only yani immutabledir setter metodu eklenemez
}
