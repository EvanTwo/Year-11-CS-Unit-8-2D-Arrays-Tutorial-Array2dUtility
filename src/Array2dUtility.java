import java.util.Arrays;

public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static String print(int[][] list){
        String result = "";
        for(int i = 0;i<list.length;i++){
            for(int j = 0;i<list[0].length;i++){
                result = result + list[i][j];
            }
        }
        return result;
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] list){
        int result = 0;
        for(int i = 0;i<list.length;i++){
            for(int j = 0;j<list.length;j++){
                result = result + list[i][j];
            }
        }
        return result;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] list){
        double sum = Array2dUtility.sum(list);
        double average = sum / (list.length * list.length);
        return average;
    }


    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] list){
        int minimum = list[0][0];
        for (int i  = 0; i<list.length;i++){
            for (int j = 0; j< list.length;j++)
            if (minimum > list[i][j]){
                minimum = list[i][j];
            }

        }
        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] list){
        int maximum = list[0][0];
        for (int i  = 0; i<list.length;i++){
            for (int j = 0; j< list.length;j++)
                if (maximum < list[i][j]){
                    maximum = list[i][j];
                }

        }
        return maximum;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] list){
        int total = 0;
        for (int i  = 0; i<list.length;i++){
            for (int j = 0; j< list.length;j++)
                if (list[i][j] % 2 == 0){
                    total++;
                }

        }
        return total;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] list){
        int total = 0;
        for (int[] ints : list) {
            for (int j = 0; j < list.length; j++)
                if (ints[j] % 2 == 0) {
                    total++;
                }

        }
        return total;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

        public static boolean allPositive(int[][] list){
            boolean positive = true;
            for (int i  = 0; i<list.length;i++){
                for (int j = 0; j< list.length;j++) {
                    if (list[i][j] < 0) {
                        positive = false;
                    }
                }

            }
            return positive;
        }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] list){
        int[] rowSums = new int[list.length];
        int sum = 0;
        for (int i  = 0; i<list.length;i++){
            for (int j = 0; j< list.length;j++) {
                    sum = sum + list[i][j];
                }
            rowSums[i] = sum;
            sum = 0;
            }
            return rowSums;
        }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] list){
        int[] colSums = new int[list.length];
        int sum = 0;
        for (int i  = 0; i<list.length;i++){
            for (int j = 0; j< list.length;j++) {
                sum = sum + list[j][i];
            }
            colSums[i] = sum;
            sum = 0;
        }
        return colSums;
    }
}
