package Phan_3;
/*
Câu 1
Viết chương trình nhận một chuỗi từ người dùng và in ra chuỗi đó theo chiều đảo ngược.
Hãy sử dụng StringBuilder hoặc StringBuffer để thực hiện thao tác này.
•	Nhập vào một chuỗi.
•	Sử dụng StringBuilder hoặc StringBuffer để đảo ngược chuỗi và in kết quả.
*/

import java.util.Scanner;

public class Cau1 {
    public static String reverseString(String ch) {
        StringBuilder reverserAfter = new StringBuilder();
        for (int i = ch.length() - 1; i >= 0; i--) {
            reverserAfter.append(ch.charAt(i));
        }
        return reverserAfter.toString();
    }

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        String ch = new Scanner(System.in).nextLine();
        System.out.println("Chuỗi sau khi đảo ngược: " + reverseString(ch));
    }
}
