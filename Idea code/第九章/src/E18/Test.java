package E18;

/**
 * Created by Seanol on 2017/2/25.
 */
public class Test {
    public static void factory(CycleFactory factory){
        Cycle c = factory.getCycle();
        System.out.println("wheels: " + c.wheel());
    }
    public static void main(String[] args){
        factory(new UnicycleFactory());
        factory(new BicycleFactory());
    }
}
