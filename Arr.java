public class Arr{
    public static void main(String args[]){
        int[] arr;
        arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=10;
        arr[3]=20;
        arr[4]=10;
    
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index "+i+": "+arr[i]);
        }
        
    }
}