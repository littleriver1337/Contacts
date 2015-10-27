import java.util.ArrayList;

/**
 * Created by MattBrown on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String s= "To be or not to be, that is the question.";
        //remove commas and periods
        //make it all lower case
        //split into words
        //remove duplicate words
        //create a new string without the duplicate words
        //to be or not that is the question
        System.out.println("To be or not to be, that is the question.");
        ArrayList<String> newWords = new ArrayList();
        String[] words = s.split(" ");
        s = s.replace(",", "").replace(".", "");

        for (String word: words){
            if (!newWords.contains(words)){
                newWords.add(word);
            }
        }
        String newStr = "";
        for(String newWord : newWords){
            if (!newStr.isEmpty en
                newStr += " ";
            }
            newStr += " " + newWord;
        }
        System.out.println(newStr);
    }
}
