package util;

import java.util.Scanner;

public class UserService {

    public static void registerUser(Scanner scanner) {

        System.out.println("이상용 홈피 회원가입");
        System.out.println("이름 입력해주세요 > ");
        String name = scanner.nextLine(); // 이름 입력 받기
        System.out.println("이메일 입력해주세요 > ");
        String email = scanner.nextLine(); // 이메일 입력 받기
        System.out.println("패스워드 입력해주세요 > ");
        String password = scanner.nextLine(); // 패스워드 입력 받기

        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("패스워드 : " + password);
        System.out.println("회원 가입 완료되었습니다.");

    }

    public static void loginUser(Scanner scanner) { //

        System.out.println("이상용 홈피 로그인");
        System.out.println("이메일 입력해주세요 > ");
        String email = scanner.nextLine(); // 이메일 입력 받기
        System.out.println("패스워드 입력해주세요 > ");
        String password = scanner.nextLine(); // 패스워드 입력 받기

        System.out.println("로그인 이메일 정보 : " + email);
        System.out.println("로그인 패스워드 정보 : " + password);
        System.out.println("로그인 완료되었습니다. 현재 임시로 단순 출력용입니다.");
    }
}
