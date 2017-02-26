package E18;

import java.util.Random;

/**
 * Created by Seanol on 2017/2/22.
 */
//static 强调只有一个 ， final 表示是一个常量
public class FinalData {
    private static Random random = new Random(47);
    private final int i1 = random.nextInt(10);
    static final int i2 = random.nextInt(10);
    public String toString(){
        return "i1 = " + i1 + ",i2 = " + i2;
    }
    public static void main(String[] args){
        FinalData f1 = new FinalData();
        FinalData f2 = new FinalData();
        System.out.println(f1);
        System.out.println(f2);
    }
}
