package bg.tu_varna.sit.a2.f23621649.homework2.task4;

public class Faculty {
    StudentGroup[] studentGroups;

    Faculty(){}

    Faculty(StudentGroup[] studentGroups) {
        this.studentGroups = studentGroups;
    }

    public StudentGroup getGroupWithMaxStudentsByCourse(int course) {
        StudentGroup groupWithMaxStudents = new StudentGroup();
        int maxStudents = 0;

        for (StudentGroup group : studentGroups) {
            if (group.getCourse() == course && group.getNumberOfStudents() > maxStudents) {
                groupWithMaxStudents = group;
                maxStudents = group.getNumberOfStudents();
            }
        }

        return groupWithMaxStudents;
    }
}

