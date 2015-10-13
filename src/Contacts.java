import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by MattBrown on 10/13/15.
 */
public class Contacts {
    public static void man(String[] args){//run function
        Contact bob = new Contact("Bob", 30);
        Contact alice = new Contact("Alice", 24);
        Contact charlie = new Contact("Charlie", 29);

        ArrayList<Contact> contacts = new ArrayList();//creating a new array list
        contacts.add(bob);//adding bob contact to the array list
        contacts.add(alice);//adding alice contact to array list
        contacts.add(charlie);//add charlie contact to array list

        Contact contactToFind = null;//starts at 1
        for (Contact c : contacts){//c is newly created variable and left of : is temp variable or : = in as in c is a temporary value inside of contacts
            if (c.age < 30) {
                contactToFind = c;
                break;
            }
        }

        HashMap<String, Contact> contactMap = new HashMap();
        contactMap.put("Bob", bob);
        contactMap.put("Alice", alice);
        contactMap.put("Charlie", charlie);

        //contactToFind = contactMap.get("Alice");

        if (contactToFind == null) {
            System.out.println("Couldn't find contact!");
        } else {
            System.out.println("Found contact!");;
        }

    }
}
