package E15;

/**
 * Created by Seanol on 2017/2/23.
 */
public class RectangularGlyph extends Glyph {
    private String i ="1";
    RectangularGlyph(String n){
        i = n;
        System.out.println("RectangularGlyph(), i = " +i);
    }
    void draw(){
        System.out.println("RectangularGlyph().draw(), radius = " + i);
    }
}
