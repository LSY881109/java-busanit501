package ch3;

import java.util.Scanner;

public class Exs_ch3_Main {
    public static void main(String[] args) {
        // 공용으로 사용할 스캐너
        Scanner scanner = new Scanner(System.in);

        // Ex3-2 퀴즈 , 예시 확인.
        int count = Exs_ch3.ex3_2_quiz(scanner);
        System.out.println("입력한 문자 개수: " + count);
        System.out.println("============================");

        // Ex3-2 , 예시 확인.
        // Exs_ch3.ex3_2(scanner);
        System.out.println("============================");

        // Ex3-1 , 예시 확인.
        // int result_ex3_1 = Exs_ch3.getSum(10); // 55
        // System.out.println("Ex3-1: 1~10까지의 합 = " + result_ex3_1);

        scanner.close(); // 스캐너 자원 반납
    }
}
