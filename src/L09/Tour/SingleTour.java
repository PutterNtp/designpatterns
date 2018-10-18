package L09.Tour;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
        reservedSeats = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAllSeats(int allSeats) {
        this.allSeats = allSeats;
    }

    public void setReservedSteats(int reservedSteats) {
        this.reservedSeats = reservedSteats;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getAvailableSeats() {
        if(allSeats - reservedSeats <0 )
        {
            return 0;
        }
        return allSeats-reservedSeats;
    }

    @Override
    public String toString() {
        return "SingleTour{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", allSeats=" + allSeats +
                ", reservedSeats=" + reservedSeats +
                '}';
    }
}
