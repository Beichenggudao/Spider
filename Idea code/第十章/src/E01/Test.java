package E01;

/**
 * Created by Seanol on 2017/2/26.
 */
public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.getInner();
    }
}
