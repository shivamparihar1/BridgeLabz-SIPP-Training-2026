package Collection_practice.gcrcodebase.Collections_framework.AddressBookApp;

public class Main {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        addressBook.addContact("Shivam", "9876543210", "shivam@gmail.com");
        addressBook.addContact("Aman", "9123456789", "aman@gmail.com");
        addressBook.addContact("Rohit", "9988776655", "rohit@gmail.com");

        // Duplicate phone number
        addressBook.addContact("Rahul", "9876543210", "rahul@gmail.com");

        System.out.println();

        addressBook.searchContact("Aman");

        System.out.println();

        addressBook.deleteContact("Rohit");

        System.out.println();

        addressBook.displayContacts();
    }
}