import java.util.Scanner;
public class SmallestNo {
    public static void main(String args[]){
       Scanner input=new Scanner(System.in);
       System.out.println("Enter length of array:");
       int len=input.nextInt();
       int arr[]=new int[len];
       for(int i=0;i<len;i++)
       {
         arr[i]=input.nextInt();
       }
       int r=getMinElement(arr,len);
        System.out.println("Smallest element in array is: "+r);
        input.close();
}
private static int getMinElement(int arr[],int len){
    int min=arr[0];
    for(int i:arr){
        if(i<min)
            min=i;
    }
    return min;
}

}


