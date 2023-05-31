package learning.sixChapter;

public class polymorphism {
    public static void main(String[] args) {
        person p2 = new woman();
        // a instanceof A 判断a是否是A的实例
        // a instanceof superA 也是true
        if(p2 instanceof man){
            man m1 = (man)p2;
        }
    }
}

class person{

}

class man extends person{

}

class woman extends person{

}
