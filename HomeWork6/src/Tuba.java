public class Tuba implements Instrument{
    public int d = 450;

    Tuba(int d){
        this.d = d;
    }

    public void play(){
        System.out.println("Играет инструмент Tuba, диаметром " + d);
    }
}