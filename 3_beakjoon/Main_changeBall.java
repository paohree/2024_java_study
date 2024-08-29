import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_changeBall{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstLine=br.readLine();
        String[] editedFirst=firstLine.split(" ");
        int n = Integer.parseInt(editedFirst[0]);
        int m = Integer.parseInt(editedFirst[1]);
        int buffer=0;

        Integer[] boxes=new Integer[n];
        for(int i=0;i<n;i++){
            boxes[i]=i+1;
        }

//        for(int i=0;i<n;i++){
//            bw.write(boxes[i]+ " ");
//        }
//        bw.flush();

        String command;
        String[] editedCommand;
        int[] commands=new int[2];

        for(int i=0;i<m;i++){
            command=br.readLine();
            editedCommand=command.split(" ");
            commands[0]=Integer.parseInt(editedCommand[0])-1;
            commands[1]=Integer.parseInt(editedCommand[1])-1;
            buffer=boxes[commands[0]];
            boxes[commands[0]]=boxes[commands[1]];
            boxes[commands[1]]=buffer;

//            for(int j=0;j<n;j++){
//                bw.write(boxes[j]+ " ");
//            }
//            bw.flush();
        }
        for(int i=0;i<n;i++){
            bw.write(boxes[i]+" ");
        }
        bw.flush();
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }
}