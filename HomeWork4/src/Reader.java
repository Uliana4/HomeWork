import java.util.Date;

public class Reader {
    private String surname;
    private String name;
    private String patronymic;
    private int bilet;
    private String faculty;
    Date birthDate = new Date();
    private int phone;
    private Book[] books = new Book[5];
    private int bCount;

    public Reader(String surname, String name, int bilet) {
        this.surname = surname;
        this.name = name;
        this.bilet = bilet;
        bCount = 0;
    }

    public Reader(String surname, String name, String patronymic, int bilet) {
        this (surname, name, bilet);
        this.patronymic = patronymic;
    }

    public Reader(String surname, String name, String patronymic, int bilet, String faculty, int phone, Date birthDate) {
        this (surname, name, patronymic, bilet);
        this.faculty = faculty;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public void PrintFullName() {
        if (this.patronymic == null || this.patronymic.isEmpty()) {
            System.out.print(this.surname + " " + this.name.substring(0, 1) + ".");
        } else {
            System.out.print(this.surname + " " + this.name.substring(0, 1) + ". " + this.patronymic.substring(0, 1) + ".");
        }
    }

    public static void PrintStatus(Reader reader) {
        reader.PrintFullName();
        System.out.print(" взял(а) " + reader.bCount + " книг(у/и): ");
        for (int i = 0; i < reader.books.length; i++) {
            if (reader.books[i] == null) {
                continue;
            } else {
                System.out.print(reader.books[i].getName() + ", ");
            }
        }
        System.out.println();
    }

    public void PrintStatus() {
        PrintStatus(this);
    }

    public static void takeBook(Reader reader, Book book) {
        if (book.getName().isEmpty()) {
            System.out.println("Не введено название книги");
        } else if (reader.bCount == 10) {
            System.out.println("Читатель не может взять больше книг");
        } else {
            for (int i = 0; i < reader.books.length; i++) {
                if (reader.books[i] == null) {
                    reader.books[i] = book;
                    reader.bCount++;
                    reader.PrintFullName();
                    System.out.println(" взял(а) книгу " + reader.books[i].getName());
                    break;
                }
            }
        }
    }

    public void takeBook(Book book) {
        takeBook(this, book);
    }

    public static void returnBook(Reader reader, String title) {
        boolean isExists = false;
        if (title.isEmpty()) {
            System.out.println("Не введено название книги");
        } else {
            for (int i = 0; i < reader.books.length; i++) {
                if (reader.books[i] != null && reader.books[i].getName().equals(title)) {
                    reader.books[i] = null;
                    reader.bCount--;
                    isExists = true;
                    reader.PrintFullName();
                    System.out.println(" вернул(а) книгу " + title);
                }
            }

            if (!isExists) {
                reader.PrintFullName();
                System.out.println(" не хранит книгу " + title);
            }
        }
    }

    public void returnBook(String title) {
        returnBook(this, title);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = "Имя не указано";
        } else {
            this.name = name;
        }
    }

    public int getBilet() {
        return bilet;
    }

    public void setTicketNumber(int bilet) {
        if (bilet <= 0) {
            System.out.println("Номер читательского билета введен неверно");
        } else {
            this.bilet = bilet;
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhoneNumber(int phone) {
        this.phone = phone;
    }
}