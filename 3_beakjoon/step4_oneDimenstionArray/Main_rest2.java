import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_rest2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop=10;
        Integer[] box=new Integer[10];
        for(int i=0;i<loop;i++){
            box[i]=Integer.parseInt(br.readLine())%42;
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(box[i]==box[j]){
                    box[j]=-1;
                }
            }
        }
        int count=0;
        for(int i=0;i<10;i++){
            if(box[i]>=0){
                count=count+1;
            }
        }
//        for(int i=0;i<10;i++){
//            bw.write(box[i]+" ");
//        }
//        bw.write("\n");
//        bw.flush();
        bw.write(count+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}