import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class CoinManager {
    private List<Coin> coins;
    public CoinManager(){
        this.coins = new ArrayList<>();
    }
    public void addCoin(Coin coin){
        coins.add(coin);
    }
    public List<Coin> getAllCoins(){
        return new ArrayList<>(coins);
    }
    public Coin getNameCoin(String name){
        for(Coin coin : coins){
            if(coin.getName().equals(name)){
                return coin;
            }
        }
        return null;
    }
    public Coin getTickerCoin(String ticker){
        for(Coin coin:coins){
            if(coin.getTicker().equals(ticker)){
                return coin;
            }
        }
        return null;
    }
    public void updateNameCoin(String name){
        Scanner scanner = new Scanner(System.in);
        String updateName;
        for(Coin coin:coins){
            if(coin.getName().equals(name)){
                System.out.println("enter new name : ");
                updateName=scanner.nextLine();
                coin.setName(updateName);
            }
        }
        scanner.close();
    }
    public void updateTickerCoin(String ticker){
        Scanner scanner = new Scanner(System.in);
        String updateTicker;
        for(Coin coin:coins){
            if(coin.getTicker().equals(ticker)){
                System.out.println("enter new ticker : ");
                updateTicker=scanner.nextLine();
                coin.setTicker(updateTicker);
                }
            }
        scanner.close();
    }
    public void updateNetworkCoin(String network){
        Scanner scanner = new Scanner(System.in);
        String newNetwork;
        for(Coin coin : coins){
            if(coin.getNetwork().equals(network)){
                System.out.println("enter new network : ");
                newNetwork=scanner.nextLine();
                coin.setNetwork(newNetwork);
            }
        }
        scanner.close();
    }
    public void deleteCoin(Coin coin){
        String name=coin.getName();
        if(coins.remove(coin)==true){
            System.out.println(name+" is deleted.");
        }else{
            System.out.println(name+" is not in list.");
        }
    }
}
