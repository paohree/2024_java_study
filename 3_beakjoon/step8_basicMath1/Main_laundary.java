import java.io.*;
public class Main_laundary{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int howMany = Integer.parseInt(br.readLine());
        int change=0;
        int counter=0;
        for(int i=0;i<howMany;i++){
            change = Integer.parseInt(br.readLine());
            while(true){
                if(change<25){
                    bw.write(counter + " ");
                    counter=0;
                    while(true){
                        if(change<10){
                            bw.write(counter+" ");
                            counter=0;
                            while(true){
                                if(change<5){
                                    bw.write(counter+" ");
                                    counter=0;
                                    for(int j=change;j>0;j--){
                                        counter=counter+1;
                                    }
                                    bw.write(counter+"\n");
                                    counter=0;
                                    break;
                                }else{
                                    change=change-5;
                                    counter=counter+1;
                                }
                            }
                            break;
                        }else{
                            counter=counter+1;
                            change=change-10;
                        }
                    }
                    break;
                }else{
                    counter=counter+1;
                    change = change-25;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}