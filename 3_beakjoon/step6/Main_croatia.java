import java.io.*;
public class Main_croatia{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] input=br.readLine().toCharArray();
        int charNumber=0;
        for(int i=0;i<input.length;i++){
            if(i!=input.length-1&&input[i]=='c'&&input[i+1]=='='){
                charNumber=charNumber+1;
                i=i+1;
            }else if(i!=input.length-1&&input[i]=='c'&&input[i+1]=='-'){
                charNumber=charNumber+1;
                i=i+1;
            }else if(i!=input.length-1&&input[i]=='d'&&input[i+1]=='-'){
                charNumber=charNumber+1;
                i=i+1;
            }else if(i!=input.length-2&&i!=input.length-1&&input[i]=='d'&&input[i+1]=='z'&&input[i+2]=='='){
                charNumber=charNumber+1;
                i=i+2;
            }else if(i!=input.length-1&&input[i]=='l'&&input[i+1]=='j'){
                charNumber=charNumber+1;
                i=i+1;
            }else if(i!=input.length-1&&input[i]=='n'&&input[i+1]=='j'){
                charNumber=charNumber+1;
                i=i+1;
            }else if(i!=input.length-1&&input[i]=='s'&&input[i+1]=='='){
                charNumber=charNumber+1;
                i=i+1;
            }else if(i!=input.length-1&&input[i]=='z'&&input[i+1]=='='){
                charNumber=charNumber+1;
                i=i+1;
            }else{
                charNumber=charNumber+1;
            }
        }
        bw.write(charNumber+"");
        bw.flush();
        bw.close();
        br.close();

    }
}