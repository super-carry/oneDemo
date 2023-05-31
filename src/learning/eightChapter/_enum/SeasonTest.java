package learning.eightChapter._enum;

public class SeasonTest {
}

//jdk5.0
class Season{
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc){

        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public final static Season SPRING = new Season("春天", "春暖花开");
    public final static Season summer = new Season("夏天", "夏日炎炎");
    public final static Season autumn = new Season("秋天", "秋高气爽");
    public final static Season winter = new Season("冬天", "寒风瑟瑟");
}
