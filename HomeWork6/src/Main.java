public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Lexi",8);
        Dog dog = new Dog("Darek", 4);
        Rat rat = new Rat("Nona", 3);

        cat.makeNoise();
        dog.makeNoise();
        rat.makeNoise();

        Instrument [] instrument = new Instrument[3];
        instrument[0] = new  Guiter(7);
        instrument[1] = new Drum(56);
        instrument[2] = new Tuba(450);

        for (Instrument i : instrument){
            i.play();
        }
    }
}