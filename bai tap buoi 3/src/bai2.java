import java.util.Scanner;

public class bai2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap chuoi: ");
            String input = scanner.nextLine();
            Kiemtra(input);
        }

        public static void Kiemtra(String str) {
            if (chuoidoixung(str)) {
                System.out.println(str.toUpperCase());
                System.out.println("Chuoi nay la chuoi đoi xung.");
            } else {
                System.out.println(str.toLowerCase());
                System.out.println("Chuoi nay khong phai la chuoi đoi xung.");
            }
        }

        public static boolean chuoidoixung(String str) {
            String dao = daonguoc(str);
            return str.equalsIgnoreCase(dao);
        }

        public static String daonguoc(String str) {
            return new StringBuilder(str).reverse().toString();
        }
    }
