/**
 * Created by MattBrown on 10/7/15.
 */
public class Contact implements Comparable {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact(){

    }

    public Contact(String name, int age){//Great way to reference your public Class Contact
        this.name = name;
        this.age = age;//Reference Contact c = new Contact information
    }
    //Contact c = new Contact("Bob", "405 Jefferson Street", "littleriver1337@gmail.com", 30);//Ez peeze lemon squezzy
    //Contact c = new Contact();//this is the old annoying way to do things to set values through jrepl
    //c.name = "Bob";
    //c.address = "510 mill street";
    //c.email = "littleriver1337@gmail.com"
    //c.age = 30;
    //public Contact() {
        //this.name = "Matt Brown";
       // this.address = "Lame";

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        Contact c = (Contact) o;
        int result = name.compareTo(c.name);
        if (result == 0){
            return age - c.age;
        }else {
            return result;
        }
    }
}

    //public Contact(String name, String address, String email, int age) {
        //this.name = name;
        //this.address = address;
        //this.email = email;
        //this.age = age;
   // }

    //public String getName() {
       // return name;
    //}

    //public void setName(String name) {
       // this.name = name;
   //}

//}

//SOGOODithurts