import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main_star{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        int space=number-1;
        int star=1;
        for(int i=0; i<number;i++){
            for(int j=space;j!=0;j--){
                bw.write(" ");
            }
            for(int j=0;j<star*2-1;j++){
                bw.write("*");
            }
            bw.write("\n");
            space=space-1;
            star=star+1;
        }
        space=1;
        star=number;
        for(int i=number;i>1;i--){
            star=star-1;
            for(int j=space;j!=0;j--){
                bw.write(" ");
            }
            for(int j=0;j<star*2-1;j++){
                bw.write("*");
            }
            space=space+1;
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}