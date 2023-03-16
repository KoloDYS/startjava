public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = 'm';
        wolf.name = "Cliff";
        wolf.weight = 40;
        wolf.age = 5;
        wolf.color = "gray";

        System.out.println("Пол волка: " + wolf.sex);
        System.out.println("Кличка волка: " + wolf.name);
        System.out.println("Вес волка: " + wolf.weight);
        System.out.println("Возраст волка: " + wolf.age);
        System.out.println("Цвет окраски волка: " + wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}