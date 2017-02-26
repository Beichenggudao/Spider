package E11;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Cleanser {
    private String s = "Cleanser";
    public void append(String a ){
        s += a;
        System.out.println(s);
    }
    public void dilute(){
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
}
