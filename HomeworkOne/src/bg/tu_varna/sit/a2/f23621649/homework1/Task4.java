package bg.tu_varna.sit.a2.f23621649.homework1;

public class Task4 {
    public static void main(String[] args){
        String[] facultyNumbers = {
                "23621649",
                "20621648",
                "22621649",
                "22721649",
                "19621649",
                "210621649",
                "21921649",
                "20651649",
                "20627649",
                "23600649"};

        countStudentsByCourse(facultyNumbers);

    }

    public static void countStudentsByCourse(String[] facultyNumbers){
        int countOfFirstCourseStudents = 0;
        int countOfSecondCourseStudents = 0;
        int countOfThirdCourseStudents = 0;
        int countOfFourthCourseStudents = 0;
        int countOfUndefinedStudents = 0;

        for (int i = 0; i < facultyNumbers.length; i++) {
            String firstTwoNumbers = facultyNumbers[i].substring(0, 2);
            switch (firstTwoNumbers){
                case "23":
                    countOfFirstCourseStudents++;
                    break;
                case "22":
                    countOfSecondCourseStudents++;
                    break;
                case "21":
                    countOfThirdCourseStudents++;
                    break;
                case "20":
                    countOfFourthCourseStudents++;
                    break;
                default:
                    countOfUndefinedStudents++;
                    break;
            }
        }

        System.out.println("Count of first course students: " + countOfFirstCourseStudents);
        System.out.println("Count of second course students: " + countOfSecondCourseStudents);
        System.out.println("Count of third course students: " + countOfThirdCourseStudents);
        System.out.println("Count of fourth course students: " + countOfFourthCourseStudents);
        System.out.println("Count of undefined students: " + countOfUndefinedStudents);
    }
}
