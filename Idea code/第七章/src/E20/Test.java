package E20;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Test {
    public static void main(String[] args){
        Overriding2 op2 = new Overriding2();
        op2.f();
        op2.g();
        Overriding op = op2;
        op2.f();
    }
}
