import java.util.ArrayList;
import java.util.Date;

    public class Reader {
        private String surname;
        private String name;
        private String patronymic;
        private int number;
        private String faculty;
        Date birthDate = new Date();
        private int phone;
        private ArrayList<Book> books = new ArrayList<>();

        public Reader(String surname, String name, int number) {
            this.surname = surname;
            this.name = name;
            this.number = number;
        }

        public Reader(String surname, String name, String patronymic, int number) {
            this (surname, name, number);
            this.patronymic = patronymic;
        }

        public Reader(String surname, String name, String patronymic, int number, String faculty, int phone, Date birthDate) {
            this (surname, name, patronymic, number);
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
            System.out.print( reader.surname + reader.name + " взял(а) " + reader.books.size() + " книг(у/и): ");
            for (Book book : reader.books) {
                System.out.print(book.getName() + ", ");
            }
            System.out.println();
        }

        public void PrintStatus() {
            PrintStatus(this);
        }

        public static void takeBook(Reader reader, Book book) {
            if (book.getName().isEmpty()) {
                System.out.println("Не введено название книги");
            } else if (reader.books.size() == 10) {
                System.out.println("Читатель не может взять больше книг");
            } else {
                reader.books.add(book);
                System.out.println(reader.surname + reader.name + " взял(а) книгу " + book.getName());
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
                for (int i = 0; i < reader.books.size(); i++) {
                    if (reader.books.get(i).getName().equals(title)) {
                        reader.books.remove(i);
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

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            if (number <= 0) {
                System.out.println("Номер читательского билета введен неверно");
            } else {
                this.number = number;
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