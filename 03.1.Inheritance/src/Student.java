import java.util.Objects;

public class Student extends Person{
    String facultyNumber;

    Student(){}

    Student(String lastName, String facultyNumber){
        super(null, lastName);
        this.facultyNumber = facultyNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(facultyNumber, student.facultyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), facultyNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "facultyNumber='" + facultyNumber + '\'' +
                "lastName=" + super.getLastName() +
                '}';
    }

    String getFacultyNumber(){
        return this.facultyNumber;
    }
}
