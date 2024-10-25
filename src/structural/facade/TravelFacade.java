package structural.facade;

public class TravelFacade {

    private final FlightBooking flightBooking;
    private final HotelBooking hotelBooking;
    private final CabBooking cabBooking;

    public TravelFacade(){
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.cabBooking = new CabBooking();
    }

    public void bookHoliday(String from, String to, String hotelLocation, int nights) {
        System.out.println("\nBooking your holiday...");
        flightBooking.bookFlight(from, to);
        hotelBooking.bookHotel(hotelLocation, nights);
        cabBooking.bookCab(hotelLocation);
        System.out.println("Holiday booking completed!\n");
    }
}
