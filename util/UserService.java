package util;

import java.util.Scanner;

public class UserService {
    // 회원 가입 기능, 정적 메소드 생성.
    // 콘솔로 입력을 받고, 결과를 문자열로 반환하는 기능을 포함.
    // 추후 업그레이드는 반환 타입을 : 문자열에서, 사용자 클래스 객체로 변경 예정.
    // 메인 메소드가 없음, 왜냐하면, 실행을 여기서 안함.
    // 이런 클래스를 , 설계용 클래스.
    public static void registerUser() {
        System.out.println("이상용 홈피 회원가입");
        // 순서1, Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 순서2, 이름 입력 받기
        System.out.println("이름 입력해주세요 > ");
        String name = scanner.nextLine(); // 이름 입력 받기
        // 순서3, 이메일 입력 받기
        System.out.println("이메일 입력해주세요 > ");
        String email = scanner.nextLine(); // 이메일 입력 받기
        // 순서4, 패스워드 입력 받기
        System.out.println("패스워드 입력해주세요 > ");
        String password = scanner.nextLine(); // 패스워드 입력 받기

        // 순서5, 입력 받은 내용 출력
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("패스워드 : " + password);
        System.out.println("회원 가입 완료되었습니다.");

        // 순서6, scanner 닫기
        scanner.close(); // Scanner 객체를 사용한 후에는 반드시 닫아줘야 함. 리소스 누수 방지
    }
}
