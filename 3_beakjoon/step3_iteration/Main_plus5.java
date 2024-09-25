import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main_plus5{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String[] box = (br.readLine()).split(" ");
            if(box[0].equals("0")&&box[0].equals(box[1])){
                break;
            }else{
                bw.write(Integer.parseInt(box[0])+Integer.parseInt(box[1])+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}