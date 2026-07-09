import java.util.Scanner;
public class Frequency{
    public static void main(String a[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter target element:");
        int target=in.nextInt();
        int result= getFrequency(arr,target);
        System.out.println("The frequency of the target element is:"+result);
        in.close();
    }
    private static int getFrequency(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}