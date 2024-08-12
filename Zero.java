class Zero{
    public static void main(String[]args){
        int[] num = {0,2,1,2,0,3,4,0,9,0,2,0};
        int temp;
        for(int i=0;i<num.length;i++){
            if(num[i]==0){
                for(int j=i;j<num.length-1;j++){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}