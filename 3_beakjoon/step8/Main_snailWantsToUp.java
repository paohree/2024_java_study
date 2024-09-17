import java.io.*;
public class Main_snailWantsToUp{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String[] numbers=br.readLine().split(" ");
        int up=Integer.parseInt(numbers[0]);
        int down=Integer.parseInt(numbers[1]);
        int height=Integer.parseInt(numbers[2]);

        int days=(height-down)/(up-down);
        if((height-down)%(up-down)!=0){
            days=days+1;
        }
        bw.write(days+"");
        bw.close();
        br.close();
    }
}