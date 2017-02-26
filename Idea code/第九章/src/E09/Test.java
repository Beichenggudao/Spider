package E09;

/**
 * Created by Seanol on 2017/2/24.
 */
public class Test {
    static void tune(Playable i){
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e){
        for(Playable i : e)
            tune(i);
    }
    public static void main(String[] args){
        Playable[] play = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
        };
        tuneAll(play);
    }
}
