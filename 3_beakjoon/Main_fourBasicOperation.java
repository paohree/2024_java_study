import java.util.Scanner;
public class Main_fourBasicOperation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double first=sc.nextDouble();
        double second=sc.nextDouble();
        System.out.println((int)first+(int)second);
        System.out.println((int)first-(int)second);
        System.out.println((int)first*(int)second);
        System.out.println((int)first/(int)second);
        System.out.println((int)first%(int)second);
    }
}