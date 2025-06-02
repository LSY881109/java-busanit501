package ch3;

import java.util.Scanner;

public class Exs_ch3_2_user_array_doc {
    // 회원 관리 프로그램 버전2, 저장소: 임시 메모리(배열) 이용할 예정.
    // 배열 주의 사항) 1) 고정 길이 , 2) 크기 변경 불가, 3) 같은 타입 사용.
    // 조건), 1) 회원 수는 100명 이하, 2) 회원 정보는 이름, 이메일, 패스워드, 등록일로 구성.
    // 회원 정보 CRUD , 추가, 조회, 수정, 삭제 기능 구현.

    static final int MAX_USERS = 100; // 최대 회원 수
    // 이름, 이메일, 패스워드, 등록일을 저장할 배열 선언
    static String[] names = new String[MAX_USERS];
    static String[] emails = new String[MAX_USERS];
    static String[] passwords = new String[MAX_USERS];
    static String[] registrationDates = new String[MAX_USERS];
    static int userCount = 0; // 현재 등록된 회원 수

    // 회원 추가 메서드
    public static void addUser(Scanner scanner) {
        if (userCount < MAX_USERS) {
            System.out.println("이름을 입력하세요: ");
            String name = scanner.nextLine();
            System.out.println("이메일을 입력하세요: ");
            String email = scanner.nextLine();
            System.out.println("패스워드를 입력하세요: ");
            String password = scanner.nextLine();
            String registrationDate = util.date.DateUtil.getCurrentDateTime(); // 현재 날짜와 시간
            userCount++;
            System.out.println("회원이 추가되었습니다: " + name + ", " + email + ", " + registrationDate);
        } else {
            System.out.println("회원 수가 최대치를 초과했습니다.");
        }
    }
}
