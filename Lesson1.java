import java.rmi.AlreadyBoundException;
import java.sql.SQLOutput;

public class Lesson1 {

    public static void main(String[] args) {

//        byte b = 25;
//        short s = -12548;
//        int i = 15235494;
//        long l = -8456846546589L;
//        float f = 2.45542F;
//        double d = -2.245782145648;
//        char c = 2017;
//        boolean bo = true;

        System.out.println(exercise3(5, 7, 11, 6));
        System.out.println(exercise4(1, 2));
        exercise5(1845);
        System.out.println(exercise6(-697));
        exercise7("Андрей!");
        exercise8(1900);
    }

    public static double exercise3(double a, double b, double c, double d) {
        double result = a * (b + (c / d));
        return result;
    }

    public static boolean exercise4(int x, int y) {
        int sum = x + y;
        if ((sum >= 10) && (sum <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void exercise5(int z) {
        if (z >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean exercise6(int z1) {
        if (z1 < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void exercise7(String name) {
        System.out.println("Привет, " + name);
    }

    public static void exercise8(int year) {
        if (((year%4 == 0) || (year%400 == 0)) &&(year%100 != 0)){
            System.out.println("Год високосный");
        } else{
            System.out.println("Год НЕ високосный");
        }
    }
}