package Phan_3;
/*
Viết chương trình nhập vào một chuỗi từ người dùng và kiểm tra xem chuỗi đó có phải là chuỗi Palindrome (chuỗi đối xứng) hay không.
Sử dụng StringBuilder
Yêu cầu:
        1.	Nhập vào một chuỗi.
        2.	Kiểm tra nếu chuỗi đó là Palindrome (đối xứng).
        3.	In ra kết quả: "Chuỗi là Palindrome" hoặc "Chuỗi không phải là Palindrome".
*/

import java.util.Scanner;

public class Cau3 {
    public static boolean checkPalindrome(String str) {
        StringBuilder strReverse = new StringBuilder();
        String cleanStr = str.replace(" ", "").toLowerCase();
        for (int i = cleanStr.length() - 1; i >= 0; i--) {
            strReverse.append(cleanStr.charAt(i));
        }
        return strReverse.toString().equals(cleanStr);
    }

    public static void main(String[] args) {
        System.out.println("Nhập vào một chuỗi: ");
        String str = new Scanner(System.in).nextLine();
        if (checkPalindrome(str)) {
            System.out.println("Chuỗi là Palindrome");
        } else {
            System.out.println("Chuỗi không phải là Palindrome");
        }
    }
}
