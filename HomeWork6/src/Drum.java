public class Drum implements Instrument{

    public int size = 56;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет инструмент Drum, размером " + size );
    }
}