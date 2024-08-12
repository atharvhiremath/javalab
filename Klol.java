public abstract class Klol {
    public String fname="atharv";
    public int age=19;
    public abstract void study();
}
class Student extends Klol{
    public int grady=2027;
    public void study(){
        System.out.println("Studying all night long");
    }
}
