/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Haseeb Khawaja
 */
interface Dimensn{
    public void left();
    public void right();
}

public class Box implements Dimensn{
    public void left(){
        System.out.println("i am left");
    }
    public void right(){
        System.out.println("i am right");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Box b=new Box();
        b.left();
        b.right();
    }

}
