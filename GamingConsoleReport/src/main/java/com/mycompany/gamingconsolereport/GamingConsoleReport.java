/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

import java.util.Scanner;

/**
 *
 * @author Lesedi
 */
public class GamingConsoleReport {
        

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            //  1D ARRAYS for labels 
            
            String[] cities = {"Cape Town", "Port Elizabeth","PRETORIA"};
            String[] GamingTypes = {"PS5", "XBOX","Switch"};
            
            //  2D ARRAY to store gaming data
            // Rows = Cities 
            // Columns = Game  Types
            int[][] games = new int[3][3];
            
            System.out.println("=== GAMING CONSOLE REPORT DATA ENTRY ===\n");
            
            //  USER TO INPUT DATA 
            // (Expected sample input: Cape Town: 155, 121 | JHB: 178, 145 | PE: 112, 89)
            for (int i = 0; i < cities.length; i++) {
                System.out.println("Entering data for: " + cities[i]);
                for (int j = 0; j < GamingTypes.length; j++) {
                    System.out.print("  Enter " + GamingTypes[j] + " Games : ");
                    games [i][j] = scanner.nextInt();
                }
                System.out.println(); // blank line for readability
            }
            
            //  1D ARRAY to store games per city 
            
            int[] cityTotals = new int[3];
            int highestTotal = 0;
            int highestCityIndex = 0;
            
            // DISPLAYS THE ALL THE GAMING TYPES AND DATA FROM DIFFERENT CITIES
            String line = "-------------------------------------------------";
System.out.println(line);
System.out.println("GAMING CONSOLE REPORT");
System.out.println(line);
System.out.printf("%-16s%-9s%-9s%-9s%n", "", "PS5", "XBOX", "SWITCH");

for (int i = 0; i < cities.length; i++) {
    cityTotals[i] = games[i][0] + games[i][1] + games[i][2];   // added Switch
    System.out.printf("%-16s%-9d%-9d%-9d%n",
            cities[i], games[i][0], games[i][1], games[i][2]); // added Switch
    if (cityTotals[i] > highestTotal) {
        highestTotal = cityTotals[i];
        highestCityIndex = i;
                }
            }
           
           
            
            // DISPLAY TOTAL GAMES PER CITY 
           System.out.println(line);
System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
System.out.println(line);
for (int i = 0; i < cities.length; i++) {
    System.out.printf("%-16s%d%n", cities[i], cityTotals[i]);
}
System.out.println();
System.out.println("CITY WITH THE MOST SALES: " + cities[highestCityIndex]);
System.out.println(line);
        }
    }
}
  
