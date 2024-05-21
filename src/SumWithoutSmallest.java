public class SumWithoutSmallest {

    public SumWithoutSmallest() {
    }

    public int sumWithoutSmallest(int[] values) {
        if (values.length == 0) {
            return 0;
        }

        int sum = 0;
        int minValue = Integer.MAX_VALUE;

        for (int value : values) {
            sum += value;
            if (value < minValue) {
                minValue = value;
            }
        }

        return sum - minValue;
    }

    public static void main(String[] args) {
        int[] values = {3, 5, 6, 8, 10, 57};
        SumWithoutSmallest calculator = new SumWithoutSmallest();
        int result = calculator.sumWithoutSmallest(values);

        System.out.println("The result sum without the smallest number is " + result);
    }
}
