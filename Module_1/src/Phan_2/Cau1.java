package Phan_2;

import java.util.Scanner;

/*

Viết chương trình nhập vào một số nguyên từ người dùng và kiểm tra số đó là số chẵn hay số lẻ.
Chương trình cần in ra kết quả phù hợp. Hãy sử dụng cấu trúc điều kiện if-else để giải quyết.
Yêu cầu:
1.	Nhập một số nguyên từ bàn phím.
2.	Nếu số là chẵn, in ra "Số chẵn".
3.	Nếu số là lẻ, in ra "Số lẻ".

 */
public class Cau1 {
    public static void checkEvenOdd() {
        System.out.println("Nhập vào một số nguyên: ");
        int num = new Scanner(System.in).nextInt();
        if (num % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd();
    }
}
