package E10;

/**
 * Created by Seanol on 2017/2/26.
 */
public class Outer {
    private class Inner implements Foorm{
        public void f(){
            System.out.println("f()");
        }
    }
    public Foorm get(){
        return new Inner();
    }
    public Inner get2(){
        return new Inner();
    }
    
}
