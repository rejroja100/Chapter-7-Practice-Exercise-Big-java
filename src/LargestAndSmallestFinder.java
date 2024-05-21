import java.util.Scanner;

public class LargestAndSmallestFinder {
    private double[] numbers;

    public LargestAndSmallestFinder(int size) {
        numbers = new double[size];
    }

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + numbers.length + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
    }

    public void printLargestAndSmallest() {
        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        double largest = numbers[0];
        double smallest = numbers[0];
        int largestIndex = 0;
        int smallestIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
                largestIndex = i;
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                smallestIndex = i;
            }
        }

        System.out.println("Array elements with the smallest and largest elements marked:");
        for (int i = 0; i < numbers.length; i++) {
            if (i == largestIndex) {
                System.out.print(numbers[i] + " (largest) ");
            } else if (i == smallestIndex) {
                System.out.print(numbers[i] + " (smallest) ");
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}

public void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();

    LargestAndSmallestFinder finder = new LargestAndSmallestFinder(n);

    finder.readNumbers();

    finder.printLargestAndSmallest();
}
