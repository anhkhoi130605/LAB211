/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak1;

/**
 *
 * @author kpham
 */
import java.util.Scanner;

public class quiz3 {

    private int input;
    private String input2;

    public quiz3() {
    }

    public quiz3(int input) {
        this.input = input;
    }

    public quiz3(String input2) {
        this.input2 = input2;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    public int Inputvalue() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("En-ter your value you want change: ");
            try {
                int ip = sc.nextInt();
                setInput(ip);
                return ip;
            } catch (Exception e) {
                System.out.println("Please en-ter valid number");
            }

        }

    }

    public String Inputvalueforbase16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("En-ter your value you want change: ");
        String ip = sc.nextLine();
        setInput2(ip);
        return ip;
    }
    Scanner sc = new Scanner(System.in);

    public void Base2toAll(int choice) {
        Showmenuofquiz3 mn = new Showmenuofquiz3();
        switch (choice) {
            case 1: // 2 qua hệ 2
                int output = getInput();
                System.out.println("convert to binary: " + output);
                break;
            case 2: // 2 qua 10
                int output1 = getInput();
                int o = 0;
                int a = 0;
                if (output1 == 0) {
                    System.out.println("convert to decimal: " + 0);
                    return;
                }
                while (output1 != 0) {
                    int b = output1 % 10;
                    int c = b * (int) Math.pow(2, a);
                    o = o + c;
                    output1 = output1 / 10;

                    a++;
                }
                System.out.println("convert to decimal: " + o);
                break;
            case 3: // 2 qua 16
                int output2 = getInput();
                int o1 = 0;
                int a1 = 0;
                if (output2 == 0) {
                    System.out.println("Convert to hexadecimal is: " + output2);
                    return;
                }

                while (output2 != 0) {
                    int b = output2 % 10;
                    int c = b * (int) Math.pow(2, a1);
                    o1 = o1 + c;
                    output2 = output2 / 10;
                    a1++;
                }

                String soLuTion = "";
                while (o1 != 0) {
                    int remainder = o1 % 16;
                    char rs1;
                    if (remainder == 10) {
                        rs1 = 'A';
                    } else if (remainder == 11) {
                        rs1 = 'B';
                    } else if (remainder == 12) {
                        rs1 = 'C';
                    } else if (remainder == 13) {
                        rs1 = 'D';
                    } else if (remainder == 14) {
                        rs1 = 'E';
                    } else if (remainder == 15) {
                        rs1 = 'F';
                    } else {
                        rs1 = (char) (remainder + '0');
                    }
                    soLuTion = rs1 + soLuTion;
                    o1 = o1 / 16;
                }

                System.out.println("Convert to hexadecimal is: " + soLuTion);
                break;
            case 4:
                System.out.println("Goodbye");
                break;
        }
    }

    public void Base10toAll(int choice) {
        Showmenuofquiz3 mn = new Showmenuofquiz3();
        switch (choice) {
            case 1://10 qua 2
                int input = getInput();
                int remainder = 0;
                String output = "";
                if (input == 0) {
                    System.out.println("convert to binary: " + output);
                    return;
                }
                while (input != 0) {
                    remainder = input % 2;
                    output = remainder + output;
                    input = input / 2;
                }
                System.out.println("convert to binary: " + output);
                break;
            case 2:// 10 qua 10 
                int output1 = getInput();
                System.out.println("convert to decimal: " + output1);
                break;
            case 3://10 qua 16
                int o2 = getInput();
                String soLuTion = "";
                while (o2 != 0) {
                    int r = o2 % 16;
                    char rs1;
                    if (r == 10) {
                        rs1 = 'A';
                    } else if (r == 11) {
                        rs1 = 'B';
                    } else if (r == 12) {
                        rs1 = 'C';
                    } else if (r == 13) {
                        rs1 = 'D';
                    } else if (r == 14) {
                        rs1 = 'E';
                    } else if (r == 15) {
                        rs1 = 'F';
                    } else {
                        rs1 = (char) (r + '0');
                    }
                    soLuTion = rs1 + soLuTion;
                    o2 = o2 / 16;
                }

                System.out.println("Convert to hexadecimal is: " + soLuTion);
                break;
        }
    }

    public void Base16toAll(int choice) {
        Showmenuofquiz3 mn = new Showmenuofquiz3();
        switch (choice) {
            case 1: // 16 -> 2
                System.out.print("Enter hexadecimal number: ");
                String input = getInput2();
                if (input == null || input.isEmpty()) {
                    System.out.println("Empty input. Please enter a hex value first.");
                    return;
                }
                input = input.toUpperCase();
                String soLuTion = "";
                for (int i = 0; i < input.length(); i++) {
                    char r = input.charAt(i);
                    String rs1 = "";
                    if (r == '0') {
                        rs1 = "0000";
                    } else if (r == '1') {
                        rs1 = "0001";
                    } else if (r == '2') {
                        rs1 = "0010";
                    } else if (r == '3') {
                        rs1 = "0011";
                    } else if (r == '4') {
                        rs1 = "0100";
                    } else if (r == '5') {
                        rs1 = "0101";
                    } else if (r == '6') {
                        rs1 = "0110";
                    } else if (r == '7') {
                        rs1 = "0111";
                    } else if (r == '8') {
                        rs1 = "1000";
                    } else if (r == '9') {
                        rs1 = "1001";
                    } else if (r == 'A') {
                        rs1 = "1010";
                    } else if (r == 'B') {
                        rs1 = "1011";
                    } else if (r == 'C') {
                        rs1 = "1100";
                    } else if (r == 'D') {
                        rs1 = "1101";
                    } else if (r == 'E') {
                        rs1 = "1110";
                    } else if (r == 'F') {
                        rs1 = "1111";
                    } else {
                        System.out.println("Invalid character: " + r);
                        return;
                    }
                    soLuTion += rs1;
                }
                System.out.println("Convert hex to binary: " + soLuTion);
                break;

            case 2: // 16 -> 10
                String i = getInput2();
                if (i == null || i.isEmpty()) {
                    System.out.println("Empty input. Please enter a hex value first.");
                    return;
                }
                i = i.toUpperCase();
                int result = 0;
                int rs2 = 0;
                char process;
                int count = 0;

                for (int j = i.length() - 1; j >= 0; j--) {
                    process = i.charAt(j);
                    if (process == '0') {
                        rs2 = 0;
                    } else if (process == '1') {
                        rs2 = 1;
                    } else if (process == '2') {
                        rs2 = 2;
                    } else if (process == '3') {
                        rs2 = 3;
                    } else if (process == '4') {
                        rs2 = 4;
                    } else if (process == '5') {
                        rs2 = 5;
                    } else if (process == '6') {
                        rs2 = 6;
                    } else if (process == '7') {
                        rs2 = 7;
                    } else if (process == '8') {
                        rs2 = 8;
                    } else if (process == '9') {
                        rs2 = 9;
                    } else if (process == 'A') {
                        rs2 = 10;
                    } else if (process == 'B') {
                        rs2 = 11;
                    } else if (process == 'C') {
                        rs2 = 12;
                    } else if (process == 'D') {
                        rs2 = 13;
                    } else if (process == 'E') {
                        rs2 = 14;
                    } else if (process == 'F') {
                        rs2 = 15;
                    } else {
                        System.out.println("Invalid character: " + process);
                        return;
                    }
                    result = result + rs2 * (int) Math.pow(16, count);
                    count++;
                }

                System.out.println("convert to decimal: " + result);
                break;

            case 3: // 16 -> 16
                String hex = getInput2();
                if (hex == null || hex.isEmpty()) {
                    System.out.println("Empty input. Please enter a hex value first.");
                    return;
                }
                System.out.println("convert to hexadecimal: " + hex.toUpperCase());
                break;
        }
    }
}
