import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.nextLine();
        System.out.println(names);
        String olds = sc.nextLine();
        System.out.println(olds);
        String highs = sc.nextLine();
        System.out.println(highs);
        System.out.println("Xin chao " + names + " ban " + olds + " tuoi va cao " + highs + " met");
    }
}
