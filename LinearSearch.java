
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of your Array:- ");
        int n = sc.nextInt();
        int i;
        System.out.print("Enter the element of Array :- ");
        int arr[] = new int[n];
        
        for(i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        System.out.print("Sorted Array Elements are :- ");
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];  
                    arr[i] = temp;  
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the element do you want to search:- ");
        int target = sc.nextInt();
        sc.close();
        for(i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Element present in " + i + "th index.");
                break;
            }   
        }
        if(i==n)
        {
            System.out.println("Element is not present in Array.");
        }
    }
}