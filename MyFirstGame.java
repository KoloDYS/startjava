public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”");
        int num = 73;
        int playerNum = 51;
        while (playerNum != num) {
            if (num - playerNum == 3 || playerNum - num == 3 ||
                    playerNum - num == 1 || num - playerNum == 2){
                while (playerNum != num) {
                    if (playerNum > num) {
                        System.out.println("Число " + playerNum +
                                " больше того, что загадал компьютер");
                        playerNum -= 1;
                    } else {
                        System.out.println("Число " + playerNum +
                                " меньше того, что загад компьютер");
                        playerNum += 1;
                    }
                }
            } else if (playerNum > num) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum -= 4;
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum += 4;
            }
        }
        System.out.println("Вы победили! Загаданное число: " + num);
    }
}