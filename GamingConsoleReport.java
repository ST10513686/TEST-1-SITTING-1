/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author ntatiso
 */

public class GamingConsoleReport {

    public static void main(String[] args) {

        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        int[][] sales = {
            {1000, 2000, 3000},   
            {2000, 3000, 4000},   
            {1500, 1100, 1200}    
        };
        
        int[] cityTotals = new int[cities.length];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                cityTotals[i] += sales[i][j];
            }
        }
        
        int maxIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[maxIndex]) {
                maxIndex = i;
            }
        }

        String line = "------------------------------------------------------------";

        System.out.println(line);
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println(line);
        
        System.out.printf("%-18s", "");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.println();
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }

        System.out.println(line);
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println(line);
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d%n", cities[i], cityTotals[i]);
        }

        System.out.println(line);
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println(line);
    }
}
    

