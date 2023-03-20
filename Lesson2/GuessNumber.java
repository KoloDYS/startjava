import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessNumber() {
        Random random = new Random();
        int num = random.nextInt(1, 101);
        Scanner scan = new Scanner(System.in);
        System.out.println("Игра “Угадай число”");
        while (true) {
            System.out.println("Ход игрока " + player1);
            System.out.println("Введите число от 1 до 100");
            player1.setNum(scan.nextInt());
            if (player1.getNum() == num) {
                System.out.println("Игрок " + player1 + " победил. Число = " + num);
                break;
            }
            if (player1.getNum() > num) {
                System.out.println("Число " + player1.getNum() +
                        " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getNum() +
                        " меньше того, что загадал компьютер");
            }

            System.out.println("Ход переходит к игроку " + player2);
            System.out.println("Введите число от 1 до 100");
            player2.setNum(scan.nextInt());
            if (player2.getNum() == num) {
                System.out.println("Игрок " + player2 + " победил. Число = " + num);
                break;
            }
            if (player2.getNum() > num) {
                System.out.println("Число " + player2.getNum() +
                        " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player2.getNum() +
                        " меньше того, что загадал компьютер");
            }
        }
    }
}