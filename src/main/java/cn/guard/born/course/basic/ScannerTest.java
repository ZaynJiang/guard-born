package cn.guard.born.course.basic;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            System.out.println("输入的值为：" + scanner.nextLine());
        }
        scanner.close();
    }

}
