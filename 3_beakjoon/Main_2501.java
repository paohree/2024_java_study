import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main_2501{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int num1=Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        ArrayList<Integer> box=new ArrayList<>();
        int left=1;
        int right=2;
        while(true){
            if(left>=right){
                break;
            }else{
                if(num1%left==0){
                    right=num1/left;
                    if(left==num1/left){
                        box.add(left);
                    }else{
                        box.add(left);
                        box.add(right);
                    }
                    left=left+1;
                }else{
                    left=left+1;
                }
            }
        }
        Collections.sort(box);
        //System.out.println(box);
        if(box.size()<num2){
            bw.write("0");
        }else{
            bw.write(box.get(num2-1)+"");
        }
        bw.close();
        br.close();
    }
}