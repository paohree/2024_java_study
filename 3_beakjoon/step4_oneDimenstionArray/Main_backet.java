import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_backet{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstLine=br.readLine();
        String[] divided=firstLine.split(" ");
        int n = Integer.parseInt(divided[0]);
        int m = Integer.parseInt(divided[1]);

        Integer[] boxes=new Integer[n];
        for(int i=0;i<n;i++){
            boxes[i]=i+1;
        }

        String secondLine;
        String[] editedSecond;
        int indexOne=0;
        int indexTwo=0;
        int buffer=0;

        int little=0;
        int big=0;

        for(int i=0;i<m;i++){
            secondLine=br.readLine();
            editedSecond=secondLine.split(" ");
            indexOne=Integer.parseInt(editedSecond[0])-1;
            indexTwo=Integer.parseInt(editedSecond[1])-1;
            little=indexOne;
            big=indexTwo;
            while(true){
                if(little>=big){
                    break;
                }else{
                    buffer=boxes[little];
                    boxes[little]=boxes[big];
                    boxes[big]=buffer;
                    little=little+1;
                    big=big-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            bw.write(boxes[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}