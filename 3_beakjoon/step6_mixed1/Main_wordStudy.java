import java.io.*;
public class Main_wordStudy{
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] alphabet=new Integer[26];
        for(int i=0;i<alphabet.length;i++){
            alphabet[i]=0;
        }

        String sentence=br.readLine();
        sentence=sentence.toLowerCase();
        int single=0;

        for(int i=0;i<sentence.length();i++){
            single=sentence.charAt(i)-97;
            alphabet[single]=alphabet[single]+1;
        }
        int biggest=0;
        int index=0;
        int both=0;

        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]>biggest){
                biggest=alphabet[i];
                index=i;
            }
        }
        for(int i=0;i<alphabet.length;i++){
            if(index!=i&&alphabet[i]==biggest){
                both=1;
            }
        }

        if(both==1){
            bw.write("?");
        }else{
            //bw.write(index+" ");
            bw.write(index+65);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}