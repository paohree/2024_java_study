import java.io.*;
public class Main_findFraction{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int small=1;
        int big=1;
        int loop=1;
        while(true){
            if(small<=input&&input<=big){
                break;
            }else{
                loop=loop+1;
                small=big+1;
                big=big+loop;
            }
        }
        if(loop%2!=1){
            bw.write((int)(input-small+1)+"/"+(int)(big-input+1));
        }else{
            bw.write((int)(big-input+1)+"/"+(int)(input-small+1));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}