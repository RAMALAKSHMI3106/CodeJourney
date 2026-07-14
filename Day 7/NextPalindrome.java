import java.io.*;
public class NextPalindrome {
    static boolean isPalindrome(int n) {
        int temp = n, rev = 0;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        return rev == n;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());

        n++;

        while (!isPalindrome(n)) {
            n++;
        }

        System.out.println("Next Palindrome = " + n);
    }
}
/*
Output:
Enter a number: 606
Next Palindrome = 616
 */