
import java.util.Scanner;

/**
 * Program to calculate student grades.
 *
 * @author Raymond Luong
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int student = input.nextInt();
        int[] score = new int[student];
        int highest = 0;
        System.out.printf("Enter %d scores:", student);

        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            if (highest < score[i]) {
                highest = score[i];
            }
        }
        for (int i = 0; i < score.length; i++) {
            String grade = "";
            if (score[i] >= highest - 10) {
                grade = "A";
            } else if (score[i] >= highest - 20) {
                grade = "B";
            } else if (score[i] >= highest - 30) {
                grade = "C";
            } else if (score[i] >= highest - 40) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.printf("Student %d score is %d and grade is %s\n", i, score[i], grade);
        }
    }
}
