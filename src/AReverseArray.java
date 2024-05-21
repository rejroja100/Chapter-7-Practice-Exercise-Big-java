import java.util.Scanner;

public class AReverseArray {
    public int[] numbers;

    public AReverseArray() {
        numbers = new int[10];
    }

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    public void displayNumbers() {
        System.out.print("Display the reverse numbers: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        AReverseArray aReverseArray = new AReverseArray();
        aReverseArray.readNumbers();
        aReverseArray.displayNumbers();
    }
}
