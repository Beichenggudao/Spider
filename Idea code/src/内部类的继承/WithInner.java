package 内部类的继承;

/**
 * Created by Seanol on 2017/2/28.
 */
public class WithInner {
    private int i = 1;
    class Inner{
        public void say(){
            System.out.println("say()");
        }
        public int value(){
            System.out.println(i);
            return i;
        }
    }

}
