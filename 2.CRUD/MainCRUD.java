//메인 crud에서 사용자 입력을 받고,
//오퍼레이션 crud에서 사용자 입력에 맞는 동작을 수행하고,
//엑셀 crud에서 엑셀 관련한 동작을 수행함
//저장될 데이터의 형태는 Coin 클래스에서 정의되고,
//저장된 데이터를 관리하는 클래스는 CoinManager로 할 것임. 
//메인 curd는 사용자가 원하는 동작 입력과 정지만 구현함
//클래스 구분하고 불러오는 연습을 겸함

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainCRUD {
    public static void main(String[] args) throws IOException{
        ExcelCRUD excel = new ExcelCRUD();
        OperationCRUD operation = new OperationCRUD();
        CoinManager coinManager = new CoinManager();

        List<Coin> listForViews;

        //사용자 입력을 받을 때, 이걸 쓰던지
        InputStream in=System.in;
        InputStreamReader reader=new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //이걸 쓰던지 하자.
        Scanner scanner = new Scanner(System.in);

        //이번 연습에서는 둘 다 쓸거임. 왜요? 연습이니까요 음음

        int userWant=0;

        while(true){
            System.out.println("0. Quit");
            System.out.println("1. create data");
            System.out.println("2. read board");
            System.out.println("3. update data");
            System.out.println("4. delete data");
            System.out.println("5. save as excel file");
            System.out.println("6. load excel file");
            System.out.println("insert number: ");
            userWant=Integer.valueOf(bufferedReader.readLine());
            switch(userWant){
                case 0:
                    scanner.close();
                    break;
                case 1:
                    operation.create(coinManager);
                case 2:
                    operation.read(coinManager);
                case 3:
                    operation.update(coinManager);
                case 4:
                    operation.delete(coinManager);
                case 5:
                    excel.save(coinManager);
                case 6:
                    excel.read(coinManager);
            }

        }
    }
}
