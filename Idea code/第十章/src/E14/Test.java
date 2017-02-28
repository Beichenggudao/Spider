package E14;

/**
 * Created by Seanol on 2017/2/27.
 */
public class Test {
    public Outer4 get(int i){
        return new Outer4(i){
            public void f(){
                System.out.println("f()");
            }
        };
    }
    public static void main(String[] args){
        Test test = new Test();
        Outer4 ou4 = test.get(5);
        ou4.f();
    }
}
