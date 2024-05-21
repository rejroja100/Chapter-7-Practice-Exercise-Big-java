public class AlternatingSum {
    public static int countAlternatingSum(int[] values){

        int sum = 0;
        for(int i = 0; i < values.length; i++){
            if(i % 2 == 0){
                sum += values[i];
            }
            else{
                sum -= values[i];
            }
        }

        return  sum;
    }

    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int result = countAlternatingSum(values);
        System.out.println("The alternating sum is " + result);
    }
}
