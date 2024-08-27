import java.util.Scanner;
import java.util.ArrayList;
public class Main_recipt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int totalPrice=sc.nextInt();
        int valueCalculate=0;
        int totalNumber=sc.nextInt();
        String[] processing;
        String buffer=sc.nextLine();
        ArrayList<String> box = new ArrayList<>();

        for(int i=0;i<totalNumber;i++){
            box.add(sc.nextLine());
        }

//        for(int i=0;i<totalNumber;i++){
//            System.out.println(box.get(i));
//        }

        for(int i=0;i<totalNumber;i++){
            processing=(box.get(0)).split(" ");
            valueCalculate=valueCalculate+Integer.parseInt(processing[0])*Integer.parseInt(processing[1]);
            box.remove(0);
        }

        if(valueCalculate==totalPrice){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}