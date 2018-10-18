package L09.State;

public class ExpendingState implements State {
    VendingMachine vendingMachine;

    public ExpendingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount){
        int currentAmount = vendingMachine.getAmount() + amount;
        if(currentAmount >= vendingMachine.getPrice())
        {
            if(currentAmount > vendingMachine.getPrice())
            {
                int change = currentAmount - vendingMachine.getPrice();
                System.out.println("Change : " + change);
            }
            System.out.println("Expending Success, Please get your ticket.");
            vendingMachine.setPrice(0);
            vendingMachine.setAmount(0);
            vendingMachine.setCurrentState(vendingMachine.getCompleteState());
        }
        else if(currentAmount < vendingMachine.getPrice())
        {
            int remain = vendingMachine.getPrice()-currentAmount;
            System.out.println("Need more " + remain);
        }
    }

    @Override
    public void chooseDestination(String station) {
        System.out.println("Invalid State");
    }

    @Override
    public void getTicket(){
        System.out.println("Invalid State");
    }
}
