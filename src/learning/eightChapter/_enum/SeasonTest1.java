package learning.eightChapter._enum;

import javax.swing.*;

public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 s = Season1.SPRINT;
        System.out.println(s);
        System.out.println(s.getClass().getSuperclass());

        //values()
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].name());
        }

        //valuesof(String objName)
        String objName = "WINTER";
        Season1 season1 = Season1.valueOf(objName);
        System.out.println(season1.name());

        //ordinal()角标
        System.out.println(s.ordinal());
    }
}

interface Info{
    void show();
}

enum Season1 implements Info{
    SPRINT("春天", "春暖花开"),
    SUMMER("夏天", "热"),
    AUTUMN("秋天", "凉"),
    WINTER("冬天", "冷");
    private final String seasonName;
    private final String seasonDesc;

    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println(111);
    }
}
