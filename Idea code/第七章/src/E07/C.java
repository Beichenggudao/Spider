package E07;

/**
 * Created by Seanol on 2017/2/22.
 */
public class C extends A {
    C(int i){
        super(i);
        A a = new A(1);
        B b = new B("name");
        System.out.println("C()");
    }
    public static void main(String[] args){
        new C(3);
    }

}
