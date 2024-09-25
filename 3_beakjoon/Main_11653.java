import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class Main_11653{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine());
        int number=2;
        while(true){
            if(target==1){//target이 1이면 다 나누어 떨어졌다는거임 끝
                break;
            }else{

                if(target%number==0){//만약 나누어떨어진다면
                    bw.write(number+"\n");
                    target=target/number;//target 나눈 수로 업데이트
                }else{
                    number=number+1;
                }

            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}