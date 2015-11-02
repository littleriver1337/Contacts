import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by MattBrown on 11/2/15.
 */
public class Exercise8 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList();
        Scanner scanner = new Scanner(new File("people.csv"));
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            names.add(columns[1] + " " + columns[2]);

        }

        String searchTerm = "ali";
        ArrayList<String> results = new ArrayList();
        //fill up "results" with all the names that contain searchTerm (case-sensitive)
        for (String name : names){
            if(name.toLowerCase().contains(searchTerm.toLowerCase())){
                results.add(name);

            }
        }
        System.out.println(results);

        //use streams
        final String searchTerm2 = searchTerm;
        List<String> result2 =
                names
                .parallelStream()
                .filter((name) ->{
                    return name.toLowerCase().contains(searchTerm);
                })
                .collect(Collectors.toList());
        System.out.println(result2);
    }
}
