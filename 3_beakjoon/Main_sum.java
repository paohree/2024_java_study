import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main_sum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numbers=Integer.parseInt(br.readLine());
        String sentence=br.readLine();
        int sum=0;
        for(int i=0;i<numbers;i++){
              //bw.write((sentence.charAt(i))+" ");
              //bw.flush();
              sum=sum+(sentence.charAt(i)-48);
              //bw.flush();
        }
        bw.write(sum+ "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}