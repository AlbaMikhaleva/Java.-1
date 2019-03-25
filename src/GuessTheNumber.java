import java.util.Scanner;

public class GuessTheNumber {
    // Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается
    // 3 попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное
    // пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится
    // запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


    public static void main(String[] args) {

        do play();
        while (repeat() == 1);
        System.out.println("До новых встреч!");
    }


    public static void play() {
        int hiddenNumber = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        boolean win = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите число от 0 до 9: ");
            int yourNumber = sc.nextInt();
            if (yourNumber == hiddenNumber) {
                win = true;
                break;
            } else if (yourNumber > hiddenNumber)
                System.out.println("Ваше число больше");
            else if (yourNumber < hiddenNumber)
                System.out.println("Ваше число меньше");
        }
        if (win == true) {
            System.out.println("Вы выиграли. Поздравляем!");
        } else {
            System.out.println("Вы проиграли.");
        }
    }

    public static int repeat() {
        int repeatGame;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatGame = sc.nextInt();
        }
        while ((repeatGame != 1) && (repeatGame != 0));
        return repeatGame;
    }
}

