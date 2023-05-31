import java.util.Scanner;

public class GuLiAccount {
    public static void main(String[] args) {
        while(true){
            System.out.println("-----------------------谷粒记账软件----------------------------");
            System.out.println("                        1 收支明细");
            System.out.println("                        2 登记收入");
            System.out.println("                        3 登记支出");
                System.out.println("                        4 退   出");
                char selection = readMenuSelection();
                System.out.println(selection);
                if(selection=='4'){
                    break;
                }else if(selection=='1'){
                    System.out.println("收支明细");
            }else if(selection=='2'){
                System.out.println("登记收入");
            }else if(selection=='3'){
                System.out.println("登记支出");
            }
        }
    }
    public static char readMenuSelection(){
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        for(;;){
            if(a=='1' || a=='2' || a=='3' || a=='4'){
                return a;
            }else{
                System.out.println("输入有误，请重启输入！");
            }
        }
    }

}
