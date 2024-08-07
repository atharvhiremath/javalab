import java.util.StringTokenizer;
public class Simple{
    public static void main(String []args){
        StringTokenizer st=new StringTokenizer("my name is atharv"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        StringTokenizer s=new StringTokenizer("my name is atharv");
            //System.out.println("Next token is: "+s.nextToken(","));
            StringTokenizer ss=new StringTokenizer("my name is atharv i am ffrom mumbai i like vada pav"," ");
            while(ss.hasMoreElements()){
                System.out.println(ss.nextElement());
            }
            System.out.println("No of tokens: "+s.countTokens());
    }
}