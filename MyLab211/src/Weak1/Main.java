package Weak1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getuserchoice;

        while (true) {
            do {
                System.out.println("-----MENU------");
                System.out.println("1. Count number of String And Character");
                System.out.println("2. Find Index of number");
                System.out.println("3. Change base number system");
                System.out.println("4. Solving the equation, find the square numbers, even numbers, odd numbers");
                System.out.println("5. Exitting!!");
                System.out.println("-------------------------------------------------------------------------------");

               
                while (true) {
                    System.out.print("Please choose your option: ");
                    try {
                        getuserchoice = sc.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a number (1-5).");
                        sc.nextLine(); 
                    }
                }

                switch (getuserchoice) {
                    case 1:
                        quiz1 q1 = new quiz1();
                        q1.EnterContent();
                        q1.processString();
                        q1.procesCharacter();
                        break;
                    case 2:
                        quiz2 q2 = new quiz2();
                        q2.FillNumber();
                        int index = q2.FoundIndex();
                        if (index == -1) {
                            System.out.println("Can not Found the number!!");
                        }
                        break;
                    case 3:
                        quiz3 q3 = new quiz3();
                        Showmenuofquiz3 mn = new Showmenuofquiz3();
                        mn.MainMenu();
                        System.out.print("Enter your choice: ");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                q3.Inputvalue();
                                mn.SubMenu();
                                System.out.print("Enter your choice: ");
                                q3.Base2toAll(sc.nextInt());
                                break;
                            case 2:
                                q3.Inputvalue();
                                mn.SubMenu();
                                System.out.print("Enter your choice: ");
                                q3.Base10toAll(sc.nextInt());
                                break;
                            case 3:
                                q3.Inputvalueforbase16();
                                mn.SubMenu();
                                System.out.print("Enter your choice: ");
                                q3.Base16toAll(sc.nextInt());
                                break;
                        }
                        break;
                    case 4:
                        quiz4 q4 = new quiz4();
                        Shozmenuofquiz4 m = new Shozmenuofquiz4();
                        int c;
                        List<Float> lastCoefficients = new ArrayList<>();
                        int chon;
                        do {
                            m.showMenu();
                            while (true) {
                                try {
                                    System.out.print("Enter your choice: ");
                                    chon = Integer.parseInt(sc.nextLine());
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Please enter a valid number!");
                                }
                            }

                            switch (chon) {
                                case 1:
                                    System.out.println("Solving linear equation (ax + b = 0)");
                                    System.out.print("Enter a: ");
                                    float a1 = Float.parseFloat(sc.nextLine());
                                    System.out.print("Enter b: ");
                                    float b1 = Float.parseFloat(sc.nextLine());
                                    lastCoefficients = Arrays.asList(a1, b1);

                                    List<Float> result1 = q4.calculateEquation(a1, b1);
                                    if (result1 == null) {
                                        System.out.println("No solution.");
                                    } else if (result1.isEmpty()) {
                                        System.out.println("Infinite solutions.");
                                    } else {
                                        System.out.println("Root: x = " + result1.get(0));
                                    }
                                    break;
                                case 2:
                                    System.out.println("Solving quadratic equation (ax^2 + bx + c = 0)");
                                    System.out.print("Enter a: ");
                                    float a2 = Float.parseFloat(sc.nextLine());
                                    System.out.print("Enter b: ");
                                    float b2 = Float.parseFloat(sc.nextLine());
                                    System.out.print("Enter c: ");
                                    float c2 = Float.parseFloat(sc.nextLine());
                                    lastCoefficients = Arrays.asList(a2, b2, c2);

                                    List<Float> result2 = q4.calculateQuadraticEquation(a2, b2, c2);
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
                                    System.out.println("Displaying even, odd, and perfect square numbers from last entered coefficients:");
                                    if (lastCoefficients.isEmpty()) {
                                        System.out.println("No coefficients entered yet.");
                                    } else {
                                        q4.displayNumberProperties(lastCoefficients);
                                    }
                                    break;
                                case 4:
                                    System.out.println("Exiting...");
                                    break;
                                default:
                                    System.out.println("Please choose a valid option (1-4).");
                            }

                        } while (chon != 4);
                        break;
                    case 5:
                        System.out.println("Goodbye!!");
                        break;
                    default:
                        System.out.println("Please re-enter your choice!!");
                }

            } while (getuserchoice != 5);
        }
    }
}
