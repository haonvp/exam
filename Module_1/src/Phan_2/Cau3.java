package Phan_2;

import java.util.Scanner;

/*
Viết một chương trình tính tiền vé xe bus theo số chuyến đi của người dùng. Cấu trúc giá vé như sau:
•	Mỗi chuyến đi có giá 10.000 VNĐ.
•	Nếu người dùng đi trên 5 chuyến, áp dụng giảm giá 10%.
•	Nếu đi trên 10 chuyến, áp dụng giảm giá 20%.
Chương trình cần nhập vào số chuyến đi và in ra số tiền phải trả sau khi áp dụng giảm giá.
Yêu cầu:
1.	Nhập vào số chuyến đi.
2.	Áp dụng giảm giá nếu số chuyến đi vượt qua các mức quy định.
3.	In ra số tiền phải trả.
 */
public class Cau3 {
    public static int priceBus(int times) {
        int priceTotal = 10000;
        int discount = 0;
        if (times > 5 && times <= 10) {
            discount = priceTotal * 10 / 100;
            priceTotal = (priceTotal * times) - discount;
        } else if (times > 10) {
            discount = priceTotal * 20 / 100;
            priceTotal = (priceTotal * times) - discount;
        } else {
            priceTotal *= times;
        }
        return priceTotal;
    }

    public static void main(String[] args) {
        System.out.println("Nhập số chuyến đi xe bus: ");
        int times = new Scanner(System.in).nextInt();
        System.out.println("Số tiền phải trả sau khi áp dụng giảm giá: " + priceBus(times) + "VNĐ");
    }
}
