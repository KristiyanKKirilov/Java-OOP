package bg.tu_varna.sit.a2.f23621649.homework2.task4;

public class Application {
    public static void main(String[] args) {
        StudentGroup firstGroup = new StudentGroup("Physics", 1, 110, 71);
        StudentGroup secondGroup = new StudentGroup("Chemistry", 1, 122, 44);
        StudentGroup thirdGroup = new StudentGroup("Maths", 2, 156, 62);
        StudentGroup fourthGroup = new StudentGroup("Electronics", 2, 202, 51);
        StudentGroup[] groups = {firstGroup, secondGroup, thirdGroup, fourthGroup};
        Faculty faculty = new Faculty(groups);

        StudentGroup maxGroupFirstCourse = faculty.getGroupWithMaxStudentsByCourse(1);
        if (maxGroupFirstCourse != null) {
            System.out.println("Group with max students in the first course: ");
            System.out.println(maxGroupFirstCourse.toString());
        } else {
            System.out.println("There aren't any students in first course");
        }


        System.out.println();
        StudentGroup maxGroupSecondCourse = faculty.getGroupWithMaxStudentsByCourse(2);
        if (maxGroupSecondCourse != null) {
            System.out.println("Group with max students in course the second course:");
            System.out.println(maxGroupSecondCourse.toString());
        } else {
            System.out.println("There aren't any students in second course");
        }
    }
}
