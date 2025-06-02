package ch3;

import java.util.Scanner;

public class Exs_ch3 {

    public static void ex3_3() {
        char a = 'a';
        do {
            System.out.print(a);
            // char 타입의 a -> int 변환시 , 값: 97, 유니코드 값 : 97
            a = (char) (a + 1); // a+1 는 int 타입으로 계산되므로, char로 변환
        } while (a <= 'z');
    }

    // 퀴즈
    // 사용자로 부터 문자를 입력을 받아, q가 나올때 까지 문자의 개수를 세는 프로그램을 작성하세요.
    //
    public static int ex3_2_quiz(Scanner scanner) {
        String total = ""; // 입력된 총 문자열 수

        while (true) {
            System.out.println("문자를 입력하세요 (다음 문장에 q를 입력하면 종료): ");
            String input = scanner.nextLine(); // 한 줄 입력 받기
            total += input; // 입력된 문자열을 누적
            System.out.println("계속 입력하려면 아무키나 입력하고, 종료시에 q를 입력하세요.");
            String command = scanner.nextLine(); // 다음 명령어 입력 받기
            if (command.equals("q")) { // 대소문자 구분 없이 q 입력시 종료
                break; // while 문 종료
            }
        }
        int count = total.length(); // 입력된 문자열의 길이(문자 개수)
        return count;
    }

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
