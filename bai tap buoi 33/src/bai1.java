import java.util.Scanner;

public class bai1 {
    public static final String SHAPE_SQUARE = "Square";
    public static final String SHAPE_TRIANGLE = "Triangle";
    public static final String SHAPE_CIRCLE = "Circle";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap  hinh (Square, Triangle, Circle): ");
        String type = scanner.nextLine();
        double area = tinhdtich(type, scanner);
        if (area >= 0) {
            System.out.printf("Dien tich cua vien gach là: %.2f\n", area);
        } else {
            System.out.println("Hinh dang khong hop le!");
        }
    }

    public static double tinhdtich(String type, Scanner scanner) {
        switch (type) {
            case SHAPE_SQUARE:
                return dtichhvuong(scanner);
            case SHAPE_TRIANGLE:
                return dtichtamgiac(scanner);
            case SHAPE_CIRCLE:
                return dtichhinhtron(scanner);
            default:
                return -1;
        }
    }

    public static double dtichhvuong(Scanner scanner) {
        System.out.print("Nhap canh hinh vuong: ");
        double canh = scanner.nextDouble();
        return canh * canh;
    }

    public static double dtichtamgiac(Scanner scanner) {
        System.out.print("Nhap đay cua tam giac: ");
        double day = scanner.nextDouble();
        System.out.print("Nhap chieu cao cua tam giac: ");
        double cao = scanner.nextDouble();
        return 0.5 * day * cao;
    }

    public static double dtichhinhtron(Scanner scanner) {
        System.out.print("Nhap ban kinh hinh tron: ");
        double bkinh = scanner.nextDouble();
        return Math.PI * bkinh * bkinh;
    }
}
