
import java.util.Scanner;

/**
 * Program to compare two lists
 *
 * @author Raymond Luong
 */

public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1:");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2:");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        if (identical(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }

    /**
     * Method to compare two lists
     *
     * @param list1
     * @param list2
     * @return true or false depending on if the lists match
     */
    public static boolean identical(int[] list1, int[] list2) {

        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list2.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
