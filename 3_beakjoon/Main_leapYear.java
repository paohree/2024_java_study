import java.util.Scanner;
public class Main_leapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        if(target%4==0){
            if(target%100!=0){
                System.out.println("1");
            }else if(target%400==0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }else{
            System.out.println("0");
        }
        sc.close();
    }
}