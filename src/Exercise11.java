import java.util.Scanner;

/**
 * Created by MattBrown on 11/11/15.
 */
public class Exercise11 {
    public static void main(String[] args) {
        //Takes a string and gives true or false if it is reversed
        String word = "";
        String reversed = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        word = scanner.nextLine();
        int length = word.length();
        for (int i = length; i > 0; i--){
            reversed += word.charAt(i-1);
        }
        if (removeSpace(word).compareTo(removeSpace(reversed))== 0;{
            System.out.println("The String" + word + "is a palindrome");
        }else{
            System.out.println("The String" + word + "is not a palindrome");
        }

    }
    public static String removeSpace(String aword){
        String buffer = "";
        for(int i = 0; i < aword.length(); i++){
            if(!(String.valueOf(aword.charAt(i).compareTo(" ")== 0)));
        };
        return buffer;
    }
}
