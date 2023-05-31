package learning.eightChapter.singleton;

//懒汉式
public class Girlfriend {
    private Girlfriend(){

    }

    private static Girlfriend gd = null;

    public static Girlfriend returngd(){
        if(gd==null){
            Girlfriend gd = new Girlfriend();
        }
        return gd;
    }
}
