package bg.tu_varna.sit.a2.f23621649.homework1;

public class Task3 {
    public static void main(String[] args){
        String dayOfWeek = "Monday";

        checkWorkingHours(dayOfWeek);

    }
    public static void checkWorkingHours(String dayOfWeek){
        String oddDayOfWeekWorkingHours = "The doctor's office is open from 13.00 PM to 18.00 PM.";
        String evenDayOfWeekWorkingHours = "The doctor's office is open from 8.00 PM to 12.30 PM.";
        String dayOff = "The doctor's office is not working";
        String defaultCase = "Not a real day of week";

        String result;

        switch (dayOfWeek.toLowerCase()){
            case "monday":
            case "wednesday":
            case "friday":
                result = oddDayOfWeekWorkingHours;
                break;
            case "tuesday":
            case "thursday":
                result = evenDayOfWeekWorkingHours;
                break;
            case "saturday":
            case "sunday":
                result = dayOff;
                break;
            default:
                result = defaultCase;
                break;
        }

        System.out.println(result);
    }
}
