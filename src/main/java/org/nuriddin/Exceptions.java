package org.nuriddin;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * User:t.me/supermatematikuz
 * Date:13.02.2024 17:19
 */
public class Exceptions {
    public static void main(String[] args) {
//        System.out.println("Yoshingizni kiriting");
//        int age = 0;
//        try {
//            age = (new Scanner(System.in)).nextInt();
//            System.out.println(age);
//        } catch (InputMismatchException e) {
//            System.out.println("Qaytadan kirit");
//            age = (new Scanner(System.in)).nextInt();
//        }

        try {
            int a = (new Scanner(System.in)).nextInt();
            int b = (new Scanner(System.in)).nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("0 ga bolish mumkun emas");
        } catch (InputMismatchException e) {
            System.out.println("Son kiritilmadi");
        } finally {
            System.out.println("Bu albatta chiqadi");
        }




    }
}
