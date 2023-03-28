package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger();

        robot1.setMark("Mark-3");
        robot1.setOrigin("USA");
        robot1.setHeight(260);
        robot1.setSpeed(7);
        robot1.setArmor(6);

        Jaeger robot2 = new Jaeger("Mark-5", "Australia", 250, 10, 9);
        System.out.println("Сравнение марок двух роботов: " +
                robot1.getMark() + " и " +  robot2.getMark());

        System.out.println("Скорость 1-го и 2-го роботов соответственно: " +
                robot1.getSpeed() + " и " + robot2.getSpeed());

        robot1.increaseSpeed();
        robot2.decreaseSpeed();
        System.out.println("После изменения скоростей: " + robot1.getSpeed() + " и " +
                 robot2.getSpeed());

        System.out.println("Состояние брони: ");
        System.out.println("У робота №1: ");
        robot1.takeArmor();
        System.out.println("У робота №2: ");
        robot2.removeArmor();
        System.out.println("Изменено: ");
        System.out.println("У робота №2: ");
        robot2.takeArmor();

        robot1.setArmor(9);
        System.out.println("Значение брони у 1 робота после изменения: " + robot1.getArmor());

        if (robot1.getArmor() == robot2.getArmor()) {
            System.out.println("Значение брони у обоих роботов равно " + robot2.getArmor());
        } else {
            System.out.println("Значения роботов расходятся на: " +
                    (robot1.getArmor() - robot2.getArmor()));
        }
    }
}