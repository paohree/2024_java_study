import java.util.Scanner;
public class Main_multiple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int first=sc.nextInt();
        int second=sc.nextInt();
        int originSecond=second;

        int firstRest=second%10;
        System.out.println(first*firstRest);

        int secondRest=(second-firstRest)%100;
        System.out.println(first*secondRest/10);

        int thirdRest=(second-firstRest-secondRest)%1000;
        System.out.println(first*thirdRest/100);

        System.out.println(first*originSecond);

        sc.close();
    }
}