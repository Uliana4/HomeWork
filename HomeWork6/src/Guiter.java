public class Guiter implements Instrument {
    public int s = 7;

    Guiter (int s){
        this.s = s;
    }

    public void play(){
        System.out.println("Играет инструмент Guitar, количество струн - " + s);
    };
}

