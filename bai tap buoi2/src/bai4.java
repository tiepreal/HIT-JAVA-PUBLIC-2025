import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 5 so nguyen: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1);
            arr[i] = sc.nextInt();

        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];

        }
        System.out.println("Tong cac phan tu: "+sum);
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat: "+max);
    }
}
