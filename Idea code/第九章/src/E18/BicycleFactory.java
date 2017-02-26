package E18;

/**
 * Created by Seanol on 2017/2/25.
 */
public class BicycleFactory implements CycleFactory {
    public Cycle getCycle(){
        return new Bicycle();
    }
}
