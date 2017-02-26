package E06;

import java.util.Random;

/**
 * Created by Seanol on 2017/2/23.
 */
public class RandomGenerator {
    private Random ran = new Random(47);
    public Instrument next(){
        switch (ran.nextInt(6)){
            default:
            case 0 : return new Wind();
            case 1 : return new Percussion();
            case 2 : return new Stringed();
            case 3 : return new Brass();
            case 4 : return new Woowind();
            case 5 : return new A();
        }
    }
}