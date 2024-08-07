class Buff{
    public static void main(String []args){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");        
        sb.insert(6,"world ");
        sb.replace(1,3,"mell");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append(" hi i am atharv!!");
        System.out.println(sb.capacity());
    }
}