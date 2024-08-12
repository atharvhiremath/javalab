public class Odd{
    public static void main(String[] args){
        int[] numbers = {11, 15, 20, 25, 31, 35, 41, 45, 50, 55}; 

        for (int i = 0; i < numbers.length; i += 2) { 
            if (numbers[i] % 2 != 0) { 
                System.out.println(numbers[i]);
            }
        }
    }
}
