/**
 * Created by Seanol on 2017/2/20.
 */
enum Money{
    one,five,ten,twenty,fifty,hundred
}
public class E22 {
    Spiciness num;
    public E22(Spiciness num){
        this.num = num;
    }
    public void describe(){
        switch (num){
            case one : System.out.println("这是一元");break;
            case five: System.out.println("这是五元");break;
            case ten : System.out.println("这是十元");break;
            case twenty:System.out.println("这是二十元");break;
            case fifty:System.out.println("这是五十元");break;
            case hundred: System.out.println("这是一百元");break;
            default:break;
        }
    }
    public static void main (String[] args){
        for(Money s :Money.values())
            System.out.println(s + ",ordinal" + s.ordinal());
        E22 a = new E22(Spiciness.five);
        a.describe();
    }
}
