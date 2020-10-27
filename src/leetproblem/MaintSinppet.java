/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

/**
 *
 * @author Utkarsh Pratap Singh
 */
class Point {

    protected int x, y;
    boolean flag;

    public Point(int _x, int _y, boolean f) {
        x = _x;
        y = _y;
        flag = f;
    }

    Point() {
    }

    public void method1(String var1, String var2) {

        boolean isConcatinated;
        var1 = var1 + var2;
        if (this.flag) {
            System.out.println("result" + var1);
        } else {
            System.out.println("result" + var2);
        }
    }

}

public class MaintSinppet {

    public static void main(String args[]) {
        Point p = new Point();
        System.out.println("x = " + p.x + ", y = " + p.y + ", " + p.flag);
        p.method1("Hi", "How are you?");
    }
}
