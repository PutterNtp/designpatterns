package L09.Tour;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingleTour singleTour1 = new SingleTour("Pattaya",3400,20);
        SingleTour singleTour2 = new SingleTour("Chonburi", 3000,20);
        List<Tour> thaitour = new ArrayList<Tour>();
        thaitour.add(singleTour1);
        thaitour.add(singleTour2);
        Tour tour = new PackageTour("Thailand Tour",thaitour);
        singleTour1.setAllSeats(30);
        System.out.println(singleTour1.toString());
        System.out.println(tour.toString());


    }
}
