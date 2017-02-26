package E13;

/**
 * Created by Seanol on 2017/2/23.
 */
public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared(){
        System.out.println("Creating " + this );
    }
    public void addRef(){
        refcount ++;
    }
    protected void dispose(){
        if(--refcount==0){
            System.out.println("Disposing " + this);
        }
    }
    protected void finalize(){
        if(refcount!=0)
            System.out.println("error,");
    }
    public String toString(){
        return "Shared " + id ;
    }
}
