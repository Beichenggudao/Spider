package E01;

/**
 * Created by Seanol on 2017/2/26.
 */
class Outer {
    private String name;

    Outer(){
        name = "zhangsan";
    }

    class Inner {
        public String toString(){
            return name;
        }
    }
    Inner Inner() { return new Inner(); }
}
