package E04;

/**
 * Created by Seanol on 2017/2/24.
 */
public class Test {
    public static void main(String[] args){
        Animals animals = new Duck();
        ((Duck)animals).bark();
        WithAnimals withAnimals = new Duck2();
        withAnimals.bark();
    }
}
