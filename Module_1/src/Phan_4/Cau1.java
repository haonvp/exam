package Phan_4;

import java.util.Arrays;
import java.util.Scanner;

/*

Viết chương trình nhập vào một mảng số nguyên từ người dùng và tìm ra giá trị lớn nhất và giá trị nhỏ nhất trong mảng. In ra các giá trị này.
Yêu cầu:
1.	Nhập vào số lượng phần tử mảng.
2.	Nhập các phần tử mảng/
3.	Tìm giá trị lớn nhất và giá trị nhỏ nhất và in ra kết quả.
4.	Tính tổng các phần tử của mảng
5.	Thêm 1 phần tử vào mảng với vị trí do người dùng nhập, nếu mảng không đủ ô nhớ sẽ tự động tăng thêm 100% ô nhớ hiện tại.
6.	Cho người dùng nhập vào 1 phần tử, xóa đi tất cả các phần tử đó trong mảng
7.	Tìm phần tử lớn thứ 3 trong mảng

*/
public class Cau1 {
    public static void maxMin(int number[]) {
        int maxNumb = number[0];
        int tempNumb = 0;
        int minNumb = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > maxNumb) {
                maxNumb = number[i];
            }
        }
        for (int i = 1; i < number.length; i++) {
            if (number[i] < minNumb) {
                minNumb = number[i];
            }
        }
        System.out.println("3. Giá trị lớn nhất: " + maxNumb + " - nhỏ nhất: " + minNumb);
    }

    public static void totalNumber(int number[]) {
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }
        System.out.println("4. Tổng các phần tử của mảng: " + total);
    }

    public static int[] insertItem(int number[]) {
        System.out.print("5. Nhập vị trí muốn thêm phần tử: ");
        int pos = new Scanner(System.in).nextInt();
        System.out.print("Nhập phần tử muốn thêm: ");
        int valNum = new Scanner(System.in).nextInt();

        int[] newArr = Arrays.copyOf(number, number.length + 1);

        for (int i = newArr.length - 2; i >= pos; i--) {
            newArr[i + 1] = newArr[i];
        }
        newArr[pos] = valNum;
        System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(newArr));
        return newArr;
    }

    public static int[] deleteItem(int number[]) {
        System.out.print("6. Nhập phần tử cần xóa: ");
        int valNumb = new Scanner(System.in).nextInt();
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (valNumb != number[i]) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] != valNumb) {
                newArr[j++] = number[i];
            }
        }
        System.out.println("Mảng sau khi xóa phần tử " + valNumb + ": " + Arrays.toString(newArr));
        return newArr;
    }

    public static void maxThrid(int number[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > first) {
                third = second;
                second = first;
                first = number[i];
            } else if (number[i] > second && number[i] != first) {
                third = second;
                second = number[i];
            } else if (number[i] > third && number[i] != second && number[i] != first) {
                third = number[i];
            }
        }
        System.out.println("7. Phần tử lớn thứ ba trong mảng là: " + third);
    }

    public static void main(String[] args) {
        System.out.print("1. Nhập số lượng phần tử mảng: ");
        int n = new Scanner(System.in).nextInt();

        int[] number = new int[n];
        System.out.println("2. Nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            number[i] = new Scanner(System.in).nextInt();
        }

        maxMin(number);
        totalNumber(number);
        number = insertItem(number);
        number = deleteItem(number);
        maxThrid(number);
    }
}
