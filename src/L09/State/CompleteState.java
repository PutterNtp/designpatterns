package L09.State;

public class CompleteState implements State {
    VendingMachine vendingMachine;

    public CompleteState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount){
        System.out.println("Invalid State");
    }

    @Override
    public void chooseDestination(String station){
        System.out.println("Invalid State");
    }

    @Override
    public void getTicket() {
        System.out.println("Pick your ticket");
        vendingMachine.setCurrentState(vendingMachine.getReadyState());
    }
}
