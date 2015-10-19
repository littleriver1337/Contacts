import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by MattBrown on 10/19/15.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        HashMap<String, ArrayList<Contact>> people = new HashMap();//postContent.split("/n");
        //String postContent = readFile("names.txt");

        for (String name : names) {//nested for loop!
            for (String name2 : names) {
                if (!name.equals(name2)) {
                    //String firstContact = name;
                    Contact c = new Contact(name2, 0);
                    ArrayList<Contact> list = people.get(name);
                    if (list == null){
                        list = new ArrayList();
                        list.add(c);
                        people.put(name, list);
                    } else {
                        list.add(c);
                    }
                }
                //String[] matches = line.split("//|");
                // String abbrev = columns[0];
                // String name = columns [1];
                // String firstLetter = name.substring(0,1);
                //names = new oklist(abbrev, name);
                // oklist = information
            }
        }
        double randNum = Math.random();//generating radom numbers
        int index = (int) (randNum * 4);
        System.out.println(names[index]);

        Random rand = new Random();//generating random numbers but a cleaner way of doing it
        index = rand.nextInt(4);
        System.out.println(names[index]);
    }
}