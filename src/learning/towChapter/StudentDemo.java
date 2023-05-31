package learning.towChapter;

import java.util.Random;

public class StudentDemo {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        Random rad = new Random();
        for (int i = 0; i < 20; i++) {
            stu[i] = new Student();
            stu[i].score = rad.nextInt(101);
            stu[i].number = 10001;
            stu[i].state = rad.nextInt(6)+1;
        }
        for (int i = 0; i < 20; i++) {
            if(stu[i].state==3)
                System.out.println(""+stu[i].number + ':' + stu[i].score);
        }
    }
}
