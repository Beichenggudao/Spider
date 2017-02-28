package E13;


import E09.Form;

/**
 * Created by Seanol on 2017/2/27.
 */
public class Outer3 {
    public Form get(){
        return new Form(){
            public void f(){
                System.out.println("fan hui le");
            }
        };
    }
    public static void main(String[] args){
        Outer3 ou = new Outer3();
        ou.get().f();
    }
}
