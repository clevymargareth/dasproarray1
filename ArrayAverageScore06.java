package dasproarray1;

import java.util.Scanner;

public class ArrayAverageScore06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] score = new int[10];
        double total = 0;
        double average;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = input.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        average = total / score.length;

        System.out.println();
        System.out.println("===== STUDENT SCORES =====");
        for (int i = 0; i < score.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + score[i]);
        }

        System.out.println();
        System.out.println("Total score = " + total);
        System.out.println("Average score = " + average);

        input.close();
    }
}
