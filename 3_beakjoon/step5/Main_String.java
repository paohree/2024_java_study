import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_String{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());
        String word;
        for(int i=0;i<loop;i++){
            word=br.readLine();
            bw.write(word.charAt(0)+""+word.charAt(word.length()-1)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}