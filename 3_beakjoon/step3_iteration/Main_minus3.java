import java.util.Scanner;
import java.util.ArrayList;
public class Main_minus3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> box = new ArrayList<Integer>();
        String input;
        String[] converting;

        int T = sc.nextInt();
        input=sc.nextLine();

        for(int i=0;i<T;i++){
            //System.out.println("와드");
            input=sc.nextLine();
            converting=input.split(" ");
            for(int j=0;j<2;j++){
                //System.out.println("와드2");
                box.add(Integer.parseInt(converting[j]));
            }
        }
//        for(int i=0;i<box.size();i++) {
//            System.out.println(box.get(i));
//        }
        for(int i=0;i<T;i++){
            System.out.println(box.get(0)+box.get(1));
            box.remove(0);
            box.remove(0);
        }
        sc.close();
    }
}