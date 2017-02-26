package E0602;

import E06.Form;

/**
 * Created by Seanol on 2017/2/26.
 */
public class Outer {
    protected class Inner implements Form {
        public Inner(){

        }
        public void f1(){
            System.out.println("f1");
        }
        public void f2(){

        }
    }
}
