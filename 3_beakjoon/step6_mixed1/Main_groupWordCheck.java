import java.io.*;
public class Main_groupWordCheck{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int wordNumber = Integer.parseInt(br.readLine());
        String word="";
        char beforeChar;
        int beforeCharIndex;
        int answer=wordNumber;
        int jumper=0;

        for(int i=0;i<wordNumber;i++){
            word=br.readLine();//azbz
            for(int j=0;j<word.length();j++){
                beforeChar=word.charAt(j);//z
                beforeCharIndex=j;//1
                for(int k=j+1;k<word.length();k++){
//                    bw.write((j+1)+"번 보는 중. 여기 들어왔냐?? \n");
//                    bw.flush();
                    if(word.charAt(k)==beforeChar){
                        if(k-beforeCharIndex==1){
//                            bw.write(k-beforeCharIndex+" ");
//                            bw.flush();
                            beforeCharIndex=k;
                        }else{
//                            bw.write(k-beforeCharIndex+" ");
//                            bw.flush();
                            answer=answer-1;
//                            bw.write("어어 같은거 나왔다 1 뺀다 "+answer+"\n");
//                            bw.flush();
                            jumper=1;
                            break;
                        }
                    }else{
//                        bw.write((j+1)+"번 철자 보는 중."+(k+1)+"번째 글자인데, "+word.charAt(k)+"임. 비교대상글자는 "+beforeChar+" 임. 다르니까 k에 1을 더함\n");
//                        bw.flush();
                    }
                }//이미 줄어든 경우에 체크가 안되네 히히 찾았당
                if(jumper==1){
                    jumper=0;
                    break;
                }
            }
        }
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }
}