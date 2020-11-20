/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSException;

/**
 *
 * @author Utkarsh Pratap Singh
 */
interface TestA {

    String utt();

    String test();

    @Override
    String toString();
}

public class WayToWritePSVM {

//    public static void main(String[] args) {
//            public static void main(String... args) {
//            public static void main(String...a) {
//    public static void main(String[]...a) {//2d array not as main
//            public static void main(String[]... a) {//2d array not as main
    public static void main(String... a) {
        System.out.println(new TestA() {
            @Override
            public String utt() {
                return "Test";
            }

            @Override
            public String test() {
                return "Sdsfds";
            }

            @Override
            public String toString() {
                return "toString";
            }
        });
    }
}
