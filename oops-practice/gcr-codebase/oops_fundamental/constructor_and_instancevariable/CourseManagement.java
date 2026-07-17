package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable;
public class CourseManagement {

    String courseName;
    String duration;
    double fee;

    static String instituteName = "ABC Institute";

    CourseManagement(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }

    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {

        CourseManagement course1 = new CourseManagement("Java", "3 Months", 15000);

        CourseManagement course2 = new CourseManagement("Python", "2 Months", 12000);

        System.out.println("Before Updating Institute Name");

        course1.displayCourseDetails();

        System.out.println();

        course2.displayCourseDetails();

        System.out.println();

        CourseManagement.updateInstituteName("XYZ Institute");

        System.out.println("After Updating Institute Name");

        course1.displayCourseDetails();

        System.out.println();

        course2.displayCourseDetails();
    }
}