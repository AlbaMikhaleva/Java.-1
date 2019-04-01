package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameXO {
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '*';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Игрок победил!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья, не осталось места ходить!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья, не осталось места ходить!");
                break;
            }
        }


    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
//        if (map[x][y] == DOT_EMPTY){
//            return true;
//        }
//        return false;
    }

    public static boolean checkWin(char symbol) {
//       Все что смогла придумать :)
        char[] win = new char[DOTS_TO_WIN];
        char[] line1 = new char[DOTS_TO_WIN];
        char[] line2 = new char[DOTS_TO_WIN];
        char[] line3 = new char[DOTS_TO_WIN];
        char[] line4 = new char[DOTS_TO_WIN];
        char[] line5 = new char[DOTS_TO_WIN];
        char[] line6 = new char[DOTS_TO_WIN];
        char[] line7 = new char[DOTS_TO_WIN];
        char[] line8 = new char[DOTS_TO_WIN];

        for (int i = 0; i < DOTS_TO_WIN; i++) {
            win[i] = symbol;
//                строки
                line1[i] = map[0][i];
                line2[i] = map[1][i];
                line3[i] = map[2][i];
//               столбцы
                line4[i] = map[i][0];
                line5[i] = map[i][1];
                line6[i] = map[i][2];
//               диагонали
                line7[i] = map[i][i];
                line8[i] = map[i][DOTS_TO_WIN - i - 1];
            }
        if (Arrays.equals(line1,win)) return true;
        if (Arrays.equals(line2,win)) return true;
        if (Arrays.equals(line3,win)) return true;
        if (Arrays.equals(line4,win)) return true;
        if (Arrays.equals(line5,win)) return true;
        if (Arrays.equals(line6,win)) return true;
        if (Arrays.equals(line7,win)) return true;
        if (Arrays.equals(line8,win)) return true;

        else return false;

//        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
//        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
//        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;
//
//       if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
//        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
//        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
//        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
//       if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;
    }

    public static boolean isFull() {
        int k = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    k++;
                }
            }
        }
        return k == 0;
    }
}
