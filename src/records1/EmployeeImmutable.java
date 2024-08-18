package records1;
/*
Bazı durumlarda thread güvenliği(thread-safe), cachede veri tutarlılığı,
test kolaylığı vb sebeplerle immutable(değiştirilemez) classlar tanımlamak isteyebiliriz.

Dataları saklamak veya dataları transfer(DTO) etmek için
kullanılan ilkel classlar immutable olarak tanımlanabilir.
 */

import java.util.Objects;

public class EmployeeImmutable {

    private final String firstname;//field
    private final String lastname;
    private final String email;

    //param const
    public EmployeeImmutable(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    //getter : read-only
    //setter : final olduğu için, değiştirelemesin diye yazmıyoruz.
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    //toString
    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        EmployeeImmutable emp = (EmployeeImmutable) obj;

        return Objects.equals(this.firstname, emp.firstname) &&
                Objects.equals(this.lastname, emp.lastname) &&
                Objects.equals(this.email, emp.email);
    }

    //objeler benzersiz kodlar üretir
    @Override
    public int hashCode() {
        return Objects.hash(firstname,lastname,email);
    }
}