package E14;

/**
 * Created by Seanol on 2017/2/25.
 */
public class Test {
    static void take1(A1 i){
        i.a1();
        i.b1();
    }
    static void take2(A2 i){
        i.a2();
        i.b2();
    }
    static void take3(A3 i){
        i.a3();
        i.b3();
    }
    static void all(Lize l){
        l.a1();
        l.b1();
        l.a2();
        l.b2();
        l.a3();
        l.b3();
        l.c();
    }
    public static void main(String[] args){
        Lize l = new Lize();
        take1(l);
        take2(l);
        take3(l);
        all(l);
        Son son = new Son();
        son.f();
        son.c();
    }
}
