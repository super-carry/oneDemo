package learning.sixChapter.exer1;

public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("女人上厕所");
    }

    public void makeup(){
        System.out.println("化妆");
    }
}
