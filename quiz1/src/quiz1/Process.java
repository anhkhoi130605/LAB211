/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1;

/**
 *
 * @author kpham
 */
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.*;

public class Process {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        ArrayList<Character> arrc = new ArrayList<>();
        System.out.println("En-ter your content: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
     
        Map<String, Integer> word = new LinkedHashMap<>();
        while (st.hasMoreTokens()) {
            int count =1;
            String token = st.nextToken();
            //word.put(token, word.getOrDefault(token, 0) + 1);
            if (word.containsKey(token)) {
                count= word.get(token) +1;
                word.put(token, count); 
            }
            else word.put(token, 1);
        }
        System.out.println(word);
        Map<Character, Integer> ch = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            
            if (c != ' ') {
                int count =1;
                //ch.put(c, ch.getOrDefault(ch, 0) + 1);
                
                if (ch.containsKey(c)) {
                    count=ch.get(c)+1;
                }
              ch.put(c, count);  
            }
        }
        System.out.println(ch);
    }

}
