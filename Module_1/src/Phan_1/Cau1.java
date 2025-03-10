package Phan_1;

import java.util.Scanner;

/*

Viết chương trình nhập vào hai số nguyên từ người dùng và tính tổng của chúng. Sau đó in ra kết quả.
Yêu cầu:
1.	Nhập vào hai số nguyên từ bàn phím.
2.	In ra kết quả tổng của hai số.

*/
public class Cau1 {
    public static void nhap() {
        System.out.println("Nhập số nguyên thứ 1: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Nhập số nguyện thứ 2: ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("Tổng 2 số: " + (num1 + num2));
    }

    public static void main(String[] args) {
        nhap();
    }
}
