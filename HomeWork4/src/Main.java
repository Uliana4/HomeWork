import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        Reader[] readerArray = new Reader[10];

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
                    boolean isFull = true;
                    for (int i = 0; i < readerArray.length; i++) {
                        if (readerArray[i] == null) {
                            System.out.println("Введите фамилию читателя:");
                            String surname = scanner.nextLine();
                            System.out.println("Введите имя читателя:");
                            String name = scanner.nextLine();
                            System.out.println("Введите номер читательского билета:");
                            int number = scanner.nextInt();
                            scanner.nextLine();

                            boolean isExist = true;
                            for (int j = 0; j < readerArray.length; j++) {
                                if (readerArray[j] != null && readerArray[j].getBilet() == number) {
                                    isExist = true;
                                    break;
                                }
                            }

                            if (!isExist) {
                                readerArray[i] = new Reader(surname, name, number);
                                if (readerArray[i].getBilet() == 0) {
                                    readerArray[i] = null;
                                }
                            } else {
                                System.out.println("Читатель с номером читательского билета " + number + " уже существует");
                            }
                            break;
                        }
                    }

                    if (isFull) {
                        System.out.println("Количество читателей максимальное");
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
                    for (int i = 0; i < readerArray.length; i++) {
                        if (readerArray[i] != null && readerArray[i].getBilet() == readerNumber) {
                            Reader.takeBook(readerArray[i], book);
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
                    for (int i = 0; i < readerArray.length; i++) {
                        if (readerArray[i] != null && readerArray[i].getBilet() == readerNumber) {
                            readerArray[i].returnBook(title);
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
                    for (int i = 0; i < readerArray.length; i++) {
                        if (readerArray[i] != null && readerArray[i].getBilet() == readerNumber) {
                            readerArray[i].PrintStatus();
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
                    for (int i = 0; i < readerArray.length; i++) {
                        if (readerArray[i] == null) {
                            break;
                        } else {
                            Reader.PrintStatus(readerArray[i]);
                            isExists = true;
                        }
                    }
                    if (!isExists) {
                        System.out.println("Отсутствуют читатели");
                    }
                    break;
                }
                case 6: {
                    System.out.println("Завершение работы");
                    break;
                }
                default: {
                    System.out.println("Нет такой команды");
                }
            }
        } while (action != 6);
    }
}