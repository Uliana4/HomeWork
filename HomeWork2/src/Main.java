import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Массивы обязательное задание 1
        {
            int max = 99;
            int min = 10;
            int arrMax = 0;
            int[] array = new int[5];


            for (int i = 0; i < array.length-1; i++) {
                array[i] = (int) ((Math.random() * (max - min)) + min);
                System.out.print(array[i] + " ");
                if (array[i+1] > array[i]) {
                    arrMax++;
                }
            }

            if (arrMax == array.length-1){
                System.out.println("- массив является строго возрастающей последовательностью");
            } else {
                System.out.println("- массив Не является строго возрастающей последовательностью");
            }
        }

        //Массивы обязательное задание 2
        {
            Scanner scanner = new Scanner(System.in);
            int arrayl, min, max;

            do {
                System.out.println("Введите размер массива:");
                arrayl = scanner.nextInt();
            } while (arrayl <= 0);

            do {
                System.out.println("Введите нижнюю границу:");
                min = scanner.nextInt();
                System.out.println("Введите верхнюю границу:");
                max = scanner.nextInt();
            } while (min > max);

            int[] array = new int[arrayl];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) ((Math.random() * (max - min)) + min);
            }

            System.out.print("Массив: ");

            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //Массивы обязательное задание 3
        {
            Scanner scanner = new Scanner(System.in);
            int N, A, B;

            do {
                System.out.println("Введите размер массива:");
                N = scanner.nextInt();
            } while (N <= 0);

            do {
                System.out.println("Введите нижнюю границу:");
                A = scanner.nextInt();
                System.out.println("Введите верхнюю границу:");
                B = scanner.nextInt();
            } while (A > B);

            int[] array = new int[N];
            int iMax = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) ((Math.random() * (B - A)) + A);
                if (array[i] > array[iMax]) {
                    iMax = i;
                }
            }

            System.out.print("Массив: ");
            for (int i : array) {
                System.out.print(i + " ");
            }

            System.out.println();
            System.out.println("Индекс наибольшего значения: " + iMax + "; Наибольшее значение = " + array[iMax]);
        }

        //Массивы обязательное задание 4
        {
            Scanner scanner = new Scanner(System.in);
            int N, A, B;

            do {
                System.out.println("Введите размер массива:");
                N = scanner.nextInt();
            } while (N <= 0);

            do {
                System.out.println("Введите нижнюю границу:");
                A = scanner.nextInt();
                System.out.println("Введите верхнюю границу:");
                B = scanner.nextInt();
            } while (A > B);

            int[] array = new int[N];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) ((Math.random() * (B - A)) + A);
            }

            System.out.print("Массив: ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int a = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = a;
                    }
                }
            }

            System.out.print("Отсортированные элементы массива: ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //Строки обязательное задание 1
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String stroka = scanner.nextLine();
            char[] strokaArr = stroka.toCharArray();
            System.out.println("Введите символ: ");
            String simbol = scanner.nextLine();
            char[] simbolArr = simbol.toCharArray();
            int a = 0;
            for (char i : strokaArr) {
                if (i == simbolArr[0]) {
                    a++;
                }
            }
            System.out.println("Cимвол " + simbolArr[0] + " " + a + " раз встречается в строке ");
        }

        //Строки обязательное задание 2
        {
            System.out.println();
            Scanner scr = new Scanner(System.in);

            System.out.print("Введите строку символов: ");
            String stroka = scr.nextLine();
            char[] strokaArr = stroka.toCharArray();
            System.out.print("Введите символ А: ");
            String a = scr.nextLine();
            char[] aArray = a.toCharArray();
            System.out.print("Bведите символ В: ");
            String b = scr.nextLine();
            char[] bArray = b.toCharArray();

            while (stroka.isEmpty() || a.isEmpty() || b.isEmpty() ) {

                if (stroka.isEmpty()) {
                    System.out.print("Повторите ввод строки символов: ");
                    stroka = scr.nextLine();
                } else if (a.isEmpty()) {
                    System.out.print("Повторите ввод символа А: ");
                    a = scr.nextLine();
                } else if (b.isEmpty()) {
                    System.out.print("Повторите ввод символа В: ");
                    b = scr.nextLine();
                } else break;
            }

            System.out.print("Новая строка: ");
            
            for (char i : strokaArr) {
                if (i == aArray[0]) {
                    System.out.print(bArray[0]);
                }else {
                    System.out.print(i);
                }
            }
        }
    }
}