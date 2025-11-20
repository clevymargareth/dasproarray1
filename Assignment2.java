package dasproarray1;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] menuName = new String[n];
        int[] menuPrice = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter menu name " + (i + 1) + ": ");
            menuName[i] = input.nextLine();

            System.out.print("Enter price: ");
            menuPrice[i] = input.nextInt();
            input.nextLine();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += menuPrice[i];
        }

        System.out.println("\n===== ORDER LIST =====");
        for (int i = 0; i < n; i++) {
            System.out.println(menuName[i] + " - Rp" + menuPrice[i]);
        }

        System.out.println("--------------------------");
        System.out.println("Total cost: Rp" + total);

        input.close();
    }
}
