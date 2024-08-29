import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_homework{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] classroom = new Integer[30];
        for(int i=0;i<classroom.length;i++){
            classroom[i]=0;
        }
        int submit=0;
        for(int i=0;i<28;i++){
            submit=Integer.parseInt(br.readLine())-1;
            classroom[submit]=1;
        }
        for(int i=0;i<30;i++){
            if(classroom[i]==0){
                bw.write((i+1)+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}