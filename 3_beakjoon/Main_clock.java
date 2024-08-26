import java.util.Scanner;
public class Main_clock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] divided=input.split(" ");
        int first=Integer.parseInt(divided[0]);
        int second=Integer.parseInt(divided[1]);
        if(second>=45){
            second=second-45;
        }else{
            first=first-1;
            if(first<0){
                first=24+first;
            }
            second=60 - (45-second);
        }
        System.out.println(first+" "+second);
        sc.close();
    }
}