package Append;


import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Seanol on 2017/2/25.
 */
public class Test implements Readable{
    private int count;
    private static Random random = new Random(47);
    private static char[] capitals = "ABVF".toCharArray();
    private static char[] lowels = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static char[] vowels = "ASDFFGHH".toCharArray();

    public int read(CharBuffer cb){
        if(count-- == 0)
            return -1;
        cb.append(capitals[random.nextInt(capitals.length)]);
        for(int i = 0; i < 4; i++){
            cb.append(vowels[random.nextInt(vowels.length)]);
            cb.append(lowels[random.nextInt(lowels.length)]);
        }
        cb.append(" ");
        return 0;
    }
    public  Test(int count){
        this.count = count;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(new Test(5));
        while (s.hasNext())
            System.out.println(s.next());
    }
}
