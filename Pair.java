public class Pair{
    public static void main(String args[]){
        int[] numbers = {1,2,3,3,4,5,6}; 
        int specnum=6;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==specnum)
                System.out.println(numbers[i]+" & "+numbers[j]);
            }
        }

    }
}