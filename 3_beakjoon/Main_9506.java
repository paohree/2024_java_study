import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main_9506{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num1=0;
        ArrayList<Integer> box=new ArrayList<>();
        int left=1;
        int right=2;
        int sum=0;
        while(true){
            num1=Integer.parseInt(br.readLine());
            if(num1==-1){
                break;
            }
            left=1;
            right=2;
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
//            System.out.println(box+"\n");
            for(int i=0;i<box.size();i++){
                sum=sum+box.get(i);
//                System.out.println(sum);
            }
            sum=sum-num1;
            if(sum==num1){
                bw.write(num1+" = ");
                for(int j=0;j<box.size()-2;j++){
                    bw.write(box.get(j)+" + ");
                }
                bw.write(box.get(box.size()-2)+"\n");
            }else{
                bw.write(num1+" is NOT perfect. \n");
            }
            box.clear();
            sum=0;
//        Collections.sort(box);
//        System.out.println(box);
//        if(box.size()<num2){
//            bw.write("0");
//        }else{
//            bw.write(box.get(num2-1)+"");
//        }
//        }
        }
        bw.flush();
        bw.close();
        br.close();
        }
}
