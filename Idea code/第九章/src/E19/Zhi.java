package E19;

/**
 * Created by Seanol on 2017/2/25.
 */
public class Zhi implements Coin {
    private int zhi = 0;
    private static final int ZHI = 6;
    public boolean pao(){
        System.out.println("zhi ying bi : " + zhi);
        return ++zhi != ZHI;
    }
}
