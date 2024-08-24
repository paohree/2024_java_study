import java.util.List;
import java.util.ArrayList;
public class Coin {//코인 클래스 하나 단독인거임
    private String name;
    private String ticker;
    private String network;
    private String pair;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name=newName;
    }

    public String getTicker(){
        return ticker;
    }
    public void setTicker(String newTicker){
        this.ticker=newTicker;
    }

    public String getNetwork(){
        return network;
    }
    public void setNetwork(String newNetwork){
        this.network=newNetwork;
    }

    public String getPair(){ return pair;}
    public void setPair(String newPair){this.pair=newPair;}
}
