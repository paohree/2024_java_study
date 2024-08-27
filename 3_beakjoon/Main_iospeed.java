import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main_iospeed{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] process;
        int s=Integer.parseInt(bf.readLine());
        for(int i=0;i<s;i++){
            process=(bf.readLine()).split(" ");
            bw.write(Integer.parseInt(process[0])+Integer.parseInt(process[1])+"\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}