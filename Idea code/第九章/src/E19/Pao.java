package E19;

/**
 * Created by Seanol on 2017/2/25.
 */
public class Pao implements Coin {
    private int paos = 0;
    private static final int PAO = 2;
    public boolean pao(){
        System.out.println("pao ying bi : " + paos);
        return ++paos !=PAO;
    }
}
