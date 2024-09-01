import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main_yourGPA{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String oneLine;
        String[] divided;
        double gpa=0.00000000000;
        double point=0;
        double pCounter=0;
        for(int i=0;i<20;i++){
            oneLine = br.readLine();
            divided=oneLine.split(" ");
//            bw.write(gpa+" "+ divided[1]+" "+divided[2]+"\n");
//            bw.flush();
            if(divided[2].equals("A+")){
                gpa=gpa+Double.parseDouble(divided[1])*4.5;
                point=point+Double.parseDouble(divided[1]);
            }else if(divided[2].equals("A0")){
                gpa=gpa+Double.parseDouble(divided[1])*4.0;
                point=point+Double.parseDouble(divided[1]);
            }else if(divided[2].equals("B+")){
                gpa=gpa+Double.parseDouble(divided[1])*3.5;
                point=point+Double.parseDouble(divided[1]);
            }else if(divided[2].equals("B0")){
                gpa=gpa+Double.parseDouble(divided[1])*3.0;
                point=point+Double.parseDouble(divided[1]);
            }else if(divided[2].equals("C+")){
                gpa=gpa+Double.parseDouble(divided[1])*2.5;
                point=point+Double.parseDouble(divided[1]);
            }else if(divided[2].equals("C0")){
                gpa=gpa+Double.parseDouble(divided[1])*2.0;
                point=point+Double.parseDouble(divided[1]);
            }else if(divided[2].equals("D+")){
                gpa=gpa+Double.parseDouble(divided[1])*1.5;
                point=point+Double.parseDouble(divided[1]);
            }else if(divided[2].equals("D0")){
                gpa=gpa+Double.parseDouble(divided[1])*1.0;
                point=point+Double.parseDouble(divided[1]);
            }else if(divided[2].equals("F")){
                gpa=gpa+Double.parseDouble(divided[1])*0.0;
                point=point+Double.parseDouble(divided[1]);
            }else{
               continue;
            }

        }
        gpa=gpa/point;
        bw.write(gpa+"");
        bw.flush();
        bw.close();
        br.close();
    }
}