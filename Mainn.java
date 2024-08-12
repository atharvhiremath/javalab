class Animal{
    public void animalSound(){
        System.out.println("the animal makes a sound");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: oink oink");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow bow");
    }
}
class Mainn{
    public static void main(String[]args){
        Animal mya=new Animal();
        Pig mypig=new Pig();
        Dog myDog=new Dog();
        mya.animalSound();
        mypig.animalSound();
        myDog.animalSound();
    }
}
