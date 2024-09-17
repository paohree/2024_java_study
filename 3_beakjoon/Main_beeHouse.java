import java.io.*;
public class Main_beeHouse {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target=Integer.parseInt(br.readLine());
        int small=1;
        int big=1;
        int loop=1;
        while(true){
            if(small<=target&&target<=big){
                break;
            }else{
                small=big+1;
                big=big+6*loop;
                loop=loop+1;
            }
        }
        bw.write(loop+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
