
import java.util.Scanner;

/**
 * Program to define minimum number
 *
 * @author Raymond Luong
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        double[] number = new double[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + smallest(number));
    }

    /**
     * method to find the minimum
     *
     * @param array the array of data used
     * @return smallest the minimum in the array
     */
    public static double smallest(double[] array) {
        double smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}
