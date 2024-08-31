import java.io.*;
public class Main_palindrome{
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] sentence = br.readLine().toCharArray();
        int left=0;
        int right=sentence.length-1;
        int checker=1;
        while(true){
            if(left>=right){
                checker=1;
                break;
            }else{
                if(sentence[left]==sentence[right]){
                    checker=1;
                    left=left+1;
                    right=right-1;
                }else{
                    checker=0;
                    break;
                }
            }
        }
        bw.write(checker+"");
        bw.flush();
        bw.close();
        br.close();
    }
}