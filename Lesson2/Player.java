import java.util.Scanner;

public class Player {
    private String name;
    private int num = 0;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public Player() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        this.name = scan.next();
    }

    @Override
    public String toString() {
        return this.name;
    }
}