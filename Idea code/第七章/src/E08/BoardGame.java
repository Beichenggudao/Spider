package E08;

/**
 * Created by Seanol on 2017/2/22.
 */
public class BoardGame extends Game {
    /*
    BoardGame(){
        super();
    }
    */
    BoardGame(int i){
        super(i);
        System.out.println("有参构造器");
    }
    public static void main(String[] args){
        BoardGame b = new BoardGame(3);

    }

}
