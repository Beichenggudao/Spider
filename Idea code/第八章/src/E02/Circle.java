package E02;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Circle extends Shape {
    @Override public void draw(){
        System.out.println("Cicle.draw");
    }
    @Override public void erase(){
        System.out.println("Circle.erase");
    }
    @Override public void say(){
        System.out.println("Ciecle 打印");
    }
}
