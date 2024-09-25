import java.io.*;
import static java.lang.Math.pow;

public class Main_centralMove{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int times=Integer.parseInt(br.readLine());
        int initial=3;
        int answer=0;
        for(int i=0;i<times-1;i++){
            initial=initial*2-1;
        }
        answer=initial*initial;
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }
}