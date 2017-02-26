package E24;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Beetle1 extends Beetle {
    private int a = printInit("instance");
    public Beetle1(){
        super();
    }
    private static int x3 = printInit("instance initialized");
    public static void main(String[] args){
        System.out.println("instance constructor");
        Beetle1 b = new Beetle1();
    }
}
