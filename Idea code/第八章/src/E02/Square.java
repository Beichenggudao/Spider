package E02;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Square extends Circle{
    @Override public void draw(){
        System.out.println("Square.draw");
    }
    @Override public void erase(){
        System.out.println("Square.erase");
    }
    @Override public void say(){
        System.out.println("Square 打印");
    }
}
