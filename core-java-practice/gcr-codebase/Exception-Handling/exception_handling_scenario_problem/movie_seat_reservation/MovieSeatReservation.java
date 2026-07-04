package corejava.gcrcodebase.exception_handling.exception_handling_scenario_problem.movie_seat_reservation;

public class MovieSeatReservation {

    static int seats[] = {101, 102, 103, 104, 105};

    public static int getSeat(int index) {

        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }

    public static void main(String[] args) {

        int index = 8;

        int result = getSeat(index);

        if (result == -1) {
            System.out.println("Invalid seat selection!");
        } else {
            System.out.println("Seat booked successfully: " + result);
        }
    }
}