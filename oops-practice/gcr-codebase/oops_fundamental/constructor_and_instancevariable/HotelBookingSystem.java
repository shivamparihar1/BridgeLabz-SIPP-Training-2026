package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable;

public class HotelBookingSystem {

    String guestName;
    String roomType;
    int nights;

    HotelBookingSystem() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBookingSystem(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBookingSystem(HotelBookingSystem booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {

        HotelBookingSystem booking1 = new HotelBookingSystem();

        HotelBookingSystem booking2 = new HotelBookingSystem("Shivam", "Deluxe", 3);

        HotelBookingSystem booking3 = new HotelBookingSystem(booking2);

        System.out.println("Default Constructor");
        booking1.displayDetails();

        System.out.println();

        System.out.println("Parameterized Constructor");
        booking2.displayDetails();

        System.out.println();

        System.out.println("Copy Constructor");
        booking3.displayDetails();
    }
}