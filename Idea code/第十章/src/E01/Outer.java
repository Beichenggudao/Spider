package E01;

/**
 * Created by Seanol on 2017/2/26.
 */
class Outer {
    class Inner {
        { System.out.println("Inner created"); }
    }
    Inner getInner() { return new Inner(); }
}
