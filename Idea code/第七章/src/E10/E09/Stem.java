package E10.E09;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Stem extends Root {

    Stem(int i){
        super(i);
        System.out.println("Stem");
    }
    public static void main(String[] args){
        new Stem(2);
        
    }
}
