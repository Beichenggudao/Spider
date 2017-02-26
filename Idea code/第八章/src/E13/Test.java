package E13;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Test {
    public static void main(String[] args){
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for(Composing c : composing)
            c.dispose();
        System.gc();
        new Composing(new Shared());
        System.gc();
    }
}
