import java.util.Scanner;
public class SumOfCommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int sum = getSumOfCommonElements(array1, array2);
        System.out.println("Sum of common elements: " + sum);
        scanner.close();
    }
    private static int getSumOfCommonElements(int[] array1, int[] array2) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    sum += array1[i];
                    break; 
                }
            }
        }
        return sum;
    }
}

/*
Time Complexity: O(n*m) where n and m are the lengths of the two arrays.
Space Complexity: O(1)

Output: 
Enter the size of the first array: 5
Enter elements of the first array:
1 2 3 4 5
Enter the size of the second array: 5
Enter elements of the second array:
2 3 4 1 9
Sum of common elements: 10

*/