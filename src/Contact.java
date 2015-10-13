/**
 * Created by MattBrown on 10/7/15.
 */
public class Contact {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact() {
        this.name = "Matt Brown";
        this.address = "Lame";
    }

    public Contact(String name, String address, String email, int age) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

//SOGOOD