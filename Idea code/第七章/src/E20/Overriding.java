package E20;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Overriding extends WithFinals {
    @Override void f(){
        System.out.println("Overriding.f");
    }
    @Override void g(){
        System.out.println("Overriding.g");
    }
}
