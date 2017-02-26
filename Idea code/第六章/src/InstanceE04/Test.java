package InstanceE04;

import E04.Cat;

/**
 * Created by Seanol on 2017/2/21.
 */
public class Test extends Cat {
    public Test(){
        System.out.println("this is a test");
    }
    public void sa(){
        say();
    }
    public static void main(String[] args){
        Test t = new Test();
        t.sa();
    }
}
