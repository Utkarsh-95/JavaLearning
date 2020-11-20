package OOPSException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Utkarsh Pratap Singh
 */
//Creating interface that has 4 methods
interface Ax {

    String s = "";

    void a();//bydefault, public and abstract

    void b();

    void c();

    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class Bx {

    public void c() {
        System.out.println("I am C");
    }
    
    public static void main(String[] args) {
        Bx v = new Bx() {};
        v.c();
    }
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M extends Bx {

    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }
}

//Creating a test class that calls the methods of A interface
public class AbstractInterface {

    public static void main(String args[]) {
        Ax a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
