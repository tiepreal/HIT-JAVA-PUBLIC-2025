import java.util.Random;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int tongDung = a + b;
        boolean Dung = random.nextBoolean();
        int c;
        if (Dung) {
            c = tongDung;
        } else {
            do {
                c = random.nextInt(201);
            } while (c == tongDung);
        }


        System.out.println("Phep toan: " + a + " + " + b + " = " + c);
        System.out.print("Nhap vao 'phep tinh dung' hoac 'phep tinh sai': ");
        String traLoi = scanner.nextLine().trim().toLowerCase();

        boolean nguoiDungChonDung = traLoi.equals("phep tinh dung");
        if (nguoiDungChonDung == Dung) {
            System.out.println("Ban da tra loi dung.");
        } else {
            System.out.println("Ban da tra loi sai.");
        }
    }
}
