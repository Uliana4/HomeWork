public class Phone {
    int number;
    String model;
    double weight;

//    5
    public Phone(int number, String model, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

//    6
    public Phone(int number, String model) {
        this.model = model;
        this.number = number;
    }

//    7
    public Phone() {
    }

//    4
    public void receiveCall(String name) {
        System.out.print("Звонит: " + name);
    }

    public void getNumber(int number) {
        System.out.println(number);
    }

//    9
    public void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + ", номер телефона: " + number);
    }

//    10
    public void sendMessage(int... numbers) {
        System.out.println("Отправлено сообщение на номер: " + number);
    }
}
