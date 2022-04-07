package bean;

public class Singleton {
    private static final Singleton obj=new Singleton();
    private Singleton(){System.out.println("private constructor");}
    public static Singleton getSingleton(){
        System.out.println("factory method ");
        return obj;
    }
    public void msg(){
        System.out.println("hello user");
    }
}