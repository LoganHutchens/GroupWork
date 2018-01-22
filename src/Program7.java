
import java.util.Scanner;

/**
 * Program to find the average in an array
 *
 * @author Logan Hutchens
 */
public class Program7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read? ");
        int amount = input.nextInt();
        double[] myList = new double[amount];
        fillArray(myList, input);
        System.out.printf("The average is %4.1f\n", average(myList));
        displayArray(myList);
    }

    /**
     * Method to fill array
     *
     * @param myList Array
     * @param input Scanner
     */
    //Filling the array
    public static void fillArray(double[] myList, Scanner input) {
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
    }

    /**
     * Method to find average
     *
     * @param myList Array
     * @return The average of the array
     */
    //Calculating the average
    public static double average(double[] myList) {
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        double average = (total / (myList.length));
        return average;
    }

    /**
     * Method to print array
     *
     * @param myList Array
     */
    //Displaying the array
    public static void displayArray(double[] myList) {
        System.out.println("The contents of the array are: ");
        System.out.println(java.util.Arrays.toString(myList));
    }
}
