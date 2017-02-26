package E09;

/**
 * Created by Seanol on 2017/2/26.
 */
public class Outer {
    public Form get(){
        class Inner implements Form{
            public void f(){
                System.out.println("fan hui le");
            }
        }
        return new Inner();
    }
    public static void main(String[] args){
        Outer ou = new Outer();
        ou.get().f();
    }
}
