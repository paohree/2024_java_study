import java.util.Scanner;
public class Main_hap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        int answer=0;
        for(int i=0;i<=input;i++){
            answer=answer+i;
        }
        System.out.println(answer);
        sc.close();
    }
}