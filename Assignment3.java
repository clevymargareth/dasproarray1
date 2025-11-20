package dasproarray1;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {
            "Fried Rice",
            "Fried Noodles",
            "Toasted Bread",
            "Fried Potatoes",
            "Teh Tarik",
            "Cappuccino",
            "Chocolate Ice"
        };

        System.out.print("Enter menu to search: ");
        String key = input.nextLine();

        int index = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Item \"" + key + "\" is AVAILABLE on the menu.");
        } else {
            System.out.println("Item \"" + key + "\" is NOT on the menu.");
        }

        input.close();
    }
}
