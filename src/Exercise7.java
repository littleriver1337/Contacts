import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by MattBrown on 10/29/15.
 */
public class Exercise7 {
    public static void main(String[] args) {
        //String[] names = {"Alice", "Smith", "Bob", "Brown", "Charlie", "Jones"};
        List<String> list = Arrays.asList("Alice", "Smith", "Bob", "Brown", "Charlie", "Jones");
        Collections.reverse(list);
        System.out.println(list);

       // ArrayList<String> newNames2 = new ArrayList();
        //for(int i = names.length - 1; i >= 0; i--){
        //    newNames2.add(names[i]);
        //}
        //System.out.println(newNames2);
        //reverse the array output
        //convert array into a HashMap where the first two values are key value pairs
        //{"Jones":"Charlie", "Brown": "Bob", "Smith": "Alice"
       //
       // }
    }
}
