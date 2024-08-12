class Vehicle{
    protected String brand="BMW";
    public void honk(){
        System.out.println("vroom,vroom!");
    }
}
class Car extends Vehicle{
    private String modelname="M4";
    public static void main(String args[]){
        Car mycar=new Car();
        mycar.honk();
        System.out.println(mycar.brand+" "+mycar.modelname);
    }
    
}