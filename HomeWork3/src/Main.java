public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.number = 1434131349;
        phone1.model = "Samsung M31";
        phone1.weight = 191.0;
        System.out.println("Модель телефона: " + phone1.model + "; Номер телефона: " + phone1.number + "; Вес: " + phone1.weight);

        phone1.receiveCall("Alice");
        phone1.getNumber(phone1.number);


        Phone phone2 = new Phone();
        phone2.number = 483948920;
        phone2.model = "Iphone 14 Pro";
        phone2.weight = 206.0;
        System.out.println("Модель телефона: " + phone2.model + "; Номер телефона: "+ phone2.number + "; Вес: " + phone2.weight);

        phone2.receiveCall("Kristoph");
        phone2.getNumber(phone2.number);


        Phone phone3 = new Phone();
        phone3.number = 939929392;
        phone3.model = "Xiaomi Redmi 9";
        phone3.weight = 198.0;
        System.out.println("Модель телефона: " + phone3.model + "Номер телефона: "+ phone3.number + "Вес: " + phone3.weight);

        phone3.receiveCall("Aiden");
        phone3.getNumber(phone3.number);


        phone1.receiveCall("Alice", phone1.number);
        phone2.receiveCall("Kristoph", phone2.number);
        phone3.receiveCall("Aiden", phone3.number);


        phone1.sendMessage(phone1.number);
        phone2.sendMessage(phone2.number);
        phone3.sendMessage(phone3.number);
    }
}