import java.util.Scanner;
public class Main_threeDice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        String[] divided=input.split(" ");
        int[] dices = new int[3];
        int bigNumber=0;
        int price=0;
        for(int i=0;i<3;i++){
            dices[i]=Integer.parseInt(divided[i]);
        }
        if(dices[0]==dices[1]&&dices[1]==dices[2]){
            price=10000+dices[0]*1000;
        }else if(dices[0]==dices[1]){
            price = 1000+dices[0]*100;
        }else if(dices[0]==dices[2]){
            price = 1000+dices[0]*100;
        }else if (dices[1]==dices[2]){
            price = 1000+dices[1]*100;
        }else{
            for(int i=0;i<3;i++){
                if(dices[i]>=bigNumber){
                    bigNumber=dices[i];
                }
            }
            price=bigNumber*100;
        }
        System.out.println(price);
        sc.close();
    }
}