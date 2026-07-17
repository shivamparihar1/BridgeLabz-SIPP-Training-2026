package oops_practice.gcrcodebase.polymorphism.smartlibrary;

public class Main {

    public static void main(String[] args) {

        LibraryMember[] members = new LibraryMember[3];

        members[0] = new StudentMember("Shivam", "S101");

        members[1] = new FacultyMember("Dr. Rahul", "F102");

        members[2] = new GuestMember("Amit", "G103");


        System.out.println("Library Members");
        System.out.println("----------------");

        for (LibraryMember member : members) {
            member.printMemberDetails();
            System.out.println();
        }


        String searchId = "F102";

        System.out.println("Searching Member");

        for (LibraryMember member : members) {

            if (member.memberId.equals(searchId)) {
                System.out.println("Member Found");
                member.printMemberDetails();
                break;
            }
        }
    }
}