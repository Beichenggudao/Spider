package E06;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Chess extends BoardGame {
    Chess(){
       super(11);
       System.out.println("Chess Construtor");
    }
    public static void main(String[] args){
        Chess x = new Chess();
    }
}
