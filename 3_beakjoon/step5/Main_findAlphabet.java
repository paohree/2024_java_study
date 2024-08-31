import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main_findAlphabet{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] box = new Integer[26];
        for(int i=0;i<26;i++){
            box[i]=-1;
        }
        String input=br.readLine();
        int index;
        for(int i=0;i<input.length();i++){
            index=(int)input.charAt(i)-97;
//            bw.write(index+" ");
//            bw.flush();
            if(box[index]==-1){
                box[index]=i;
            }
//            bw.write("\n");
//            bw.flush();
        }
        for(int i=0;i<26;i++){
            bw.write(box[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}