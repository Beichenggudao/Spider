package E12xx;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Rodent {
    private static long counter = 0;
    private final long id = ++counter;
    Rodent(){
        System.out.println("creating obj: " +this);
    }
    public String toString(){
        return " 计数:" +id;
    }
}
