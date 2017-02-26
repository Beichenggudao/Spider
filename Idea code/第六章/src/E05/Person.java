package E05;

/**
 * Created by Seanol on 2017/2/21.
 */
public class Person {
    public String name;
    private  int age ;
    protected  boolean sex;
    double height;

    public  void f1(){
        System.out.println("f1");
    }
    private void f2(){
        System.out.println("f2");
    }
    protected void f3(){
        System.out.println("f3");
    }
    void t(){
        System.out.println("t");
    }

    public static void main(String[] args){
        Person li = new Person();
        li.name = "lizein";
        li.age  = 20;
        li.sex = true;
        li.height = 180.0;
        System.out.println("my name = " + li.name + ",age =" + li.age + ",sex = " + li.sex + "height = " + li.height);

        li.f1();
        li.f2();
        li.f3();
        li.t();
    }
}
