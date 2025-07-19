public class bai5 {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong cua so 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        int tongChan = 0;
        for (int i = 2; i <= 100; i += 2) {
            tongChan += i;
        }
        System.out.println("Tong cac so chan tu 1 đen 100 (dung for): " + tongChan);

        int tongChan2 = 0;
        int j = 2;
        while (j <= 100) {
            tongChan2 += j;
            j += 2;
        }
        System.out.println("Tong cac so chan tu 1 đen 100 (dung while): " + tongChan2);
    }
}
