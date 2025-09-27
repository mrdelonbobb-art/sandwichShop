package sandwichshop;

import java.util.Scanner;

public class sandwichorder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Prompt for sandwich size
        System.out.println("What size sandwich would you like? (Regular or Large): ");
        String sizeInput = myScanner.nextLine();
//find out sandwich price based on size
        double price = 0;

        if (sizeInput.equals("regular")) {
            price = 5.45;
        } else if (sizeInput.equals("large")) {
            price = 8.95;
        } else {
            System.out.println("type regular or large.");
        }
        
        System.out.print("How old are you?  ");
        int age = myScanner.nextInt();

        // Determine discount rate
        double discountRate = 0.0;
        if (age <= 17) {
            discountRate = 0.10;  // 10% discount
        } else if (age >= 65) {
            discountRate = 0.20;  // 20% discount
        }

        // Calculate final price
        
        double discountAmount = price * discountRate;
        double finalPrice = price - discountAmount;

        // Display results
        System.out.println("Original Price:" + price);
        if (discountRate > 0) {
            System.out.println("Discount:" + (discountAmount * 100.0) / 100.0
                    + (int)(discountRate * 100));
        } else {
            System.out.println("No discount applied.");
        }
        System.out.println("Final Price: $" + finalPrice);
    }
}

