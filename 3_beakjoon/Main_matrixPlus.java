import java.io.*;
public class Main_matrixPlus{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nAndM = br.readLine().split(" ");
        int n = Integer.parseInt(nAndM[0]);
        int m = Integer.parseInt(nAndM[1]);
        Integer[][] Matrix = new Integer[n][m];
        String[] input = new String[n];
        for(int k=0;k<2;k++){
            for(int i=0;i<n;i++){
                if(k==0){
                    input=br.readLine().split(" ");
                    for(int j=0;j<m;j++){
                        Matrix[i][j]=Integer.parseInt(input[j]);
                    }
                }else{
                    input=br.readLine().split(" ");
                    for(int j=0;j<m;j++){
                        Matrix[i][j]=Matrix[i][j]+Integer.parseInt(input[j]);
                        bw.write(Matrix[i][j]+" ");
                    }
                    bw.write("\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}