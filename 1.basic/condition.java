import java.util.ArrayList;

public class condition {
    public static void main(String[] args){
        boolean bull=true;
        if(bull==true){
            System.out.println("가즈아");
        }else{
            System.out.println("존버");
        }
        ArrayList<String> asset=new ArrayList<String>();
        asset.add("nasdaq");
        asset.add("bitcoin");
        if(asset.contains("nasdaq_short")){
            System.out.println("let's go");
        }else if(asset.contains("bitcoin")){
            System.out.println("wowdoge");
        }else{
            System.out.println("are you short?");
        }

        int month=9;
        String monthName="";
        switch(month){
            case 1: monthName="January";
            break;
            case 2: monthName="Faburary";
            break;
            case 9: monthName="September";
            break;
        }
        System.out.println(monthName);

        int countdown=10;
        while(countdown!=0){
            System.out.println(countdown);
            countdown=countdown-1;
            if(countdown==5){
                System.out.println("지나갑니다요");
                continue;
            }
        }
        System.out.println("Fire!");

        int worry;
        for(worry=5; worry!=0;worry--){
            System.out.println(worry+"번 고민했습니다");
        }
    }
}
