import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_max{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int count=0;
        int big=0;
        String inputValue;
        for(int i=0;i<9;i++){
            inputValue=br.readLine();
            if(inputValue==null){
                break;
            }else{
                int target=Integer.parseInt(inputValue);
                if(target>big){
                    big=target;
                    count=i+1;
                }
            }
        }
        bw.write(big+"\n");
        bw.write(count+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}