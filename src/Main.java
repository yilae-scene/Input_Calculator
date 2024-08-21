import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (true) {
            try {
                System.out.println("INPUT:");
                String input = scanner.nextLine();
                int correctInt = Integer.parseInt(input);
                sum += correctInt;
                counter++;

            } catch (NumberFormatException e) {
                break;
            }
        }
        try {
            System.out.println("SUM = " + sum + " AVG = " + Math.round((sum / (double)counter)));
        } catch (ArithmeticException e) {
            System.out.println("SUM = " + sum + " AVG = " + 0);
        }
    }
}