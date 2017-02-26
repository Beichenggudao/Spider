package E05;

/**
 * Created by Seanol on 2017/2/26.
 */
public class Test {
    public static void main(String [] args){
        Outer outer = new Outer();
        Outer.Inner oi = outer.new Inner();
        oi.play("football");
    }
}
