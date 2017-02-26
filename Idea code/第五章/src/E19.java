/**
 * Created by Seanol on 2017/2/20.
 */
public class E19 {
    static void f(String... args){
        for(String i : args)
            System.out.print(i + " ");
            System.out.println();
    }
    public static void main(String [] args){
        f(new String("c"),"abc");
        f();
    }

}
