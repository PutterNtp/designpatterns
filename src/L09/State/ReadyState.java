package L09.State;

import java.util.Map;
import java.util.TreeMap;

public class ReadyState implements State {
    VendingMachine vendingMachine;
    Map<String, Integer> destinationMap = new TreeMap<>();

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        destinationMap.put("Siam", 30);
        destinationMap.put("Victory Monument", 35);
        destinationMap.put("Ari", 30);
        destinationMap.put("Thong Lo", 25);
    }

    @Override
    public void insertCoin(int amount){
        System.out.println("Invalid State");
    }

    @Override
    public void chooseDestination (String station) {
        int price = destinationMap.get(station);
        System.out.println("You're Selecting : " + station + " : " + price + "฿");
        vendingMachine.setCurrentState(vendingMachine.getExpendingState());
    }
    @Override
    public void getTicket (){
        System.out.println("Invalid State");;
    }
}
