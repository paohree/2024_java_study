import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_count{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loopCount=Integer.parseInt(br.readLine());
        String numbers=br.readLine();
        String[] box=numbers.split(" ");
        int target = Integer.parseInt(br.readLine());
        int answer=0;
        for(int i=0;i<box.length;i++){
            if(Integer.parseInt(box[i])==target){
                answer=answer+1;
            }
        }
        bw.write(answer+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}