/**
 * Created by Seanol on 2017/2/26.
 */
public class Test {
    private int i = 0;
    public boolean end(){
        return i == 0;
    }
    public static void main(String [] args){
        Test t = new Test();
        t.end();
        if(t.end())
        System.out.println("zhen");
    }
}
