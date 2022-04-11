package day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 55, 85, 60, 80, 10};

        double sum = 0;  // total subtraction of the entered numbers [10+20+65...)

        for (int number : numbers) {
            sum += number;

        }
        double average = sum/ numbers.length;
        System.out.println("average = " + average);;
    }
}
