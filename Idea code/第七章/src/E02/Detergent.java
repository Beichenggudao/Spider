package E02;

/**
 * Created by Seanol on 2017/2/22.
 */
class Detergent {
    private String s = "Detergent";
    public void append(String a){
        s += a;
    }
    public void scrub(){
        append(" scrub()");
    }
    public String toString(){
        return s;
    }
}
