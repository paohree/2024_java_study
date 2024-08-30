import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_iterateString{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop=Integer.parseInt(br.readLine());
        String sentence;
        String[] divideSentence = new String[2];
        int index=0;

        for(int i=0;i<loop;i++){
            sentence=br.readLine();
            divideSentence=sentence.split(" ");

            while(true) {
                if(index==divideSentence[1].length()){
                    break;
                }
                for (int j = 0; j < Integer.parseInt(divideSentence[0]); j++) {
                    bw.write(divideSentence[1].charAt(index));
                }
                index = index + 1;
            }
            index=0;

            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}