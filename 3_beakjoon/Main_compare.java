import java.util.Scanner;
public class Main_compare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] divided = input.split(" ");
        int first = Integer.parseInt(divided[0]);
        int second = Integer.parseInt(divided[1]);
        if(first>second){
            System.out.println(">");
        }else if(first==second){
            System.out.println("==");
        }else{
            System.out.println("<");
        }
    }
}