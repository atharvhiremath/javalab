import java.util.Scanner;
public class Pat{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter a num: ");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=2*a;j++){
                if(i==1||i==a)
                System.out.print("*");
                else if(j==1 || j==2*a)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}