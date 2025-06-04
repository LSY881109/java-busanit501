package ch3;

import java.util.Scanner;

public class Mini_quiz2_Func {
    // -- 퀴즈1,
    // -- 사용자로부터 정수 5개를 입력받아 배열에 저장하고 역순 출력
    public static void quiz1(Scanner scanner) {
        // 사용자로부터 정수 5개를 입력받아 배열에 저장하고
        int[] numbers = new int[5]; // 빈 배열

        System.out.println("정수 5개를 입력하세요:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // 예시) 1 2 3 4 5 , 공백을 기준으로 입력.
        }

        System.out.println("역순 출력:");
        // 정방향 출력, : numbers[0] ~ numbers[4]
        // 역순 출력, : numbers[4] ~ numbers[0]
        // numbers.length : 배열의 길이, 전체 크기 5
        // numbers.length - 1 : 마지막 인덱스 4
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }

    // -- 퀴즈2,
    // -- 3x3 배열을 만들어 모든 요소에 1~9 채우고 출력

    // -- 퀴즈3,
    // -- 문자열 배열을 메서드로 받아 가장 긴 문자열을 반환
}
