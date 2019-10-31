package com.company;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    int num;
    void input() {
        System.out.print("Nhập vào số muốn kiểm tra: ");
        this.num = scanner.nextInt();
    }
    boolean checkPrimary(int num) {
        if(num < 2) {
            return false;
        } else {
            int i = 2;
            while(i < num) {
                if(num % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    void display(boolean check) {
        if(check) {
            System.out.printf("%d là số nguyên tố", this.num);
        } else {
            System.out.printf("%d không phải là số nguyên tố", this.num);
        }
    }
    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        m.input();
        m.display(m.checkPrimary(m.num));
    }
}
