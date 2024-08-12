import java.util.Scanner;
public class Arm{
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        if (Arm.armstrong(a) && Arm.armstrong(b))
        System.out.println("both are armstrong");
        else if(Arm.armstrong(a))
        System.out.println(a+" is armstrong");
        else if(Arm.armstrong(b))
        System.out.println(b+" is armstrong");
        else
        System.out.println("both are not armstrong");

    }
    static boolean armstrong(int c){
        int temp=c;
        int nod=0;
        while(temp!=0){
            nod++;
            temp=temp/10;
        }
        temp=c;
        int arm=0;
        int digit;
        while(temp!=0){
            digit=temp%10;
            arm+=Math.pow(digit,nod);
            temp=temp/10;
        }
        if(arm==c)
        return true;
        else
        return false;
    }
}