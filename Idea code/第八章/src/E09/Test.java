package E09;

/**
 * Created by Seanol on 2017/2/23.
 */
class Test {
    static Rodent[] rodent ={
        new Mouse(),
        new Gerbil(),
        new Hamster(),
    };
    public static void main(String[] args){
        for(Rodent i :rodent) {
            i.say();
            i.sry();
        }
    }
}
