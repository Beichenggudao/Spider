package E17;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Test {
    public static void main(String[] args){
        Cycle[] cycle = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle(),
        };
        for(Cycle i : cycle)

        ((Unicycle)cycle[0]).balance();
        ((Bicycle)cycle[1]).balance();
        //((Tricycle)cycle[2]).balance();
    }
}
