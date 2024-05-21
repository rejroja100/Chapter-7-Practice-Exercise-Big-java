public class DataSet {
    private double[] values;
    private int currentSize;

    public DataSet(int maximumNumberOfValues) {
        values = new double[maximumNumberOfValues];
        currentSize = 0;
    }

    public void add(double value) {
        if (currentSize < values.length) {
            values[currentSize] = value;
            currentSize++;
        } else {
            System.out.println("No room to add more values.");
        }
    }

    public double getSum() {
        double sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum += values[i];
        }
        return sum;
    }

    public double getAverage() {
        if (currentSize == 0) {
            return 0;
        }
        return getSum() / currentSize;
    }

    public double getMaximum() {
        if (currentSize == 0) {
            return Double.NEGATIVE_INFINITY;
        }
        double max = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public double getMinimum() {
        if (currentSize == 0) {
            return Double.POSITIVE_INFINITY;
        }
        double min = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        DataSet dataSet = new DataSet(10);

        dataSet.add(5.5);
        dataSet.add(3.3);
        dataSet.add(9.9);
        dataSet.add(1.1);

        System.out.println("Sum: " + dataSet.getSum());
        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Maximum: " + dataSet.getMaximum());
        System.out.println("Minimum: " + dataSet.getMinimum());
    }
}
