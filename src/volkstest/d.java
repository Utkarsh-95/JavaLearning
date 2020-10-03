/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volkstest;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class d {

    static final int NO_OF_CHARS = 256;

    static void fillCharCounts(String str, int[] count) {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
    }

    static void printDups(String str) {
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str, count);

        for (int i = 0; i < NO_OF_CHARS; i++) {
            if (count[i] > 1) {
                System.out.printf("%c,  count = %d \n", i, count[i]);
            }
//            System.out.println(str +"="+i+"="+ count[i]);
        }
    }

    public static void main(String[] args) {

        String str = "test string";
        printDups(str);

//        String test = "a1b2c3";
//        String[] tokens = test.split("\\d");
//        for (String s : tokens) {
//            System.out.println(s + " ");
//        }
//        int arr[] = new int[10];
//        int i = 5;
//        arr[i++] = ++i + i++;
//        System.out.println(arr[5] + ":" + arr[6]);
//        Character ch = new Character('A');
//        System.out.println(ch + "\t" + (int) ch);
//        final char ch = 'A';
//        switch (65) {
//            case ch:
//                System.out.println("65"); //65
//                break;
//            case 66:
//                System.out.println("66"); //66
//        }
    }

}
