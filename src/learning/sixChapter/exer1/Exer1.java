package learning.sixChapter.exer1;

public class Exer1 {
    public static void meeting(Person ps){
        ps.eat();
        ps.toilet();
        if(ps instanceof Man){
            Man m = (Man)ps;
            m.smoke();
        }
        if(ps instanceof Woman){
            Woman m = (Woman)ps;
            m.makeup();
        }
    }

    public static void main(String[] args) {
        Man m = new Man();
        meeting(m);
        Woman wm = new Woman();
        meeting(wm);
    }
}
