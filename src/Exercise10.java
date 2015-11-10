import java.util.Scanner;

/**
 * Created by MattBrown on 11/10/15.
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This is the number that you want reversed:");
        int input = s.nextInt();
        int result = reverse(input);
        System.out.println("The reversed number is: " + result);
        //int numReversed = 54321
    }

    private static int reverse(int n) {
        int result = 0;
        int rem;
        while (n > 0){
            rem = n % 10;
            n = n / 10;
            result = result * 10 + rem;
        }
        return result;
    }
}
