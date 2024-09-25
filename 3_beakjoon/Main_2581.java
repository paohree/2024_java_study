import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class Main_2581{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int rangeLeft = Integer.parseInt(br.readLine());
        int rangeRight = Integer.parseInt(br.readLine());
        int minimum=10000;//결과 요구 조건 1 소수 중 제일 작은 것. 범위 최대가 만임.
        int sum=0;//결과 요구 조건 2 소수의 합
        int target=rangeLeft;//범위 내에서 확인 할 친구
        int left=1;//약수 찾을 때 쓸거임
        int right=2;//약수 찾을 때 쓸거임
        ArrayList<Number> box = new ArrayList<>();//약수 넣을 박스임
        while(true) {
            if (target == rangeRight + 1) {//타겟을 정하는 루프
                break;
            } else {
                while (true) {//타겟의 약수 구하는 루프
                    if (left > right) {
                        break;
                    } else {
                        if (target % left == 0) {//약수인데
                            if (left == target / left) {//제곱수이면
                                box.add(left);//하나만 넣고
                            } else {//제곱수가 아니면
                                box.add(left);
                                box.add(target / left);
                            }
                        }
                    }
                    left = left + 1;
                    right = target / left;
                }
                if (box.size() == 2) {//소수이면 소수의 합에 추가
                    sum = sum + target;
                    if (target < minimum) {//소수인데 최소이면 최소라고 설정
                        minimum = target;
                    }
                }
                target = target + 1;//범위 내 확인을 위해 1 추가
                left=1;//left, right, box 초기화
                right=2;
                box.clear();
            }
        }
        if(sum==0){
            bw.write("-1");

        }else{
            bw.write(sum+"\n"+minimum);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}