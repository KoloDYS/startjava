public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”");
        int num = 73;
        int playerNum = 51;
        while (playerNum != num) {
            if (playerNum > num) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загад компьютер");
                playerNum++;
            }
        }
        System.out.println("Вы победили! Загаданное число: " + num);
    }
}