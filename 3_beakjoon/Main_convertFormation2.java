import java.io.*;
import java.math.BigDecimal;
public class Main_convertFormation2{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sentence = br.readLine().split(" ");
        long formation=Long.parseLong(sentence[1]);
        long target=Long.parseLong(sentence[0]);
        long rest=0;
        long share=target;
        StringBuilder answer=new StringBuilder();
        if(target==0){
            bw.write("0");
            bw.flush();
            bw.close();
            br.close();
            return;
        }
        while(share>0){
            share=target/formation;
            rest=target%formation;
            if(rest>=10) {
                answer.append((char)(rest-10+'A'));
            }else {
                answer.append((char) (rest + '0'));
            }
            target=share;
        }
        for(int i=answer.length()-1;i>=0;i--){
            bw.write(answer.charAt(i));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}