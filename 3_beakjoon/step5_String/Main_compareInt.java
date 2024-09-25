import java.io.*;
public class Main_compareInt{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] divided=br.readLine().split(" ");
        char[] first=divided[0].toCharArray();
        char[] second=divided[1].toCharArray();

        char buffer=0;
        int firstIndex=0;
        int secondIndex=first.length-1;
        while(true){
            if(firstIndex>=secondIndex){
                break;
            }else{
                buffer=first[firstIndex];
                first[firstIndex]=first[secondIndex];
                first[secondIndex]=buffer;
                firstIndex=firstIndex+1;
                secondIndex=secondIndex-1;
            }
        }

        firstIndex=0;
        secondIndex=second.length-1;
        while(true){
            if(firstIndex>=secondIndex){
                break;
            }else{
                buffer=second[firstIndex];
                second[firstIndex]=second[secondIndex];
                second[secondIndex]=buffer;
                firstIndex=firstIndex+1;
                secondIndex=secondIndex-1;
            }
        }
        String stringFirst="";
        String stringSecond="";
        for(int i=0;i<first.length;i++){
            stringFirst=stringFirst+String.valueOf(first[i]);
        }
        for(int i=0;i<second.length;i++){
            stringSecond=stringSecond+String.valueOf(second[i]);
        }
        if(Integer.parseInt(stringSecond)>Integer.parseInt(stringFirst)){
            bw.write(stringSecond+"");
        }else{
            bw.write(stringFirst+"");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}