package E09;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Stem extends Root{
    Component1 com1 = new Component1();
    Component2 com2 = new Component2();
    Component3 com3 = new Component3();
    Stem(){
        System.out.println("Stem");
    }
    public static void main(String[] args){
        new Stem();
        
    }
}
