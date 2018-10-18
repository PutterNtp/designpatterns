package L09.State;

public class VendingMachine {
    private int amount;
    private int price;
    private State readyState = new ReadyState(this);
    private State expendingState = new ExpendingState(this);
    private State completeState = new CompleteState(this);
    private State currentState = readyState;

    public VendingMachine(int amount, int price) {
        this.amount = 0;
        this.price = 0;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void setCurrentState(State currentState)
    {
        this.currentState = currentState;
    }

    public State getExpendingState() {
        return expendingState;
    }

    public State getReadyState() {
        return readyState;
    }

    public State getCompleteState() {
        return completeState;
    }
}
