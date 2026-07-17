package Collection_practice.gcrcodebase.Collections_framework.SmartClassroomAttendanceTracker;

import java.util.ArrayList;
import java.util.HashMap;

public class AttendanceTracker {

    HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    // Mark Attendance
    public void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {
            System.out.println(student + " is Already Marked Present in " + subject);
        } else {
            students.add(student);
            System.out.println(student + " Marked Present in " + subject);
        }
    }

    // Display Attendance
    public void displayAttendance() {

        System.out.println("Attendance Record:");

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject : " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students Present : " + students.size());
        }
    }
}