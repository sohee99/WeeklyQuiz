package WeeklyQuiz3;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void searchContacts(String name) {
        boolean findname = false;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                findname = true;
                System.out.println(contact);
                return;
            }
        }
        if (!findname) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
