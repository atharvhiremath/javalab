class Build{
        public static void main(String []args){
            StringBuilder sb=new StringBuilder("Hello ");
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