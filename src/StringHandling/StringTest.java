package StringHandling;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Utkarsh Pratap Singh
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = new String("uttu");
        String s2 = new String("UTTU");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);

        String s5 = "uttu";
        s5.concat("singh");
        System.out.println("ssssssssssssss55555555555555555555"+s5);
        StringBuffer s6 = new StringBuffer();
        s6.append("uttu");
        System.out.println(s5.equals(s6) + "--");

        String s8 = "abc";
        String s7 = new String("abc");
//        s7.intern();
        System.out.println((s8 == s7) + " s7 == s8");
        System.out.println(s8.equals(s7) + " s7.equals(s8)");

        System.out.println();
        String str = "utkarsh";
        System.out.println(StringTest.reverse(str));
    }

    public static String reverse(String s) {
//        StringBuilder ss = new StringBuilder();
        String ss = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
//            ss.append(s.charAt(i));
        }
        return ss;
    }

}
