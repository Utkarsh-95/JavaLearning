package StringHandling;


import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class StringPool {

    public static void main(String[] args) {

        Test t1 = new Test(10);
        Test t2 = new Test(10);
        System.out.println("equals:" + (t1.equals(t2)));
        System.out.println("==:" + (t1 == t2));
        System.out.println(t1.toString() + "-" + t2.toString());

        String s1 = "CAT";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = new String("Cat");

        System.out.println("s1 == s2 :" + (s1 == s2.toUpperCase()));
        System.out.println("s1 == s3 :" + (s1 == s3));
        System.out.println("equals:" + (s3.equals(s4)));
        System.out.println("==:" + (s3 == s4));

        System.out.println(s3 + "-" + s4);
    }

}

class Test {

    private Integer id;

    public Test(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Test) {
            return ((Test) obj).id.equals(this.id);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

}
