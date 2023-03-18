import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        GuessNumber game = new GuessNumber(player1,player2);
        do {
            game.guessNumber();
            System.out.print("Хотите продолжить игру? [yes/no]:\n");
            answer = scanner.next();
            while (!answer.equals("yes") & !answer.equals("no")) {
                System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
                answer = scanner.nextLine();
            }
        } while (answer.equals("yes"));
    }
}