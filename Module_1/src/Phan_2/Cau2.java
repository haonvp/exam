package Phan_2;

import java.util.Scanner;

/*

Viết chương trình nhập vào một số nguyên từ 1 đến 7 đại diện cho một ngày trong tuần và in ra tên của ngày đó
(1 - "Chủ nhật", 2 - "Thứ hai", ..., 7 - "Thứ bảy"). Chương trình phải sử dụng cấu trúc switch-case để thực hiện.
1.	Nhập vào số nguyên từ 1 đến 7.
2.	Dùng switch-case để in ra tên của ngày tuần tương ứng.

 */
public class Cau2 {
    public static void dayNumber() {
        System.out.println("Nhập vào số nguyên: ");
        int numb = new Scanner(System.in).nextInt();
        switch (numb) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ hai");
            case 3:
                System.out.println("Thứ ba");
            case 4:
                System.out.println("Thứ tư");
            case 5:
                System.out.println("Thứ năm");
            case 6:
                System.out.println("Thứ sáu");
            case 7:
                System.out.println("Thứ bảy");
            default:
                break;
        }

    }

    public static void main(String[] args) {
        dayNumber();
    }
}
