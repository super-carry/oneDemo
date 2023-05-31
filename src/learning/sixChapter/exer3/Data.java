package learning.sixChapter.exer3;

public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o){
        if(o==this){
            return true;
        }
        if(o instanceof Data){
            Data d1 = (Data)o;
            return this.day==((Data) o).day && this.month==((Data) o).month && this.year==((Data) o).year;
        }
        return false;
    }

    public static void main(String[] args) {
        Data d1 = new Data(1, 2, 3);
        Data d2 = new Data(1, 2, 3);
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
    }
}
