package E12xx;

/**
 * Created by Seanol on 2017/2/25.
 */
public class Adventure {
    public static void a(CanFly x){
        x.fly();
    }
    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanClimb x){
        x.climb();
    }
    public static void v(CanSwim x){
        x.swim();
    }
    public static void w(ActionCharacter x){
        x.fight();
    }
    public static void main(String[] args){
        Hero h = new Hero();
        a(h);
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
