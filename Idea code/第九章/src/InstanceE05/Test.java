package InstanceE05;
import E05.Method;

/**
 * Created by Seanol on 2017/2/24.
 */
class Test implements Method{
    @Override
    public void f1(){
        System.out.println("Test ");
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }

    public static void main(String[] args){
        Test test = new Test();
        test.f1();
    }
}
