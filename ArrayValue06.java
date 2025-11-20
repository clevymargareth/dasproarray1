package dasproarray1;

import java.util.Scanner;

public class ArrayValue06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] finalScore = new int[10];

        System.out.println("Enter final score 0: ");
        finalScore[0] = input.nextInt();

        System.out.println("Enter final score 1: ");
        finalScore[1] = input.nextInt();

        System.out.println("Enter final score 2: ");
        finalScore[2] = input.nextInt();

        System.out.println("Enter final score 3: ");
        finalScore[3] = input.nextInt();

        System.out.println("Enter final score 4: ");
        finalScore[4] = input.nextInt();

        System.out.println("Enter final score 5: ");
        finalScore[5] = input.nextInt();

        System.out.println("Enter final score 6: ");
        finalScore[6] = input.nextInt();

        System.out.println("Enter final score 7: ");
        finalScore[7] = input.nextInt();

        System.out.println("Enter final score 8: ");
        finalScore[8] = input.nextInt();

        System.out.println("Enter final score 9: ");
        finalScore[9] = input.nextInt();


        System.out.println();
        System.out.println("===== Final Scores =====");

        System.out.println("Student 0: " + finalScore[0]);
        System.out.println("Student 1: " + finalScore[1]);
        System.out.println("Student 2: " + finalScore[2]);
        System.out.println("Student 3: " + finalScore[3]);
        System.out.println("Student 4: " + finalScore[4]);
        System.out.println("Student 5: " + finalScore[5]);
        System.out.println("Student 6: " + finalScore[6]);
        System.out.println("Student 7: " + finalScore[7]);
        System.out.println("Student 8: " + finalScore[8]);
        System.out.println("Student 90: " + finalScore[9]);

        input.close();
    }
}
