/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak1;

/**
 *
 * @author kpham
 */
import com.sun.source.tree.BreakTree;
import java.util.*;

public class quiz2 {

    private int NoA;
    private int[] arr;

    public quiz2() {
    }

    public quiz2(int NoA) {
        this.NoA = NoA;
        this.arr = new int[NoA];
    }

    public int getNoA() {
        return NoA;
    }

    public void setNoA(int NoA) {
        this.NoA = NoA;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] FillNumber() {
        while (true) {
            try {
                Random random = new Random();
                Scanner sc = new Scanner(System.in);
                System.out.println("En-ter number of Array: ");
                setNoA(sc.nextInt());
                arr = new int[getNoA()];
                for (int i = 0; i < getNoA(); i++) {
                    arr[i] = random.nextInt(10);
                }
                System.out.println(Arrays.toString(arr));
                return arr;
            } catch (InputMismatchException e) {
                System.out.println("Please en-ter valid number");
            }
        }

    }

    public int FoundIndex() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("En-ter Number you want found: ");
                int n = sc.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == n) {
                        System.out.println("Index of " + n + " is: " + i);
                        return i;
                    }
                }
                return -1;
            } catch (InputMismatchException e) {
                System.out.println("Please en-ter valid number");
            }
        }
    }

}
