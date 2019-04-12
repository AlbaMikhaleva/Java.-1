package XOGame;

public class Main {
    public static void main(String[] args) {
        XOGame.initMap();
        XOGame.printMap();
        new XOGame();
//        while (true) {
            XOGame.humanTurn();
//            printMap();
//            if (checkWin(DOT_X)) {
//                System.out.println("Игрок победил!!!");
//                break;
//            }
//            if (isFull()) {
//                System.out.println("Ничья, не осталось места ходить!");
//                break;
//            }
//
//            aiTurn();
//            printMap();
//            if (checkWin(DOT_O)) {
//                System.out.println("Компьютер победил!!!");
//                break;
//            }
//            if (isFull()) {
//                System.out.println("Ничья, не осталось места ходить!");
//                break;
//            }
//        }
    }
}
