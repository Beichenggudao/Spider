package 内部类的继承;

/**
 * Created by Seanol on 2017/2/28.
 */
public class InheritInner extends WithInner.Inner{
    InheritInner(WithInner wi){
        wi.super();
    }
    public static void main(String[] args){
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
        ii.say();
        ii.value();
    }
}
