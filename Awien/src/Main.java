/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package awien;

/**
 *
 * @author Haseeb Khawaja
 */
class A{
    A(){
        System.out.println("i am A");
    }
    A(int i){
        System.out.println("i am a paramerter A");
    }

    void sum(){
        System.out.println("i am sum fun");
    }
    void add(){
        System.out.println("i am add fun");
    }
}

public class Main extends A{
//    void A(){
//        System.out.println("i am A from Main");
//    }
    public Main() {
        System.out.println("i am Main");
    }
    void sum(){
        System.out.println("i am sun fun Main");
    }
    void min(){
        System.out.println("i am min fun");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A();
//        Main m = new Main();
//        A a1 = new Main();
//        Main m1 = new A();
//        a1.sum();
//        m.sum();
//        m.add();
//        m.min();
        a.sum();
    }

}
