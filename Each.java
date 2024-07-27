public class Each{
public static void main(String[]args){
String[] cars={"BMW","Volvo","Volkswagon","Lamborghini"};
//for(String i:cars){
//System.out.println(i);
for(int i=0;i<10;i++){
if(i==4){
continue;
}
System.out.println(i);
}
}
}

