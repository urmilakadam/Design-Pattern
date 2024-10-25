package structural.facade;

public class FacadeMain {

    public static void main(String[] args) {

        TravelFacade travelFacade = new TravelFacade();

        travelFacade.bookHoliday("Mumbai", "Goa", "Goa", 5);
        travelFacade.bookHoliday("New York", "Paris", "Paris", 7);
    }
}
