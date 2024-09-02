import java.io.*;
public class Main_findingBigInMatrix{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sentence;
        Integer[][] matrix=new Integer[9][9];
        int big=0;
        int x=0;
        int y=0;
        for(int i=0;i<9;i++){
            sentence=br.readLine().split(" ");
            for(int j=0;j<9;j++){
                matrix[i][j]=Integer.parseInt(sentence[j]);
                if(matrix[i][j]>big){
                    big=matrix[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        bw.write(big+"\n"+(x+1)+" "+(y+1));
        bw.flush();
        bw.close();
        br.close();
    }
}