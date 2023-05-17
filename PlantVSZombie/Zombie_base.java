import java.util.Scanner;

public class Zombie_base {
    private Backyard yard;
    private int x;
    private int y;
    Scanner scn = new Scanner(System.in);
    public void input(){
        System.out.println("Put zombie at");
        System.out.printf("X: ");
        int ori_x = scn.nextInt();
        x = ori_x;
        System.out.printf("Y: ");
        int ori_y = scn.nextInt();
        y = ori_y;
        yard.input(x, y);
    }
}
