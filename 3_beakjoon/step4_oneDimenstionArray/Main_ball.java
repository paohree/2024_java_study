import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_ball{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String firstLine=br.readLine();
        String[] editedFirst=firstLine.split(" ");
        int n=Integer.parseInt(editedFirst[0]);
        Integer[] boxs=new Integer[n];
        for(int i=0;i<n;i++){
            boxs[i]=0;
        }
        int m=Integer.parseInt(editedFirst[1]);
        String command;
        String[] dividedCommand;
        int[] commands = new int[3];
        for(int i=0;i<m;i++){
            command=br.readLine();
            dividedCommand=command.split(" ");
            for(int j=0;j<3;j++){
                commands[j]=Integer.parseInt(dividedCommand[j]);
            }
            for(int k=commands[0]-1;k<commands[1];k++){
                boxs[k]=commands[2];
            }
        }
        for(int i=0;i<n;i++){
            bw.write(boxs[i]+" ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }
}