//안써본거보다는 낫겠지?
//inputstream, inputstreamreader, bufferedredaer가 있다.
//int로 받은 두개를 변환하던지, bufferedreader를 쓰자.
//buffered reader를 쓰려면 inputstream, inputstreamreader, bufferedreader 다 써야 한단다.
//그래서 편하게 있는게 scanner라고 함. 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputOutput {
    static public void main(String[] args) throws IOException{
        int i=0;
        String[] cheering={"준혁","자욱","한이"};

        InputStream in=System.in;
        InputStreamReader reader=new InputStreamReader(in);
        BufferedReader br=new BufferedReader(reader);

        String input=br.readLine();

        int hitterNumber;
        hitterNumber=in.read();
        in.skip(2);

        int hitting;
        hitting=reader.read();

        char convertHitterNumber=(char)hitterNumber;
        char convertHitting=(char)hitting;
        
        System.out.println(convertHitterNumber+"번 타자 "+convertHitting+" hitter "+"타자 "+input);
        while(true){
            if(cheering[i].equals(input)){
                break;
            }
            i++;
        }
        switch(i){
            case 0:System.out.println("위풍당당");
            break;
            case 1:System.out.println("안타안타");
            break;
            case 2:System.out.println("헤이헤이헤이");
            break;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("나는 부자가 될 건가요?");
        String name=scanner.nextLine();
        System.out.println(name);
        scanner.close();
    }
}
