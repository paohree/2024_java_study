import java.util.ArrayList;
import java.util.Arrays;

public class arrayAndList {
    int[] asset={1,2,3,4,5};
    static String[] rich={"나는", "부자가", "될","것이다"};
    static StringBuffer wowdoge = new StringBuffer();
    public static void main(String[] args){
        ArrayList<String> solanaSaga=new ArrayList<String>();
        solanaSaga.add("saga 1  and bonk.");
        solanaSaga.add("saga 2 and airdrop.");
        wowdoge.append("wow doge");
        System.out.println(solanaSaga.get(1));
        System.out.println(Arrays.toString(rich));
        System.out.println(solanaSaga.size());
        System.out.println(wowdoge);
    }
}
