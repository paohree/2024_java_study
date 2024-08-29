import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main_littleNumber{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String firstLine = br.readLine();
        String[] edited_firstLine = firstLine.split(" ");
        int numbers=Integer.parseInt(edited_firstLine[0]);
        int target=Integer.parseInt(edited_firstLine[1]);
        String secondLine = br.readLine();
        String[] edited_secondLine= secondLine.split(" ");

        for(int i=0;i<numbers;i++){
            if(Integer.parseInt(edited_secondLine[i])<target){
                bw.write(edited_secondLine[i]+" ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}