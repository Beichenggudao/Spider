import java.util.Arrays;

/**
 * Created by Seanol on 2017/2/20.
 */
public class E17 {
    E17(String a){
        a ="qwe";
        System.out.println("a = "+ a);
    }
    public static void main(String[] args){
        //String[] a = new String[1];//
        String[] a = {"abc"};
        for(int i = 0;i<a.length;i++) {
            System.out.println(Arrays.toString(a));
        }
    }
}
