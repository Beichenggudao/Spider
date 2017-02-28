package E14;

/**
 * Created by Seanol on 2017/2/27.
 */
public class Outer4 {
    private int i;

    Outer4(int i){
        this.i = i;
        System.out.println("Outer4 : " + i);
    }
    public void f(){
        System.out.println("F()");
    }
}
