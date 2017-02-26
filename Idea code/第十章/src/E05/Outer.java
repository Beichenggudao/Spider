package E05;

/**
 * Created by Seanol on 2017/2/26.
 */
public class Outer {
    class Inner{
        private String name;
        void play(String name){
            this.name = name;
            System.out.println("i'm playing : " + name);
        }
    }
}
