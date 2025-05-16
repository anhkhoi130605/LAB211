/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author kpham
 */
import java.util.*;
public class Process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array:");
        int input = sc.nextInt();
        int[] a = new int[input];
        System.out.println("Enter search value:");
        int search = sc.nextInt();
        System.out.println("Enter " + input + " array elements:");
        for (int i = 0; i < input; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < input; i++) {
            if (a[i] == search) {
               System.out.println("Found " + search + " at index: " + i);
                break;
            }
        }
    }
}
