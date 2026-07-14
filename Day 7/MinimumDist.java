import java.io.*;

public class MinimumDist {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a and b: ");
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        double c = Math.sqrt(a * a + b * b);

        System.out.println("Minimum distance = " + c);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)

Output:
Enter a and b: 3 4
Minimum distance = 5.0
*/