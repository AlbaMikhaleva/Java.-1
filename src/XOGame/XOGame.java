package XOGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class XOGame extends JFrame {
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;
    public static Object actionPerformed;

    int[] coordinates = new int[2];
    int x, y;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '*';

    static char[][] map;
    static Random random = new Random();

    JButton[] btns;

    public XOGame() {
        setBounds(300, 200, 600, 600);
        setTitle("XOGame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 72);
        btns = new JButton[SIZE * SIZE];
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(SIZE, SIZE));
//        coordinates = new int[2];
        for (int i = 0; i < SIZE * SIZE; i++) {
            btns[i] = new JButton("");
            btns[i].setFont(font);
            final int temp = i;
            btns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btns[temp].setText("" + DOT_X);
                    int x = temp % SIZE;
                    int y = temp / SIZE;
                    System.out.println(x + " " + y);
                    coordinates[0] = x;
                    coordinates[1] = y;
                }

            });

            panel.add(btns[i]);
        }

        add(panel);
        setVisible(true);

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

    public static void humanTurn(int coordX, int coordY) {

        do {
            x = coordX;
            y = coordY;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;//!!!!!
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[x][y] == DOT_EMPTY;
    }
}
