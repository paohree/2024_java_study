import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_bigSmall{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int firstLine=Integer.parseInt(br.readLine());
        String secondLine=br.readLine();
        String[] editedSecond=secondLine.split(" ");
        int big=-1000000;
        int small=1000000;
        for(int i=0;i<firstLine;i++){
            if(Integer.parseInt(editedSecond[i])<small){
                small=Integer.parseInt(editedSecond[i]);
            }
            if(Integer.parseInt(editedSecond[i])>big){
                big=Integer.parseInt(editedSecond[i]);
            }
        }
        bw.write(small+" "+big+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}