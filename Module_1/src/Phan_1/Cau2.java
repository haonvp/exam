package Phan_1;

/*

Viết một chương trình tính diện tích của một hình tròn từ bán kính nhập vào từ người dùng. Sau đó, in ra kết quả và kiểm tra xem diện tích có phải là số
chẵn hay số lẻ. Sử dụng các phép toán với kiểu dữ liệu double và int để tính diện tích.
Yêu cầu:
1.	Nhập vào bán kính hình tròn.
2.	Tính diện tích hình tròn.
3.	Kiểm tra diện tích là chẵn hay lẻ và in kết quả.

 */
public class Cau2 {
    public static double areaOfCircle(double radius) {
        return 3.14 * (radius * radius);
    }

    public static void checkEvenOdd(double area) {
        if ((int) area % 2 == 0) {
            System.out.println("Diện tích là chẵn");
        } else {
            System.out.println("Diện tích là lẻ");
        }
    }

    public static void main(String[] args) {
        double area = areaOfCircle(1);
        System.out.println("Diện tích hình tròng: " + area);

        checkEvenOdd(area);
    }
}
