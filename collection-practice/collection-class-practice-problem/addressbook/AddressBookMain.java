package Collection_practice.addressbook;
import java.util.*;

public class AddressBookMain {
    public void choices() {
        System.out.println("-----------------------------------------------------");
        System.out.println("WELCOME TO THE ADDRESSBOOK MAIN MENU");
        AddressBook addressbook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add New Contact\n2.Search Contact\n3.Delete a Contact\n4.Display Sorted Contacts\n5.Exit");

            int choice = sc.nextInt();
            if(choice == 5){
                break;
            }


            switch (choice) {
                case 1:
                    System.out.println("enter Contact Name");
                    String name = sc.next();
                    System.out.println("Enter Yout digit Phone Number");
                    String phoneNumber = sc.next();
                    System.out.println("Enter you Email Address:");
                    String emailAddress = sc.next();
                    AddressBook.addContact(name, phoneNumber, emailAddress);
                    break;

                case 2:
                    System.out.println("Enter contact name:");
                    name = sc.next();
                    AddressBook.search(name);
                    break;

                case 3:
                    System.out.println("Enter contact name");
                    name = sc.next();
                    AddressBook.delete(name);
                    break;
                case 4:
                    System.out.println(" Again Enter 4 if one time is not working");
                   name = sc.next();
                    AddressBook.display();
                    break;

                default:
                    System.out.println("invalid contact");
                    System.out.println("-----------------------------------------------------");
            }

        }
    }

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.choices();
    }
}
