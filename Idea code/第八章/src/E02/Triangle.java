package E02;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Triangle extends Circle{
    @Override public void draw(){
        System.out.println("Triangle.draw");
    }
    @Override public void erase(){
        System.out.println("Triangle.erase");
    }
    @Override public void say(){
        System.out.println("Square 打印");
    }
}
