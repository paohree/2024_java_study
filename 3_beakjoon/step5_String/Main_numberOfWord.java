import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_numberOfWord{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentence = br.readLine();
        String[] divided=sentence.split(" ");
        int count=0;
        for(int i=0;i<divided.length;i++){
            if(divided[i].length()==0){
                count=count+1;
            }
        }
        bw.write((divided.length-count)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}