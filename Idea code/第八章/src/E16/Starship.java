package E16;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Starship {
    private AlertStatus alert = new BigStatus();
    public void change1(){
        alert = new MiddleStatus();
    }
    public void change2(){
        alert = new LittleStatus();
    }
    public void perform(){
        alert.status();
    }
}
