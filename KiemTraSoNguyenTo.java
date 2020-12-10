import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiểm tra số nguyên tố");
        System.out.print("Nhập số: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("Không phải là só nguyên tố");
        } else {
            System.out.println(number + " là só nguyên tố");
        }
    }
}

