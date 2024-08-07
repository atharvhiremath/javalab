class Buff2{
    public static void main(String []args){
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append(" hi i am atharv!!");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}