import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by MattBrown on 10/14/15.
 */
public class ContactSaver {//saving a file and an exmaple of how to "write"
    public static void main(String[] args) throws IOException {
        File f = new File("contact.txt");

        Contact bob = new Contact();
        bob.name = "Bob";
        bob.address = "12312 ok";
        bob.email = "liitleriver1337@gmail.com ";
        bob.age = 35;

        JsonSerializer serializer = new JsonSerializer();
        String contentToSave = serializer.serialize(bob);

        FileWriter fw = new FileWriter(f);
        fw.write(contentToSave);
        fw.close();

        FileReader fr = new FileReader(f);
        int fileSize = (int) f.length();//(int) is casting f.length to an int
        char[] contents = new char[fileSize];
        fr.read(contents);
        String fileContents = new String(contents);

        JsonParser parser = new JsonParser();
        Contact newBob = parser.parse(fileContents, Contact.class);
        System.out.println(newBob.name);
    }
}
//Standard format for storing information that is typically stored in memory to the disk and that is JSON.
//Uses {to start, fields are referred to as
// "name": "Bob",
// "address": "1312312 okstreet",
// "age": 35}
//adding