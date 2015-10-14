import java.util.ArrayList;

/**
 * Created by MattBrown on 10/14/15.
 */
public class Exercise {//arrays
    public static void main(String[] args) {
        Contact alice = new Contact();//creating a new contact
        alice.name = "Alice";//information
        alice.age = 25;//information

        Contact bob = new Contact();
        bob.name = "Bob";
        bob.age = 25;

        ArrayList<Contact>contacts = new ArrayList();
        contacts.add(alice);
        contacts.add(bob);

        //String[] names = {"Alice", "Bob", "Charlie", "Austin"};

        for (Contact contact : contacts){//"for" loop with Arrays
            if (contact.name.startsWith("A")){//finds names within "contact" that starts with A
                System.out.println(contact.name);//prints out the name of contact object
            }
        }
        //String[] newArray; //otherway to write an array
        ///newArray = new String[10];
        //newArray [0] = "Bob";
        //newArray [1] = "Cindy";
        //newArray [2] = "Andy";
        //newArray [3] = "Alfred";
        //newArray [4] = "Adam";
        //newArray [5] = "James";
        //newArray [6] = "Ashley";
        //newArray [7] = "Bert";
        //newArray [8] = "Life";
        //newArray [9] = "Sword";
    }
}
