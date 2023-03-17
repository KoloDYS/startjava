import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        boolean isNext;
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        GuessNumber game = new GuessNumber(player1,player2);
        do {
            game.guessNumber();
            System.out.print("Хотите продолжить игру? [yes/no]:\n");
            do {
                String answer = scanner.next();
                if (answer.equals("no")) {
                    isContinue = false;
                    isNext = false;
                } else if (answer.equals("yes")) {
                    isNext = false;
                } else {
                    System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
                    isNext = true;
                };
            } while (isNext);
        } while (isContinue);
    }
}