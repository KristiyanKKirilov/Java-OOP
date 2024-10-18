import java.util.Arrays;
import java.util.Objects;

public class Teacher extends Person{
    String[] subjects;

    Teacher(String firstName, String lastName, String[] subjects){
        super(firstName, lastName);
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + Arrays.toString(subjects) +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.deepEquals(subjects, teacher.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(subjects));
    }

    String[] getSubjects(){
        return this.subjects;
    }
}
