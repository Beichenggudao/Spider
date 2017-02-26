package E08;

/**
 * Created by Seanol on 2017/2/26.
 */
//外部类不可以直接访问内部类的private，反之则可以。
public class Test {
    class Inner{
        private int i = 0;
    }

    public void s(){
    //    i++;
    }
}
