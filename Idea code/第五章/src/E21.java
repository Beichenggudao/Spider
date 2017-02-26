/**
 * Created by Seanol on 2017/2/20.
 */
enum Spiciness{
    one,five,ten,twenty,fifty,hundred
}
public class E21 {
    public static void main(String [] args){
        for(Spiciness s : Spiciness.values())
            System.out.println(s + ",ordinal" + s.ordinal());
    }
}
