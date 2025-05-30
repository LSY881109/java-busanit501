package user_mini_project;

import java.util.Scanner;

import util.UserService;

public class MainClass {
    public static void main(String[] args) {
        // 공용으로 사용할 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        // 무한 루프이고, 메인 메뉴를 출력하는 부분
        // 반복문 안에서, 리턴등으로 나오지 않는 이상, 계속 출력이 됨.
        while (true) {
            System.out.println("========================================================");
            System.out.println("회원 관리 시스템에 오신 것을 환영합니다. 배운거 복습 적용해보기");
            System.out.println("1. 회원 가입  2.로그인   0.종료");
            System.out.println("========================================================");
            System.out.println("메뉴 번호를 선택해주세요 (0~2): ");
            // 사용자가 입력한 번호를 문자열 형태로 받기
            String choice = scanner.nextLine();
            // 첫번째, if 형태의 조건문
            if (choice.equals("1")) {
                // 회원 가입 기능 호출
                UserService.registerUser(scanner);
            } else if (choice.equals("2")) {
                // 로그인 기능 호출
                UserService.loginUser(scanner);
            } else if (choice.equals("0")) {
                // 프로그램 종료
                System.out.println("프로그램을 종료합니다. 감사합니다!");
                scanner.close(); // 스캐너 자원 반납
                return; // while 루프 종료
            } else {
                // 잘못된 입력 처리
                System.out.println("잘못된 입력입니다. 0, 1, 2 중에서 선택해주세요.");
            }
            // 두번째, switch 형태의 조건문
        }
    }
}
