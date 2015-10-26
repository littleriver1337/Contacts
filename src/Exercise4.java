import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by MattBrown on 10/26/15.
 */
public class Exercise4 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        HashMap<String, Integer> frequencies = new HashMap();
        String[] words = sentence.split(" ");
        //Scanner scanner = new Scanner(System.in);

        for(String word : words){
            String cleanedWord = word.toLowerCase().replace(",", "").replace(".", "");
            if (frequencies.get(cleanedWord) == null){
                frequencies.put(cleanedWord, 1);
            }else{
                int count = frequencies.get(cleanedWord);
                frequencies.put(cleanedWord, count + 1);
            }
        }

        //System.out.println("How many times is 'to' used in the sentence?");
       // String listen = scanner.nextLine();

       // System.out.println("How many times is 'be' used in the sentence?");
       // String listen1 = scanner.nextLine();


       // System.out.println("How many times is 'or' used in the sentence?");
        //String listen2 = scanner.nextLine();

       // System.out.println("How many times is 'not' used in the sentence?");
        //String listen3 = scanner.nextLine();


        //System.out.println("How many times is 'that' used in the sentence?");
        //String listen4 = scanner.nextLine();


        //System.out.println("How many times is 'is' used in the sentence?");
        //String listen5 = scanner.nextLine();

       // System.out.println("How many times is 'the' used in the sentence?");
        //String listen6 = scanner.nextLine();


        //System.out.println("How many times is 'question' used in the sentence?");
        //String listen7 = scanner.nextLine();

    }
}
