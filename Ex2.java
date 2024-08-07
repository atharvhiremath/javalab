class Student{
    public int roll_no;
    public String name;
    Student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
}
public class Ex2{
    public static void main(String[]args){
        Student[] arr;
        arr=new Student[5];
        arr[0]=new Student(1460,"Atharv");
        arr[1]=new Student(1461,"Athar");
        arr[2]=new Student(1462,"Atha");
        arr[3]=new Student(1463,"Ath");
        arr[4]=new Student(1464,"At");

        for(int i=0;i<arr.length;i++)
        System.out.println("elementn at "+i+": "+arr[i].roll_no+" "+arr[i].name);
    }
}