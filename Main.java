public class Main{
    int x=5;
    String fname="Atharv";
    String lname="Hiremath";
    int age=19;
    static void mym(){
        System.out.println("hello earth");
    }
    public void mypm(){
        System.out.println("hello public");
    }
    public void para(int max){
        System.out.println("max speed is: "+max);
    }
    public static void main(String[]args){
        Main myobj=new Main();
        Main myobj2=new Main();
        Main2 myobb=new Main2();
        System.out.println(myobj.x);
        myobj2.x=69;
        System.out.println(myobj2.x);
        System.out.println(myobb.x);
        //System.out.println("name: "+myobj.fname+" "+myobj.lname);
        //System.out.println("Age: "+myobj.age);
        mym();
        myobj.mypm();
        myobj.para(469);
    }
}