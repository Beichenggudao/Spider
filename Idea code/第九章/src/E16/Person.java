package E16;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Seanol on 2017/2/25.
 */
public class Person implements Readable{
    private Random random = new Random(47);
    char[] s = "mynameisli".toCharArray();
    private int count;
    public Person(int count){
        this.count = count;
    }
    public int read(CharBuffer cb){
        if(count-- ==0)
            return -1;
        cb.append(s[random.nextInt(s.length)]);
        cb.append(" ");
        return 0;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(new Person(5));
        while(s.hasNext())
            System.out.println(s.next());
    }
}
