package E02;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Test extends Detergent{
    public void scrub(){
        append(" chongxie");
        super.scrub();
    }
    public void sterilize(){
        append(" sterilize()");
    }
    public static void main(String[] args){
        Test x = new Test();
        x.scrub();
        x.sterilize();
        System.out.println(x);
    }
}
