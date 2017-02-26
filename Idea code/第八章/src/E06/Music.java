package E06;

import E02.RandomShapeGenerator;

import java.util.Random;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Music {
    /*
    static Instrument[] ins = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woowind(),
            new A(),
    };
第一种：
    public static void printALL(Instrument[] e){

        for(Instrument i : e)
            System.out.println(i);
    }
    public static void main(String[] args){
        printALL(ins);
    }
第二种：
    public static void main(String[] args){
        for(Instrument i :ins)
            System.out.println(i);
    }
    */
    private static RandomGenerator rg = new RandomGenerator();
    public static void main(String[] args){
        Instrument[] s = new Instrument[12];
        for(int i = 0;i < s.length;i++) {
            s[i] = rg.next();
            System.out.println(s[i]);
        }
    }






















}
