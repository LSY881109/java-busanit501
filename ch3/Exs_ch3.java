package ch3;

import java.util.Scanner;

public class Exs_ch3 {

    // ex3-2 , while 문 이용해서, 예,
    // 0이 입력이 되면 while 문종료, 입력한 숫자들의 합을 구하기. '
    // 숫자의 합은 콘솔에 입력해서, 스캐너 이용해서 입력하기.
    public static void ex3_2(Scanner scanner) {
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sum = 0;
        int input;

        System.out.println("숫자를 입력하세요 (0을 입력하면 종료): ");
        while (true) {
            // scanner.nextInt(); -> 콘솔에 숫자 하나 입력후, 공백을 기준으로 다음 숫자를 읽기
            input = scanner.nextInt();
            if (input == 0) {
                break; // 0이 입력되면 while 문 종료
            }
            sum += input; // 입력한 숫자를 합산
        }
        System.out.println("입력한 숫자의 합은: " + sum);
        // scanner.close(); // 스캐너 자원 반납
    }

    // 퀴즈
    // 사용자로 부터 문자를 입력을 받아, q가 나올때 가지 문자의 개수를 세는 프로그램을 작성하세요.
    //

    // ex3-1
    // 기본 for 이용해서, 1~10까지 의 합을 구하는 내용인데.
    // 입력값에 원하는 숫자를 입력시, 1~n까지의 합을 구하는 메소드로 변경
    public static int getSum(int n) {
        int sum = 0;
        // 기본 for 문 , 문법을 확인.
        // 1) int i = 1; 초깃값 , 2) i <= 10; 조건식, 3) i++ 증감식
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i); // i 값 확인용
            sum += i;
            System.out.println("sum = " + sum); // sum 값 확인용
        }
        return sum;
    }
}
