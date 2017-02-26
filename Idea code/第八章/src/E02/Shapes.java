package E02;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args){
        Shape[] s = new Shape[20];
        for(int i = 0;i < s.length; i++)
            s[i] = gen.next();
        for(Shape sh : s)
            sh.draw();
    }
}
