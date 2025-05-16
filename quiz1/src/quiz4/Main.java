/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        control ctrl = new control();
        menu m = new menu();
        int choice;
        List<Float> lastCoefficients = new ArrayList<>();

        while (true) {
            m.showMenu();

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("You chose to solve a linear equation (ax + b = 0)");
                    System.out.print("Enter a: ");
                    float a1 = Float.parseFloat(sc.nextLine());
                    System.out.print("Enter b: ");
                    float b1 = Float.parseFloat(sc.nextLine());
                    lastCoefficients = Arrays.asList(a1, b1);

                    List<Float> result1 = ctrl.calculateEquation(a1, b1);
                    if (result1 == null) {
                        System.out.println("No solution.");
                    } else if (result1.isEmpty()) {
                        System.out.println("Infinite solutions.");
                    } else {
                        System.out.println("Root: x = " + result1.get(0));
                    }
                    break;

                case 2:
                    System.out.println("You chose to solve a quadratic equation (ax^2 + bx + c = 0)");
                    System.out.print("Enter a: ");
                    float a2 = Float.parseFloat(sc.nextLine());
                    System.out.print("Enter b: ");
                    float b2 = Float.parseFloat(sc.nextLine());
                    System.out.print("Enter c: ");
                    float c2 = Float.parseFloat(sc.nextLine());
                    lastCoefficients = Arrays.asList(a2, b2, c2);

                    List<Float> result2 = ctrl.calculateQuadraticEquation(a2, b2, c2);
                    if (result2 == null) {
                        System.out.println("No real solution.");
                    } else if (result2.size() == 1) {
                        System.out.println("Double root: x = " + result2.get(0));
                    } else if (result2.size() == 2) {
                        System.out.println("Two distinct roots:");
                        System.out.println("x1 = " + result2.get(0));
                        System.out.println("x2 = " + result2.get(1));
                    } else if (result2.isEmpty()) {
                        System.out.println("Infinite solutions.");
                    }
                    break;

                case 3:
                    System.out.println("Displaying even, odd, and perfect square numbers from the last entered coefficients:");
                    if (lastCoefficients.isEmpty()) {
                        System.out.println("No coefficients entered yet.");
                    } else {
                        ctrl.displayNumberProperties(lastCoefficients);
                    }
                    break;

                case 4:
                    System.out.println("Program exited.");
                    return;

                default:
                    System.out.println("Please choose a valid option (1-4).");
            }

            System.out.println(); // Blank line
        }
    }
}
