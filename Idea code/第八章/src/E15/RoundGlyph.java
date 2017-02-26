package E15;

/**
 * Created by Seanol on 2017/2/23.
 */
public class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " +radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }

}
