import java.io.*;
public class Main_step5Last{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while(true){
            input=br.readLine();
            if(input==null){
                break;
            }else{
                bw.write(input+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}