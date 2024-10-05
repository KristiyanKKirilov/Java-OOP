package bg.tu_varna.sit.a2.f23621649.homework1;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args){
        int[] numbers = new int[] {2, 17, 9, 11, 23, 90, 42, 61, 4, 8};

        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();

        Arrays.sort(evenNumbers);

        if(evenNumbers.length >= 3){
            int firstNum = evenNumbers[evenNumbers.length - 1];
            int secondNum = evenNumbers[evenNumbers.length - 2];
            int thirdNum = evenNumbers[evenNumbers.length - 3];
            System.out.print("The biggest even numbers are: " + firstNum + " " + secondNum + " " + thirdNum);
        }
        else if(evenNumbers.length == 2){
            int firstNum = evenNumbers[evenNumbers.length - 1];
            int secondNum = evenNumbers[evenNumbers.length - 2];
            System.out.print("The biggest even numbers are: " + firstNum + " " + secondNum);
        }
        else if(evenNumbers.length == 1){
            int firstNum = evenNumbers[evenNumbers.length - 1];
            System.out.print("The biggest even number is: " + firstNum);
        }
        else {
            System.out.print("There aren't any even numbers");

        }
    }
}
