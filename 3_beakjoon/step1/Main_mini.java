import java.util.Scanner;
public class Main_mini{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] divided=sentence.split(" ");
        long answer=0;
        for(int i=0;i<3;i++) {
            answer = answer + Long.parseLong(divided[i]);
        }
        System.out.println(answer);
    }
}