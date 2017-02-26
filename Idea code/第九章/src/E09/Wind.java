package E09;

/**
 * Created by Seanol on 2017/2/24.
 */
public class Wind implements Instrument,Playable{
    public void adjust(){
        System.out.println(this + ".adjust() ");
    }
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }

}
