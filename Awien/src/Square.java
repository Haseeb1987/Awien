/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Haseeb Khawaja
 */
abstract class Dimen{
    int s=0;
    public void sides(){
        System.out.println("sqaure has 4 sides");
    }
    abstract public void see();
    abstract public void have();
}

public class Square extends Dimen{
    int s=4;
    public void hmm(){
        System.out.println("i am hmmm");
    }
    public void see(){
        System.out.println("i can see know");
    }
    public void have(){
        System.out.println("i am the having part");
    }

    public static void main(String[]args){
        Square s=new Square();
        System.out.println("let see s : "+s);
        s.sides();
        s.see();
        s.have();
        s.hmm();
    }

}
