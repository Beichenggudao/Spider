package E04;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Drawing extends Art{
    public Drawing(){
        System.out.println("Drawing construtor");
    }
    public static void main(String[] args){
        Drawing a = new Drawing();
        Drawing b = new Drawing();
    }
}
