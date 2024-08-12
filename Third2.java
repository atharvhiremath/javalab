
import java.util.Scanner;
public class Third2{
public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr =new int[n];
        System.out.println("Enter numbers: ");
        for(int j=0;j<n;j++)
        arr[j]=sc.nextInt();
        int temp;
        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                        if(arr[j-1] < arr[j]){    
                                temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                        }  
                                   
                }  
        } 
        System.out.println("the third largest element in array is: "+arr[2]);
  
}  
}