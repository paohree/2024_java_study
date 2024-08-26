import java.util.Scanner;
public class Main_clock2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int timeToCook=sc.nextInt();
        String[] divided=input.split(" ");
        int first = Integer.parseInt(divided[0]);
        int second = Integer.parseInt(divided[1]);
        //System.out.println(timeToCook+" "+first+" "+second);
        first=first+timeToCook/60;
        second=second+timeToCook%60;
        if(second>=60){
            first=first+second/60;
            second=second%60;
        }
        if(first>=24){
            first=first-24;
        }
        System.out.println(first+" "+second);
        sc.close();
    }
}