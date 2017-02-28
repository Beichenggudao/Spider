package E12xx;

/**
 * Created by Seanol on 2017/2/27.
 */
//匿名内部类 不会挖
/*public class Outer2 {
    public Inner inner(){
      return new Inner(){
          private int i = 0;
          private void f(){
              System.out.println("out");
          }
          public void alter(){
              i++;
              f();
              System.out.println(i);
          }
      };
    }
    public static void main(String[] args){
        Outer2 ou2 = new Outer2();
        Inner inner = ou2.inner();
    }
}
*/
