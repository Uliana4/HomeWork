public class Main {
    public static void main(String[] args) {
        //Операторы обязательное задание 1
        {
            int n = 16;
            if (n % 2 == 1) {
                System.out.println("Нечетное число");
            } else {
                System.out.println("Четное число");
            }
        }

        //Операторы обязательное задание 2.1
        {
            int day = -1;
            System.out.println("День номер:" + day);
            if (day == 1) {
                System.out.println("Понедельник");
            } else if (day == 2) {
                System.out.println("Вторник");
            } else if (day == 3) {
                System.out.println("Среда");
            } else if (day == 4) {
                System.out.println("Четверг");
            } else if (day == 5) {
                System.out.println("Пятница");
            } else if (day == 6) {
                System.out.println("Суббота");
            } else if (day == 7) {
                System.out.println("Воскресенье");
            } else if (day < 1 || day > 7) {
                System.out.println("Дня номер" + " " + day + " " + "нет");
            }
        }

        //Операторы обязательное задание 2.2
        {
            int numberOfTheDay = 0;
            System.out.println("Заданный день имеет номер:" + numberOfTheDay);
            switch (numberOfTheDay) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Дня номер" + " " + numberOfTheDay + " " + "нет");
            }
        }

        //Операторы обязательное задание 3
        {
            int a = 3;
            int b = 1;
            int c = 14;
            System.out.println("Даны числа:" + ' ' + "a=" + a + ' ' + "b=" + b + ' ' + "c=" + c);
            if (a > b && b > c) {
                System.out.println("Сумма двух наибольших чисел = " + (a + b));
            } else if (a > b && b < c) {
                System.out.println("Сумма двух наибольших чисел = " + (a + c));
            } else if (b > a && c > b) {
                System.out.println("Сумма двух наибольших чисел = " + (b + c));
            } else if (a == b) {
                System.out.println("Сумма двух наибольших чисел = " + (2 * a));
            } else if (b == c) {
                System.out.println("Сумма двух наибольших чисел = " + (2 * b));
            } else if (a == c) {
                System.out.println("Сумма двух наибольших чисел = " + (2 * c));
            }
        }

        //Операторы обязательное задание 4
        {
            int year = 1804;
            if (year % 4 == 0 && !(year % 400 == 0 && year % 100 != 0)) {
                System.out.println("В" + " " + year + " году " + 366 + " дней");
            } else {
                System.out.println("В" + " " + year + "году" + 365 + "дней");
            }
        }

        //Циклы обязательное задание 1
        {
            int n = 1;
            while (n <= 10) {
                System.out.println("Task" + n);
                n++;
            }
        }

        //Циклы обязательное задание 2
        {
            int n = 1;
            do {
                if (n % 5 == 0) {
                    System.out.println(n);
                }
                n++;
            } while (n <= 100);
        }

        //Циклы обязательное задание 3
        {
            int factorial = 1;
            for (int i = 1; i <= 10; i++) {
                factorial *= i;
            }
            System.out.println("Факториал числа " + " равен " + factorial);
        }

        //Циклы обязательное задание 4
        {
            int A = 12;
            int B = 25;
            int N = 0;
            System.out.println("A = " + A + " " + "B =" + B);
            for (int i = B - 1; i > A; i--) {
                System.out.println(i);
                N += 1;
            }
            System.out.println("Количество чисел между А и В = " + " " + N);
        }
    }
}