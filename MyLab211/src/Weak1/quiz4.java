/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kpham
 */
import java.util.*;

public class quiz4 {

    public quiz4() {
    }

    public List<Float> calculateEquation(float a, float b) {
        ArrayList<Float> result = new ArrayList<>();
        if (a == 0) {
            if (b == 0) {
                return new ArrayList<>();
            } else {
                return null;
            }
        }
        float x = -b / a;
        System.out.println("Solution: x = " + x);
        result.add(x);
        return result;
    }

    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        ArrayList<Float> result = new ArrayList<>();
        if (a == 0) {
            return calculateEquation(b, c);
        }
        float delta = (float) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            return null;
        } else if (delta == 0) {
            float x = -b / (2 * a);
            System.out.println("Double root: x = " + x);
            result.add(x);
        } else {
            float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            result.add(x1);
            result.add(x2);
        }
        return result;
    }

    public void displayNumberProperties(List<Float> numbers) {
        System.out.print("Even numbers: ");
        for (Float num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (Float num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Perfect squares: ");
        for (Float num : numbers) {
            if (num >= 0) {
                double sqrt = Math.sqrt(num);
                if (sqrt == Math.floor(sqrt)) {
                    System.out.print(num + " ");
                }
            }
        }
        System.out.println();
    }

}
