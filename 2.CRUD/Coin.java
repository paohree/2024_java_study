import java.util.List;
import java.util.ArrayList;
public class Coin {
    private String name;
    private String ticker;
    private String network;
    private List<String> pair=new ArrayList<>();

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
    
    public List<String> getPair(){
        return pair;
    }
    public void addPair(String newPair){
        pair.add(newPair);
    }
    public void deletePair(String newPair){
        pair.remove(newPair);
    }
}
