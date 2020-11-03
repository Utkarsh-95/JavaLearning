/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orange;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class CountCharacter {

    /*Given a String ‘str’ which contains both lowercase and upper case character, 
        Write a Java program that will print all characters along with their frequency in order of their occurrence
Note: If first character is in uppercase then output of that character should be in uppercase and if first character is in lowercase 
        then output of that character should be in lowercase.
        Example :
1)      String str="aabBcc";
Output :    a2 b2 c2
2)      String str = “acAabCcb”
Output : a3 c3 b2
3)      String str =”DaCbAdDcB”
Output : D3 a2 C2 b2
Solve above problem with O(n) time and O(1) space*/
    public static void main(String[] args) {

        String str = "AcaabCcb";

        /*char[] chhh = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chhh[i] = str.charAt(i);
            System.out.print(str.charAt(i) + "-");
        }*/
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char cc : ch) {

            if (!map.containsKey(cc)) {

                if (map.containsKey(Character.toUpperCase(cc))) {
                    int count = map.get(Character.toUpperCase(cc));
                    map.put(Character.toUpperCase(cc), count + 1);
                } else if (map.containsKey(Character.toLowerCase(cc))) {
                    int count = map.get(Character.toLowerCase(cc));
                    map.put(Character.toLowerCase(cc), count + 1);
                } else {
                    map.put(cc, 1);
                }

            } else {
                int count = map.get(cc);
                map.put(cc, count + 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        map.entrySet().stream().forEach(e -> {

            sb.append(e.getKey()).append("").append(e.getValue());
            sb.append(" ");

        });

        System.out.println(sb.toString().trim());

    }

}
