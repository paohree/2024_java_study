import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Main_plus8{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String[] box;
        for(int i=0;i<T;i++){
            box=(br.readLine()).split(" ");
            bw.write("Case #"+(i+1)+": "+(Integer.parseInt(box[0]))+" + "+(Integer.parseInt(box[1]))+" = "+(Integer.parseInt(box[0])+Integer.parseInt(box[1]))+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}