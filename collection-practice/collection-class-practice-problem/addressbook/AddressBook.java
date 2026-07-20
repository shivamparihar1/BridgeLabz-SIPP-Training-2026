package Collection_practice.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class AddressBook {

    static ArrayList<Contacts> contacts = new ArrayList<>();
    static HashMap<String,Contacts> contactMap = new HashMap<>();
    static HashSet<String> phoneNumber = new HashSet<>();

    public static void addContact(String name, String number, String email) {
        if (phoneNumber.contains(number)) {
            System.out.println(("USER ALREADY EXITS!!!!"));
            return;
        } else {
            Contacts user = new Contacts(name, number, email);
            contacts.add(user);
            contactMap.put(name, user);
            phoneNumber.add(number);
            System.out.println("CONTACT ADDED SUCCESSFULLY");
        }
    }
    public static void search(String name){
        Contacts c = contactMap.get(name);
        if(c!=null){
            System.out.println(c);
        }
        else{
            System.out.println("Contact with name "+ name + " not found");
        }
    }
    public static void delete(String name){
        Contacts c = contactMap.get(name);
        if(c!=null){
            contactMap.remove(name);
            contacts.remove(c);
            phoneNumber.remove(c.getPhoneNumber());
        }
    }
    public static void display(){
        Collections.sort(contacts);
        System.out.println("\n sorted contact list");
        for(Contacts contact:contacts){
            System.out.println(contact);

        }

    }

}
