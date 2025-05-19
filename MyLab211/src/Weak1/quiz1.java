/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak1;

/**
 *
 * @author kpham
 */
import java.util.*;

public class quiz1 {

    private String xaukitu;

    public quiz1() {
    }

    public quiz1(String xaukitu) {
        this.xaukitu = xaukitu;
    }

    public String getXaukitu() {
        return xaukitu;
    }

    public void setXaukitu(String xaukitu) {
        this.xaukitu = xaukitu;
    }

    ArrayList<String> arr = new ArrayList();
    ArrayList<Character> arrc = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void EnterContent() {
        System.out.println("En-ter your content: ");
        Scanner sc = new Scanner(System.in);
        setXaukitu(sc.nextLine());
    }

    public void processString() {
        StringTokenizer st = new StringTokenizer(getXaukitu());
        Map<String, Integer> word = new LinkedHashMap<>();
        while (st.hasMoreTokens()) {
            int count = 1;
            String token = st.nextToken();
            //word.put(token, word.getOrDefault(token, 0) + 1);
            if (word.containsKey(token)) {
                count = word.get(token) + 1;
                word.put(token, count);
            } 
            else {
                word.put(token, 1);
            }
        }
        System.out.println(word);
    }

    public void procesCharacter() {
        Map<Character, Integer> ch = new LinkedHashMap<>();
        for (char c : getXaukitu().toCharArray()) {

            if (c != ' ') {
                int count = 1;
                //ch.put(c, ch.getOrDefault(ch, 0) + 1);

                if (ch.containsKey(c)) {
                    count = ch.get(c) + 1;
                }
                ch.put(c, count);
            }
        }
        System.out.println(ch);
    }
}
