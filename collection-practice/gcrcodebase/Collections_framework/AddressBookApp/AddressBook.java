package Collection_practice.gcrcodebase.Collections_framework.AddressBookApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> contactMap = new HashMap<>();
    HashSet<String> phoneNumbers = new HashSet<>();

    public void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate phone number. Contact not added.");
            return;
        }

        Contact contact = new Contact(name, phone, email);

        contacts.add(contact);
        contactMap.put(name, contact);
        phoneNumbers.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    public void searchContact(String name) {

        if (contactMap.containsKey(name)) {
            System.out.println(contactMap.get(name));
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public void deleteContact(String name) {

        if (!contactMap.containsKey(name)) {
            System.out.println("Contact Not Found.");
            return;
        }

        Contact contact = contactMap.get(name);

        contacts.remove(contact);
        phoneNumbers.remove(contact.phone);
        contactMap.remove(name);

        System.out.println("Contact Deleted Successfully.");
    }

    public void displayContacts() {

        Collections.sort(contacts, Comparator.comparing(c -> c.name));

        System.out.println("Contacts Sorted By Name:");

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}