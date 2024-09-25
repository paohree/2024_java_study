import java.io.*;
public class Main_vertical{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentence;
        char[][] divided=new char[5][15];

        for(int i=0;i<5;i++){
            for(int j=0;j<15;j++){
                divided[i][j]='/';
//                bw.write(divided[i][j]+"");
            }
//            bw.write("\n");
        }
//        bw.write("\n");
//        bw.flush();

        for(int i=0;i<5;i++){
            sentence = br.readLine().replaceAll(" ","");
            for (int j = 0;j<sentence.length();j++){
                divided[i][j]=sentence.charAt(j);
                //bw.write(divided[i][j]+"");
            }
//            for (int k = sentence.length();k<15;k++){
//                divided[i][k]='/';
//                bw.write(divided[i][k]+"");
//            }
//            bw.write("\n");
        }
//        bw.write("\n");
//        bw.flush();

//        for(int i=0;i<5;i++){
//            for(int j = 0;j<15;j++){
//                bw.write(divided[i][j]+"");
//            }
//            bw.write("\n");
//        }
//        bw.flush();

        for (int j=0;j<15;j++){
            for(int i=0;i<5;i++){
                if(divided[i][j]!='/'){
                    bw.write(divided[i][j]);
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}