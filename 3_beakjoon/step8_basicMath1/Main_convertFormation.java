import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
public class Main_convertFormation{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sentence = br.readLine().split(" ");
        char[] number = sentence[0].toCharArray();
        int toMultiple=0;
        int formation=Integer.parseInt(sentence[1]);
        double tenFormation=0;
        for(int i=number.length-1;i>=0;i--){
            if(number[i]>=65) {
                toMultiple = number[i] - 55;
//                bw.write(toMultiple+" ");
//                bw.flush();
            }else{
                toMultiple=number[i]-48;
            }
            tenFormation=tenFormation+Math.pow(formation, ((number.length-1)-i))*toMultiple;
//            bw.write(tenFormation+"\n");
//            bw.flush();
        }
//        bw.write("\n");
//        bw.flush();
        BigDecimal answer=new BigDecimal(tenFormation);
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }
}