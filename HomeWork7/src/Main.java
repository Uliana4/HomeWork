import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    //Строки 1
    public static void StringBuild() {
        StringBuilder strB = new StringBuilder();
        int fNumber = 3;
        int sNumber = 56;
        strB.append(fNumber + " + " + sNumber + " = " + (fNumber + sNumber));
        strB.append("\n");
        strB.append(fNumber + " - " + sNumber + " = " + (fNumber - sNumber));
        strB.append("\n");
        strB.append(fNumber + " * " + sNumber + " = " + (fNumber * sNumber));
        strB.append("\n");
        System.out.println(strB.toString());

        while (strB.indexOf("=") != -1) {
            int index = strB.indexOf("=");
            strB.replace(index, index + 1, "равно");
        }
        System.out.println(strB.toString());
    }

    //Строки 2
    public static void RegularPattern1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ссылку");
        String str = sc.nextLine();

        Pattern pattern = Pattern.compile("\\S*\\.com");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //Строки 3
    public static void RegularPattern2() {
        String text = "ahb acb aeb aeeb adcb axeb";
        System.out.printf("Изначальная строка: " + text + "\n");

        Pattern regex = Pattern.compile("[a].[b]");
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //Строки. Задание 4
    public static void RegularPattern3() {
        String text = "ab abab abab abababab abea";
        System.out.printf("Изначальная строка: " + text + "\n");

        Pattern regex = Pattern.compile("(ab)+");
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //Строки. Задание 5
    public static void RegularPattern4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату : Год-Месяц-День)");
        String text = scanner.nextLine();

        Pattern regex = Pattern.compile("(1\\d{3}|20[0-1][0-2])-([0][1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|30)");
        Matcher matcher = regex.matcher(text);

        if (matcher.find()) {
            System.out.println("Дата " + text + " - существует");
        } else {
            System.out.println("Даты " + text + " - не существует");
        }
    }

    //Исключения
    public static void CatchException() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ФИО:");
            String fio = scanner.nextLine();
            System.out.println("Введите возраст:");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age < 0 || age > 100) {
                throw new IncorrectInfoException("Введены некорректные данные!", fio, age);
            }

            Pattern regex = Pattern.compile("\\p{Punct}");
            Matcher matcher = regex.matcher(fio);
            if (fio.length() > 200 || matcher.find()) {
                throw new IncorrectInfoException("Введены некорректные данные!", fio, age);
            }
        }
        catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }



    public static void main(String[] args) {
        StringBuild(); //Строки. Задание 1
        RegularPattern1(); //Строки. Задание 2
        RegularPattern2(); //Строки. Задание 3
        RegularPattern3(); //Строки. Задание 4
        RegularPattern4(); //Строки. Задание 5
        CatchException(); //Исключения
    }
}