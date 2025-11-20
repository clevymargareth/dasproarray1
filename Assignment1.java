package dasproarray1;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of student grades: ");
        int n = input.nextInt();

        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        int total = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for (int i = 0; i < n; i++) {
            total += grades[i];

            if (grades[i] > highest)
                highest = grades[i];

            if (grades[i] < lowest)
                lowest = grades[i];
        }

        double average = total / (double)n;

        System.out.println("\n===== RESULT =====");
        System.out.println("All Grades:");
        for (int i = 0; i < n; i++) {
            System.out.println("Grade " + (i + 1) + " : " + grades[i]);
        }

        System.out.println();
        System.out.println("Average grade : " + average);
        System.out.println("Highest grade : " + highest);
        System.out.println("Lowest grade  : " + lowest);

        input.close();
    }
}
