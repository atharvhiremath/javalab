public class Constr{
    int x;
    String name;
    double pi;
    char lol;
    public Constr(int y,String g,double ip,char k){
        x=y;
        name=g;
        pi=ip;
        lol=k;
    }
    public static void main(String[]args){
        Constr myo=new Constr(5,"atharv",3.14,'a');
        System.out.println(myo.x);
        System.out.println(myo.name);
        System.out.println(myo.pi);
        System.out.println(myo.lol);
    }
}