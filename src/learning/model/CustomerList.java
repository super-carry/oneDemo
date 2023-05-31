package learning.model;

class CustomerList {
    public void eat(){
        System.out.println("hahaha");
    }
}

class Ca extends CustomerList{
    public static void main(String[] args) {
        Ca c = new Ca();
        c.eat();
    }
}

class People{
    //通过new People()调用
//    public People(){
//        System.out.println(123);
//    }
    //通过new People("字符串")调用
    public People(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        People p = new People("asd");
    }

}

class Student extends People{
    Student(String str){
        super(str);
        System.out.println(123);
    }
}

