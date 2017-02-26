import java.util.Arrays;

/**
 * Created by Seanol on 2017/2/20.
 */
public class E20 {
    static void f(String... args) {
        for (String s : args)
            System.out.print(Arrays.toString(args));
            System.out.println();
    }
    public static void main(String... args){
        f("abc");
        f("123",new String("dfa"));
    }
}
