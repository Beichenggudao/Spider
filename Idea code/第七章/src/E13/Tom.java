package E13;

/**
 * Created by Seanol on 2017/2/22.
 */
public class Tom extends Dog {
   void bark(){
       System.out.println("无参bark");
   }
   public static void main(String[] args){
       Tom tom = new Tom();
       tom.bark();
       tom.bark(1);
       tom.bark("wang");
       tom.bark("li",1);
   }
}
