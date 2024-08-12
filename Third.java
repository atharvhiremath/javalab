import java.util.Scanner;
public class Third{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num: ");
        int a=sc.nextInt();
        int[] arr;
        arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            
        }
    }
}