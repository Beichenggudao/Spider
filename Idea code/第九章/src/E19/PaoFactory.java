package E19;

/**
 * Created by Seanol on 2017/2/25.
 */
public class PaoFactory implements CoinFactory {
    public Coin getCoin(){
        return new Pao();
    }
}
