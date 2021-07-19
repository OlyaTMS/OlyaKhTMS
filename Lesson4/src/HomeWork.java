import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        ameba();
        summ();
        printTriangle();
        count(100);
        array();
        mass();
        massiv();
        maxEl(new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2});
        equalsElements();
        printMatrix();
    }


    //        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public static void ameba() {
        int a = 1;
        for (int h = 1; h <= 24; h++) {
            if (h % 3 == 0) {
                a = a * 2;
                System.out.print(a + " ");
            }
        }
        System.out.println("");
    }

    //        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    public static void summ() {
        int summ = 0;
        int a = 3;
        int b = 10;
        for (int i = 0; i < b; i++) {
            summ += a;
        }
        System.out.println(summ);
    }


    //        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

    public static void printTriangle() {
        int[][] triangle = new int[4][4];
        for (int n = 0; n < 4; n++) {
            if (n == 0) {
                for (int i = 0; i < triangle.length; i++) {
                    for (int j = 0; j < triangle.length; j++) {
                        if ((i + j) >= triangle.length - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println("");
                }
            }
            if (n == 1) {
                for (int i = 0; i < triangle.length; i++) {
                    for (int j = 0; j < triangle.length; j++) {
                        if (i > j) {
                            System.out.print("  ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                }
            }
            if (n == 2) {
                for (int i = 0; i < triangle.length; i++) {
                    for (int j = 0; j < triangle.length; j++) {
                        if (i >= j) {
                            System.out.print("* ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
            } else if (n == 3) {
                for (int i = 0; i < triangle.length; i++) {
                    for (int j = 0; j < triangle.length; j++) {
                        if ((i + j) < triangle.length) {
                            System.out.print("* ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
            }
        }
    }

//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    public static void count(int number) {
        System.out.println("Введите число: " + number);
        int n = String.valueOf(Math.abs(number)).length();
        if (number == 0) {
            System.out.println("Вы ввели ноль, количество цифр = " + n);
        } else if (number > 0) {
            System.out.println(number + " - это положительное число, количество цифр = " + n);
        } else {
            System.out.println(number + " - это отрицательное число, количество цифр = " + n);
        }
    }

//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    public static void array() {
        int[] mass = new int[50];
        for (int i = 1; i < 50; i++) {
            mass[i] = i * 2 + 1;
        }
        System.out.println(Arrays.toString(mass));
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + ", ");
        }
        System.out.println("");
    }

    //        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void mass() {
        int[] mass = new int[12];
        int max = mass[0];
        int ind = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 15);
            if (mass[i] >= max) {
                max = mass[i];
                ind = i;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Максимальный элемент " + max + ", индекс его последнего вхождения в массив = " + ind);
    }

    //        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    public static void massiv() {
        int[] massiv = new int[20];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(massiv));
        for (int i = 0; i < massiv.length; i++) {
            if (i % 2 != 0) {
                massiv[i] = 0;
            }
        }
        System.out.println(Arrays.toString(massiv));
    }


//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    public static void maxEl(int[] ints) {
        int max = ints[0];
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
                index = i;
            }
        }
        ints[index] = ints[0];
        ints[0] = max;
        System.out.println(Arrays.toString(ints));
    }

    //        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void equalsElements() {
        int[] mass = {1, 13, 6, 1, 2, 13, 46};
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        int length = mass.length;
        boolean flag = true;
        List<Integer> result = new ArrayList<>();
        for (int i = 0, j = i + 1; i < length && j < length; i++, j++) {
            if (mass[i] == mass[j] && flag) {
                result.add(mass[i]);
                flag = false;
            } else {
                flag = true;
            }
        }
        if (!result.isEmpty()) {
            System.out.print("Массив имеет повторяющиеся элементы ");
            System.out.println(result);
        } else {
            System.out.println("Массив не имеет повторяющихся элементов");
        }
    }

    //        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 20);
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int[][] array2 = new int[n][n];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                array2[j][i] = array[i][j];
                System.out.printf("%5d", array2[j][i]);
            }
            System.out.println();
        }
    }
}