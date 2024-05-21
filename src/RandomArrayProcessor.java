import java.util.Random;

public class RandomArrayProcessor{
    private int[] numbers;

    public RandomArrayProcessor() {
        numbers = new int[10];
        generateRandomNumbers();
    }

    private void generateRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Random integers between 0 and 99
        }
    }

    public void printGeneratedArray() {
        System.out.print("Generated array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void printEvenIndexElements() {
        System.out.print("Elements at even indices: ");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void printEvenElements() {
        System.out.print("Even elements: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void printElementsInReverseOrder() {
        System.out.print("Elements in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void printFirstAndLastElement() {
        System.out.print("First and last element: ");
        System.out.print(numbers[0] + " ");
        System.out.print(numbers[numbers.length - 1]);
        System.out.println();
    }

    public static void main(String[] args) {
        RandomArrayProcessor processor = new RandomArrayProcessor();
        processor.printGeneratedArray();
        processor.printEvenIndexElements();
        processor.printEvenElements();
        processor.printElementsInReverseOrder();
        processor.printFirstAndLastElement();
    }
}

