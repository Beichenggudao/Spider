package E0603;

import E06.Form;
import E0602.Outer;

/**
 * Created by Seanol on 2017/2/26.
 */
public class Extend extends Outer {
    public Form get(){
        return new Inner();
    }
    public static void main(String[] args){
        new Extend().get().f1();
    }
}
