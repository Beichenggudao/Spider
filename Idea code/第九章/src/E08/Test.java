package E08;

/**
 * Created by Seanol on 2017/2/24.
 */
public class Test {
    static void tune (Instrument i){
        i.play(Note.MIDDLE_C);
    }
    static void tuenAll(Instrument[] e){
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args){
        Instrument[] in= {
          new Wind(),new Perssion(),new Stringed(), new Brass(), new Woodwind(),
        };
        tuenAll(in);
    }
}
