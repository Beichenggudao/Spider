package Apply;

/**
 * Created by Seanol on 2017/2/25.
 */
public class Test {
    public static void process(Processor p){
        System.out.println("Using Processor : " + p.name());
    }
    public static void main(String[] args){
        process(new Processor());
    }
}
