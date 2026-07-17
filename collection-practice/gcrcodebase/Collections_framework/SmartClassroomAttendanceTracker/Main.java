package Collection_practice.gcrcodebase.Collections_framework.SmartClassroomAttendanceTracker;

public class Main {

    public static void main(String[] args) {

        AttendanceTracker tracker = new AttendanceTracker();

        tracker.markAttendance("Java", "Shivam");
        tracker.markAttendance("Java", "Aman");
        tracker.markAttendance("Java", "Shivam");   // Duplicate

        tracker.markAttendance("Python", "Rohit");
        tracker.markAttendance("Python", "Aman");

        System.out.println();

        tracker.displayAttendance();
    }
}