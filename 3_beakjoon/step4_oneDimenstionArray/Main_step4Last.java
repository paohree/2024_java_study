import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Main_step4Last{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        String secondLine=br.readLine();
        String[] divideSecond=secondLine.split(" ");
        double tests[] = new double[n];
        double biggest=0;
        double newAverage=0;

        for(int i=0;i<divideSecond.length;i++){
            tests[i]=Double.parseDouble(divideSecond[i]);
            if(tests[i]>biggest){
                biggest=tests[i];
            }
        }
        for(int i=0;i<tests.length;i++){
            tests[i]=tests[i]/biggest*100;
        }
        for(int i=0;i<tests.length;i++){
            newAverage=newAverage+tests[i];
        }
        newAverage=newAverage/tests.length;

        bw.write(newAverage+" ");
        bw.flush();
        bw.close();
        br.close();

    }
}