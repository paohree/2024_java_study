import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_charAndString{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s=br.readLine();
        int i=Integer.parseInt(br.readLine())-1;
        bw.write(s.charAt(i)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}