package Collection_practice.gcrcodebase.Collections_framework.AddressBookApp;

public class Contact {

    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                ", Phone : " + phone +
                ", Email : " + email;
    }
}