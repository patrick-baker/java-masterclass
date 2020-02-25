import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contactList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already on file.");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        if (queryContact(newContact.getName()) != null) {
            System.out.println("That contact already exists in the contact list.");
            return false;
        }
        this.contactList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        return true;
    }

    private int findContact (Contact contact) {
        return this.contactList.indexOf(contact);
    }

    private int findContact (String contactName) {
        for (int i=0; i<this.contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contactList.get(position);
        }
        return null;
    }

    public void printContactList() {
        System.out.println("You have " + contactList.size() + " contacts in your contact list.");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("(" + (i+1) + ") " + contactList.get(i).getName() + " => " + contactList.get(i).getPhoneNumber());
        }
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.contactList.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }
}
