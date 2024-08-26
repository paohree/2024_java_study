import java.util.Scanner;

public class Main_rest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers=new int[3];
        for(int i=0;i<3;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println((numbers[0]+numbers[1])%numbers[2]);
        System.out.println(((numbers[0]%numbers[2])+(numbers[1]%numbers[2]))%numbers[2]);
        System.out.println((numbers[0]*numbers[1])%numbers[2]);
        System.out.println(((numbers[0]%numbers[2])*(numbers[1]%numbers[2]))%numbers[2]);
        sc.close();
    }
}