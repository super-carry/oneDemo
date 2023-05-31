package learning.sixChapter.exer1;

public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("男人上厕所");
    }
    public void smoke(){
        System.out.println("抽烟");
    }
}
