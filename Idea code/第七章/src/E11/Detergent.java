package E11;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Detergent extends Cleanser {
    Cleanser a = new Cleanser();
    private String name ;
    public Detergent(String name){
        this.name = name;
    }
    public void append(String b ){
        a.append(name);
    }
    public void dilute(){
        a.dilute();
        System.out.println("代理dilute");
    }
    public void apply(){
        a.apply();
        System.out.println("代理apply");
    }
    public static void main(String[] args){
        Detergent d = new Detergent("Detergent");
        d.dilute();
        d.apply();
    }
}
