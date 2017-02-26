package E19;



/**
 * Created by Seanol on 2017/2/25.
 */
public class Test {
    public static void play(CoinFactory coinFactory){
        Coin c = coinFactory.getCoin();
        while(c.pao());
    }
    public static void main(String[] args){
        play(new PaoFactory());
        play(new Zhifactory());
    }
}
