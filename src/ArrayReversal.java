public class ArrayReversal{
    public static void reverseArray(int[] values) {
        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16, 9, 7, 4, 9, 11};

        System.out.println("Array before reversal:");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

        reverseArray(values);

        System.out.println("Array after reversal:");
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
