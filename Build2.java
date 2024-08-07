class Build2{
    public static void main(String []args){
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        sb.append(" hi i am atharv!!");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}