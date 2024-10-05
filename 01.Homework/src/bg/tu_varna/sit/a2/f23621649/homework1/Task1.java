package bg.tu_varna.sit.a2.f23621649.homework1;

public class Task1 {
   public static void main(String[] args){
       float[] initialNumbers = new float[] {3.0f,4.0f, 5.0f };

       float firstNumber = initialNumbers[0];
       float secondNumber = initialNumbers[1];
       float thirdNumber = initialNumbers[2];

       isTriangle(firstNumber, secondNumber, thirdNumber);

   }

   public static void isTriangle(float firstNumber, float secondNumber, float thirdNumber){
       boolean isTriangle = false;
       boolean isRightTriangle = false;

       if(firstNumber + secondNumber > thirdNumber
               && secondNumber + thirdNumber > firstNumber
               && firstNumber + thirdNumber > secondNumber) {
           isTriangle = true;
       }

       if(isTriangle){
           float maxSide = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
           float firstSide, secondSide;

           if(maxSide == firstNumber){
               firstSide = secondNumber;
               secondSide = thirdNumber;
           }
           else if(maxSide == secondNumber){
               firstSide = firstNumber;
               secondSide = thirdNumber;
           }
           else {
               firstSide = firstNumber;
               secondSide = secondNumber;
           }

           if(Math.pow(maxSide, 2) == Math.pow(firstSide, 2) + Math.pow(secondSide, 2)) {
               isRightTriangle = true;
           }
       }

       if(!isTriangle){
           System.out.println("This is not a triangle.");
       }
       else if(isRightTriangle){
           System.out.println("The is a right triangle.");
       }
       else {
           System.out.println("This is a triangle");
       }

       System.out.println("End");
   }
}
