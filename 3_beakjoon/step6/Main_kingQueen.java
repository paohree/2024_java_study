import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_kingQueen{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sentence = br.readLine().split(" ");
        int[] set = new int[6];
        int[] checker = new int[6];
        for(int i=0;i<checker.length;i++){
            if(i==0||i==1){
                checker[i]=1;
            }else if(i==2||i==3||i==4){
                checker[i]=2;
            }else{
                checker[i]=8;
            }
        }
        for(int i=0;i<set.length;i++){
            set[i]=Integer.parseInt(sentence[i]);
            checker[i]=checker[i]-set[i];
            bw.write(checker[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}