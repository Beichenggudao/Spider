package Count;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Count {
    private static long counter = 0;
    private final long id = counter++;
    public Count(){
        System.out.println("Creating " +this);
    }
    public String toString(){
        return "Count"+id;
    }
}
