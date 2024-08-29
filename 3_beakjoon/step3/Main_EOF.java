import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Main_EOF{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String endChecker;
        String[] box;
        while(true){
            endChecker=br.readLine();
            if(endChecker==null){
                break;
            }else{
                box=endChecker.split(" ");
                bw.write((Integer.parseInt(box[0])+Integer.parseInt(box[1]))+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}