package oops_practice.gcrcodebase.oops_fundamental.class_and_object.level_2;

public class MovieTicketBooking {

    String movieName;
    String seatNumber;
    double price;

    MovieTicketBooking(String movieName) {
        this.movieName = movieName;
    }

    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket Booked Successfully!");
    }

    void displayDetails() {
        System.out.println("Movie Ticket Details");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        MovieTicketBooking ticket = new MovieTicketBooking("Avengers: Endgame");

        ticket.bookTicket("A12", 350);

        ticket.displayDetails();
    }
}