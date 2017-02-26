package E16.E17;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Frog extends Amphibian {
    void bark(int i){
        System.out.println("gua gua");
    }
    public static void main(String[] args){
        Frog frog = new Frog();
        frog.bark(1);
    }
}
