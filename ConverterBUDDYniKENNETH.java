/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.converterbuddynikenneth;

import java.util.Scanner;

public class ConverterBUDDYniKENNETH {

    
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        CalcEngine myCalculator = new CalcEngine(); 
        boolean appOpen = true;

      
        String[] features = {
            "1. Length Check (Base: Meters)",
            "2. Weight Check (Base: Kilograms)",
            "3. Heat Check (Base: Celsius)",
            "4. Time Check (Base: Minutes)", 
            "5. Quit Program"
        };

        System.out.println("******************************************");
        System.out.println("* COVERTERniKENNETH - V1.0            *");
        System.out.println("******************************************");

        
        while (appOpen) {
            System.out.println("\nWhat would you like to convert today?");
            
            
            for (int i = 0; i < features.length; i++) {
                System.out.println(features[i]);
            }

            System.out.print(">> Type your number here: ");

            
            if (inputReader.hasNextInt()) {
                int userChoice = inputReader.nextInt();

                
                switch (userChoice) {
                    case 1:
                        runLengthTool(inputReader, myCalculator);
                        break;
                    case 2:
                        runMassTool(inputReader, myCalculator);
                        break;
                    case 3:
                        runTempTool(inputReader, myCalculator);
                        break;
                    case 4:
                        runTimeTool(inputReader, myCalculator); 
                        break;
                    case 5:
                        System.out.println("Thanks for using QuickUnitMate. Bye!");
                        appOpen = false; 
                        break;
                    default:
                        System.out.println("Error: Please select a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input! Letters are not allowed.");
                inputReader.next();
            }
        }
        
        inputReader.close();
    }

   

    private static void runLengthTool(Scanner scan, CalcEngine calc) {
        System.out.println("\n--- LENGTH MODE ---");
        System.out.print("How many METERS? ");
        double val = validateNumber(scan);
        calc.computeLength(val);
    }

    private static void runMassTool(Scanner scan, CalcEngine calc) {
        System.out.println("\n--- WEIGHT MODE ---");
        System.out.print("How many KILOGRAMS? ");
        double val = validateNumber(scan);
        calc.computeMass(val);
    }

    private static void runTempTool(Scanner scan, CalcEngine calc) {
        System.out.println("\n--- HEAT MODE ---");
        System.out.print("Temperature in CELSIUS? ");
        double val = validateNumber(scan);
        calc.computeTemp(val);
    }

    private static void runTimeTool(Scanner scan, CalcEngine calc) {
        System.out.println("\n--- TIME MODE ---");
        System.out.print("Enter time in MINUTES: ");
        double val = validateNumber(scan);
        calc.computeTime(val);
    }

    
    private static double validateNumber(Scanner scan) {
        while (!scan.hasNextDouble()) {
            System.out.println("Oops! That's not a number. Try again:");
            scan.next();
        }
        return scan.nextDouble();
    }
}


class CalcEngine {

   
    public void computeLength(double meters) {
        System.out.println("\nResults for " + meters + " m:");
        System.out.println("-> " + (meters / 1000) + " Kilometers");
        System.out.println("-> " + (meters * 100) + " Centimeters");
        System.out.println("-> " + (meters * 3.28084) + " Feet");
        System.out.println("-> " + (meters * 39.37) + " Inches");
    }

   
    public void computeMass(double kg) {
        System.out.println("\nResults for " + kg + " kg:");
        System.out.println("-> " + (kg * 2.20462) + " Pounds (lbs)");
        System.out.println("-> " + (kg * 35.274) + " Ounces");
        System.out.println("-> " + (kg * 1000) + " Grams");
    }

    
    public void computeTemp(double c) {
        double f = (c * 9/5) + 32;
        double k = c + 273.15;
        
        System.out.println("\nResults for " + c + "°C:");
        System.out.println("-> " + f + " Fahrenheit");
        System.out.println("-> " + k + " Kelvin");

        
        if (c <= 0) {
            System.out.println("[Alert] It's freezing!");
        } else if (c >= 100) {
            System.out.println("[Alert] Water is boiling!");
        }
    }

    
    public void computeTime(double mins) {
        System.out.println("\nResults for " + mins + " minutes:");
        System.out.printf("-> %.0f Seconds%n", (mins * 60));
        System.out.printf("-> %.2f Hours%n", (mins / 60));
        System.out.printf("-> %.4f Days%n", (mins / 1440));
    }
}