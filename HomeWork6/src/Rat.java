public class Rat extends Animal{
    public Rat (String name, int age){
        super(name, age);
    }

    @Override
    public void makeNoise(){
        System.out.println("Ри");
    }
}
