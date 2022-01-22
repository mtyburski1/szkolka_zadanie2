import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    private int sum = 0;
    private int theHighest = 0;
    private int numbersInside;
    private boolean error = true;
    private Scanner sc = new Scanner(System.in);
    int[] numbers = getInts();

    public void zapelnianieTablicy() {

        for (int i = 0; i < numbers.length; i++) {
            do {
                System.out.println("Wprowadź liczbę do tablicy:");
                try {
                    numbersInside = sc.nextInt();
                    sc.nextLine();
                    error = false;
                } catch (InputMismatchException e) {
                    System.err.println("Podano złą wartość.");
                    sc.nextLine();
                }
            }while(error);
            numbers[i] = numbersInside;
            sum = sum + numbersInside;
            error = true;
            if (numbers[i] > theHighest)
                theHighest = numbers[i];
        }
    }
    public void printInfo() {
        double result = sum / numbers.length;
        System.out.println("Największa liczba w tablicy: " + theHighest);
        System.out.println("Średnia tablicy: " + result);
    }
    public int[] getInts() {
        int size = 0;
        do {
            try {
                size = sc.nextInt();
                sc.nextLine();
                error = false;
            }catch (InputMismatchException e) {
                System.err.println("Podano złą wartość.");
                sc.nextLine();
            }
        }while(error);
        int[] numbers = new int[size];
        System.out.println("dodano");
        error = true;
        return numbers;
    }
}
