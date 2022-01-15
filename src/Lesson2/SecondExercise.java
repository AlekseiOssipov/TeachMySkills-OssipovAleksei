package Lesson2;

public class SecondExercise {

    public static void main(String[] args) {

        int firstNumber = 32;
        short secondNumber = 3255;
        float thirdNumber = 4324634;
        long fourthNumber = 4364563474356783L;
        double fifthNumber = 214527;
        byte sixthNumber;
        int multiply;
        long eightNumber;
        double ninthNumber;
        double tenNumber;

        int plus = firstNumber + secondNumber;
        long minus = (long) (fourthNumber - thirdNumber);
        multiply =  firstNumber * secondNumber;
        tenNumber = 45;
        short devide = (short) (secondNumber / tenNumber);
        eightNumber = 23265326L;
        long devideSecond = fourthNumber % eightNumber;

        int numberOne = 323;
        int numberTwo = ++numberOne;
        int numberThree = numberTwo++;
        int numberFour = 544224;
        int numberFive = --numberOne;
        int numberSix = numberFour--;
    }
}
