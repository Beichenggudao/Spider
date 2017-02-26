package E01;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Dog {
    private String name;
    public Dog(){
        System.out.println("dog");
    }
    public String toString(){
        name = "baby";
        return
                "name : " + name ;
    }
    public static void main(String[] args){
        Dog d = new Dog();
        System.out.println(d);
    }
}
