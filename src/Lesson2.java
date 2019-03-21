public class Lesson2 {
    public static void main(String[] args) {
        replacement();
        fill();
        multiply2();
        diagonal1();
        minmax();
        System.out.println(balance());
    }
    //    1.Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void replacement() {
        int[] a = {1, 0, 1, 1, 0, 0, 1, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //    2.Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fill() {
        int[] b = new int[8];
        for (int i = 0; i < 8; i++) {
            b[i] = i * 3;
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    //    3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void multiply2() {
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (
                int i = 0;
                i < c.length; i++) {
            if (c[i] < 6) {
                c[i] *= 2;
            }
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }

    //    4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void diagonal1() {
        int[][] d = new int[4][4];
        for (
                int i = 0;
                i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == j) || (i + j == 3)) {
                    d[i][j] = 1;
                }
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
//** 5.Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    public static void minmax() {
        int[] a = {5, 8, 40, 100, 22, 67, 3};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int min = max;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] < min) {
                min= a[i];
            }
        }
        System.out.println("Максимальный = " + max + ", минимальный = " + min);
    }

    //** 6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.
    public static boolean balance() {
        int[] a = {2, 2, 2, 1, 2, 2, 12, 1};
        int sumAll = 0;
        int sumLeft = 0;
        int sumRight = 0;
        int j = 0;
        // ищу сумму всех элементов массива и делю ее на 2
        for (int i = 0; i < a.length; i++) {
            sumAll += a[i];
        }
        int sumHalf = sumAll / 2;
        //считаю сумму элементов до тех пор, пока она не будет >= sumHalf и переменной j присваиваю номер ячейки,
        // на которой цикл прервался
        for (int i = 0; i < a.length; i++) {
            sumLeft += a[i];
            j = i;
            if (sumLeft >= sumHalf) break;
        }
        //начинаю считать правую сторону массива с ячейки под номером j+1
        for (int i = j + 1; i < a.length; i++) {
            sumRight += a[i];
        }
        //сравниваю суммы, которые получились слева и справа
        if (sumLeft == sumRight)
            return true;
        else return false; //получилось как-то сложно:) И, наверное, надо было циклы по методам раскидать...
    }

}



