import java.util.Scanner;
public class Main_longlong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int longNumber=sc.nextInt();
        int circle=longNumber/4;
        for(int j=0;j<circle;j++){
            System.out.print("long ");
        }
        System.out.println("int");
        sc.close();
    }
}