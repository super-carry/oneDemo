package learning.eightChapter._enum;

public class SeasonTest2 {
    public static void main(String[] args) {
        Season2.SPRINT.show();
    }
}

enum Season2 implements Info{
    SPRINT("春天", "春暖花开"){
        @Override
        public void show() {
            super.show();
            System.out.println("万物复苏");
        }
    },
    SUMMER("夏天", "热"){
        @Override
        public void show() {
            System.out.println("天气炎热");
        }
    },
    AUTUMN("秋天", "凉"),
    WINTER("冬天", "冷");
    private final String seasonName;
    private final String seasonDesc;

    private Season2(String seasonName, String seasonDesc) {
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
        return "Season2{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println(111);
    }
}

