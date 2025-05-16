/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3;

/**
 *
 * @author kpham
 */
import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputBase, outputBase;
        String value;
        Showmenu smn = new Showmenu();
        while (true) {
            smn.menu();
            System.out.print("Choose input base (1-3) or 4 to exit: ");
            inputBase = scanner.nextInt();
            if (inputBase == 4) {
                System.out.println("Goodbye!");
                break;
            }

            
            System.out.print("Choose output base (1-3): ");
            outputBase = scanner.nextInt();
            scanner.nextLine(); 

            
            System.out.print("Enter value to convert: ");
            value = scanner.nextLine();

            try {
                int decimalValue = convertToDecimal(value, inputBase);
                String result = convertFromDecimal(decimalValue, outputBase);
                System.out.println(">> Converted result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please try again.");
            }
        }

        scanner.close();
    }

    
    public static int convertToDecimal(String value, int base) {
        int fromBase = switch (base) {
            case 1 -> 2;
            case 2 -> 10;
            case 3 -> 16;
            default -> throw new IllegalArgumentException("Invalid input base");
        };
        return Integer.parseInt(value, fromBase);
    }

   
    public static String convertFromDecimal(int decimalValue, int base) {
        return switch (base) {
            case 1 -> Integer.toBinaryString(decimalValue);
            case 2 -> Integer.toString(decimalValue);
            case 3 -> Integer.toHexString(decimalValue).toUpperCase();
            default -> throw new IllegalArgumentException("Invalid output base");
        };
    }
}
