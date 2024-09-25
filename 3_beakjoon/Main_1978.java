import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
public class Main_1978{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int numbers = Integer.parseInt(br.readLine());
        String[] sentence = br.readLine().split(" ");
        Integer[] candidate = new Integer[numbers];
        for(int i=0;i<numbers;i++){
            candidate[i]=Integer.parseInt(sentence[i]);
        }
        ArrayList<Number> box=new ArrayList<>();//약수 담을 공간임
        int left=1;//1부터 나눌 것임
        int right=2;//아무튼 첫번째 트라이때 left보다 커야 함
        int index=0;//몇번째 후보인지 알려줄것임
        int answer=0;
        for(int i=0;i<numbers;i++){
            while(true) {
                if (left > right) {
                    break;
                } else {
                    if(candidate[index]%left==0){
                        if (left == candidate[index] / left) {//제곱수이면 하나만 넣어줄 것임
                            box.add(left);
                        } else {//제곱수가 아니면 약수임 ㅇㅇ
                            box.add(left);
                            box.add(candidate[index] / left);
                        }
                    }
                    left = left + 1;
                    right = candidate[index] / left;
                }
            }
            if(box.size()==2){
                answer=answer+1;
            }
            box.clear();
            left=1;
            right=2;
            index=index+1;
        }
        bw.write(answer+"");
        bw.flush();
        br.close();
        bw.close();
    }
}