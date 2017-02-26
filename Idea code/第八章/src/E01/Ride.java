package E01;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Ride {
    /*
    public static void ride(Unicycle i){
        i.A(Wheel.ONE);
    }
    public static void ride(Bicycle i){
        i.A(Wheel.TWO);
    }
    public static void ride(Tricycle i){
        i.A(Wheel.THREE);
    }
    */
    public static void ride(Unicycle i){
        i.wheels();
    }
    public static void ride(Bicycle i){
        i.wheels();
    }
    public static void ride(Tricycle i){
        i.wheels();
    }
    public static void main(String[] args){
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}

