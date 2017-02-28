package E07;

/**
 * Created by Seanol on 2017/2/26.
 */
public class Outer {
    private int i = 0;
    private void f(){
        System.out.println("out");
    }
    class Inner{
        public void alter(){
            i++;
            f();
            System.out.println(i);
        }
    }
    public void m(){
        Inner oi = new Inner();
        oi.alter();
    }
    public static void main(String[] args){
        Outer o = new Outer();
        o.m();
    }
}
