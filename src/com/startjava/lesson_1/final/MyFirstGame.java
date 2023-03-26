package com.startjava.lesson_1;

import java.util.Scanner;
import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        // Random random = new Random();
        // Player player1 = new Player();
        // Player player2 = new Player();


        // System.out.println("Игра “Угадай число”");
        // int num = random.nextInt(1,100);
        // int playerNum = 51;
        // while (playerNum != num) {
        //     if (playerNum > num) {
        //         System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
        //         playerNum--;
        //     } else {
        //         System.out.println("Число " + playerNum + " меньше того, что загад компьютер");
        //         playerNum++;
        //     }
        // }
        // System.out.println("Вы победили! Загаданное число: " + num);
    }
}

// class Player {
//     private String name;

//     public Player(Sting name) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Введите имя первого игрока:");
//         this.name = scan.nextLine();
//     }
// }

// class GuessNumber {
//     private Player player1;
//     private Player player2;

//     public void guessNumber(){
//         System.out.println("Игра “Угадай число”");
//         int num = 1 + (int) (Math.random() * 100);
//         int playerNum = 51;
//         while (playerNum != num) {
//             if (playerNum > num) {
//                 System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
//                 playerNum--;
//             } else {
//                 System.out.println("Число " + playerNum + " меньше того, что загад компьютер");
//                 playerNum++;
//             }
//         }
//         System.out.println("Вы победили! Загаданное число: " + num);
// }
//     public GuessNumber(Player player1, Player player2) {
//         this.player1 = player1;
//         this.player2 = player2;
//     }
