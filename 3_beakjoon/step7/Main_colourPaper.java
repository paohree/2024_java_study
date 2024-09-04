import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main_colourPaper{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        Integer[][] wholePaper = new Integer[100][100];
        for (int i=0;i<100;i++){
            for (int j=0;j<100;j++){
                wholePaper[i][j]=0;
//                bw.write(wholePaper[i][j]+"");//
            }
//            bw.write("\n");//
        }
        bw.flush();//
        int paperNumber = Integer.parseInt(br.readLine());
        String[] inputValue=new String[2];
        int x=0;
        int y=0;
        for(int i=0;i<paperNumber;i++) {
            inputValue = br.readLine().split(" ");
            x = Integer.parseInt(inputValue[0]);
            y = Integer.parseInt(inputValue[1]);
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    wholePaper[j][k] = 1;
                }
            }
        }
//        for(int i=0;i<100;i++){//
//            for(int j=0;j<100;j++){//
//                bw.write(wholePaper[i][j]+"");//
//            }//
//            bw.write("\n");//
//        }//
        int size=0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(wholePaper[i][j]==1){
                    size=size+1;
                }
            }
        }
        bw.write(size+"");

        bw.flush();
        bw.close();
        br.close();
    }
}