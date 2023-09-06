import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        ArrayList<Reader> readerArray = new ArrayList<>();

        do {
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить нового читателя");
            System.out.println("2 - Читатель хочет взять книгу");
            System.out.println("3 - Читатель хочеть вернуть книгу");
            System.out.println("4 - Вывести статус читателя");
            System.out.println("5 - Вывести статусы всех читателей");
            System.out.println("6 - Выйти из программы");
            action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1: {
                    System.out.println("Введите фамилию читателя:");
                    String surname = scanner.nextLine();
                    System.out.println("Введите имя читателя:");
                    String name = scanner.nextLine();
                    System.out.println("Введите номер читательского билета:");
                    int number = scanner.nextInt();
                    scanner.nextLine();

                    boolean isExist = false;
                    for (Reader reader : readerArray) {
                        if (reader.getNumber() == number) {
                            isExist = true;
                            break;
                        }
                    }

                    if (!isExist) {
                        Reader reader = new Reader(surname, name, number);
                        readerArray.add(reader);
                        System.out.print("Читатель " + surname + name + " c номером билета " + number + " добавлен");
                    } else {
                        System.out.println("Читатель с номером читательского билета " + number + " уже существует");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Введите имя автора:");
                    String authorName = scanner.nextLine();
                    System.out.println("Введите название книги:");
                    String title = scanner.nextLine();
                    System.out.println("Введите номер читателя:");
                    int readerNumber = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(title, authorName);
                    boolean isExists = false;
                    for (Reader reader : readerArray) {
                        if (reader.getNumber() == readerNumber) {
                            Reader.takeBook(reader, book);
                            isExists = true;
                            break;
                        }
                    }

                    if (!isExists) {
                        System.out.println("Такого читателя не существует");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Введите название книги:");
                    String title = scanner.nextLine();
                    System.out.println("Введите номер читателя:");
                    int readerNumber = scanner.nextInt();
                    scanner.nextLine();

                    boolean isExists = false;
                    for (Reader reader : readerArray) {
                        if (reader.getNumber() == readerNumber) {
                            reader.returnBook(title);
                            isExists = true;
                        }
                    }

                    if (!isExists) {
                        System.out.println("Такого читателя не существует");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Введите номер читателя:");
                    int readerNumber = scanner.nextInt();
                    scanner.nextLine();

                    boolean isExists = false;
                    for (Reader reader : readerArray) {
                        if (reader.getNumber() == readerNumber) {
                            reader.PrintStatus();
                            isExists = true;
                            break;
                        }
                    }

                    if (!isExists) {
                        System.out.println("Такого читателя не существует");
                    }
                    break;
                }

                case 5: {
                    boolean isExists = false;
                    for (Reader reader : readerArray) {
                        Reader.PrintStatus(reader);
                        isExists = true;
                    }
                }

                case 6: {
                    System.out.println("Завершение работы");
                    break;
                }
                default: {
                    System.out.println("Нет такой команды");
                }
            }
        } while (action != 6) ;
    }
}