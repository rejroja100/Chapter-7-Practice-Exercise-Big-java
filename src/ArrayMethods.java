import java.util.Arrays;
import java.util.HashSet;

public class ArrayMethods {
    private int[] values;

    public ArrayMethods(int[] initialValues) {
        values = initialValues;
    }

    // a
    public void swapFirstAndLast() {
        if (values.length > 1) {
            int temp = values[0];
            values[0] = values[values.length - 1];
            values[values.length - 1] = temp;
        }
    }

    // b
    public void shiftRight() {
        if (values.length > 1) {
            int last = values[values.length - 1];
            for (int i = values.length - 1; i > 0; i--) {
                values[i] = values[i - 1];
            }
            values[0] = last;
        }
    }

    // c
    public void replaceEvenWithZero() {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                values[i] = 0;
            }
        }
    }

    // d
    public void replaceWithLargerNeighbor() {
        if (values.length > 2) {
            int[] newArray = values.clone();
            for (int i = 1; i < values.length - 1; i++) {
                newArray[i] = Math.max(values[i - 1], values[i + 1]);
            }
            values = newArray;
        }
    }

    // e
    public void removeMiddle() {
        if (values.length == 0) {
            return;
        }
        int middle = values.length / 2;
        if (values.length % 2 == 0) {
            int[] newArray = new int[values.length - 2];
            for (int i = 0; i < middle - 1; i++) {
                newArray[i] = values[i];
            }
            for (int i = middle + 1; i < values.length; i++) {
                newArray[i - 2] = values[i];
            }
            values = newArray;
        } else {
            int[] newArray = new int[values.length - 1];
            for (int i = 0; i < middle; i++) {
                newArray[i] = values[i];
            }
            for (int i = middle + 1; i < values.length; i++) {
                newArray[i - 1] = values[i];
            }
            values = newArray;
        }
    }

    // f
    public void moveEvenToFront() {
        int[] newArray = new int[values.length];
        int evenIndex = 0;
        int oddIndex = values.length - 1;
        for (int value : values) {
            if (value % 2 == 0) {
                newArray[evenIndex++] = value;
            } else {
                newArray[oddIndex--] = value;
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (i < evenIndex) {
                values[i] = newArray[i];
            } else {
                values[i] = newArray[values.length - 1 - (i - evenIndex)];
            }
        }
    }

    // g
    public int secondLargest() {
        if (values.length < 2) {
            throw new IllegalStateException("Array must have at least two elements");
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > firstMax) {
                secondMax = firstMax;
                firstMax = value;
            } else if (value > secondMax && value != firstMax) {
                secondMax = value;
            }
        }
        return secondMax;
    }

    // h
    public boolean isSorted() {
        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // i
    public boolean hasAdjacentDuplicates() {
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // j
    public boolean hasDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        for (int value : values) {
            if (!set.add(value)) {
                return true;
            }
        }
        return false;
    }


    public void printArray() {
        System.out.println(Arrays.toString(values));
    }

    public static void main(String[] args) {
        int[] testValues = {1, 4, 9, 16, 25, 4, 9, 16, 25, 36};
        ArrayMethods arrayMethods = new ArrayMethods(testValues);

        // Test a
        arrayMethods.swapFirstAndLast();
        System.out.println("After swapping first and last:");
        arrayMethods.printArray();

        // Test b
        arrayMethods.shiftRight();
        System.out.println("After shifting right:");
        arrayMethods.printArray();

        // Test c
        arrayMethods.replaceEvenWithZero();
        System.out.println("After replacing even elements with 0:");
        arrayMethods.printArray();


        arrayMethods = new ArrayMethods(testValues);

        // Test d
        arrayMethods.replaceWithLargerNeighbor();
        System.out.println("After replacing with larger neighbor:");
        arrayMethods.printArray();

        // Test e
        arrayMethods.removeMiddle();
        System.out.println("After removing middle element(s):");
        arrayMethods.printArray();

        // Test f
        arrayMethods = new ArrayMethods(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        arrayMethods.moveEvenToFront();
        System.out.println("After moving even elements to front:");
        arrayMethods.printArray();

        // Test g
        System.out.println("Second largest element: " + arrayMethods.secondLargest());

        // Test h
        System.out.println("Is array sorted? " + arrayMethods.isSorted());

        // Test i
        System.out.println("Has adjacent duplicates? " + arrayMethods.hasAdjacentDuplicates());

        // Test j
        System.out.println("Has duplicates? " + arrayMethods.hasDuplicates());
    }
}

