/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

import java.util.Scanner;

/**
 *
 * @author ntatiso
 */
public class RunApplication {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String[] consoleTypes = {"PS5", "XBOX", "SWITCH"};

        int choice = readMenuChoice(consoleTypes);
        String consoleType = consoleTypes[choice - 1];

        String store = readStoreName();

        int totalSales = readTotalSales(consoleType, store);

        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);
        report.printReport();

        input.close();
    }

    private static int readMenuChoice(String[] options) {
        while (true) {
            System.out.println("Select the console type");
            for (int i = 0; i < options.length; i++) {
                System.out.println("  " + (i + 1) + ") " + options[i]);
            }
            System.out.println();

            try {
                int choice = Integer.parseInt(input.nextLine().trim());
                if (choice >= 1 && choice <= options.length) {
                    return choice;
                }
            } catch (NumberFormatException e) {
                
            }
            System.out.println("Invalid choice. Please enter a number from 1 to "
                    + options.length + ".\n");
        }
    }

    private static String readStoreName() {
        while (true) {
            System.out.print("Enter the store: ");
            String store = input.nextLine().trim();
            if (!store.isEmpty()) {
                return store;
            }
            System.out.println("The store name cannot be empty.");
        }
    }
    
    private static int readTotalSales(String consoleType, String store) {
        while (true) {
            System.out.print("Enter the total sales of " + consoleType
                    + " consoles for " + store + ": ");
            try {
                int sales = Integer.parseInt(input.nextLine().trim());
                if (sales >= 0) {
                    return sales;
                }
                System.out.println("Sales cannot be negative.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number.");
            }
        }
    }
}

    

