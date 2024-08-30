import java.io.*;
public class Main_dial{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input=(br.readLine()).toCharArray();
        int index=0;
        int time=0;

        while(true){
            if(index==input.length){
                break;
            }else{
                if(input[index]=='A'||input[index]=='B'||input[index]=='C'){
                    time=time+3;
                }else if(input[index]=='D'||input[index]=='E'||input[index]=='F'){
                    time=time+4;
                }else if(input[index]=='G'||input[index]=='H'||input[index]=='I'){
                    time=time+5;
                }else if(input[index]=='J'||input[index]=='K'||input[index]=='L'){
                    time=time+6;
                }else if(input[index]=='M'||input[index]=='N'||input[index]=='O'){
                    time=time+7;
                }else if(input[index]=='P'||input[index]=='Q'||input[index]=='R'||input[index]=='S'){
                    time=time+8;
                }else if(input[index]=='T'||input[index]=='U'||input[index]=='V'){
                    time=time+9;
                }else if(input[index]=='W'||input[index]=='X'||input[index]=='Y'||input[index]=='Z'){
                    time=time+10;
                }
                index=index+1;
            }
        }
        bw.write(time+"");
        bw.flush();
        bw.close();
        br.close();
    }
}