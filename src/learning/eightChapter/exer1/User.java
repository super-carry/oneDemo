package learning.eightChapter.exer1;

public class User {
    private String userName;
    private String password;
    private long registrationTime;

    public User() {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        userName = registrationTime + "";
        password = "123456";
    }

    public User(String userName, String password, long registrationTime) {
        this.userName = userName;
        this.password = password;
        this.registrationTime = System.currentTimeMillis();
    }

    public String getInfo(){
        return "username:" + userName + ',' + "password:" + password + ',' + registrationTime;
    }

    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.getInfo());
    }
}
