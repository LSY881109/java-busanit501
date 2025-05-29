package ch2;

public class Hello2 {
    // 메소드1
    public static int sum(int n, int m) {
        return n + m;
    }

    // 메소드2
    public static int mul(int n, int m) {
        return n * m;
    }

    public static void main(String[] args) {
        int result = sum(100, 200);
        System.out.println("sum 이라는 함수 이용해서 결과 출력 : " + result);
        // 퀴즈1 ,
        // 정적 메소드 하나 만들어서, 곱하기 기능이고,
        // result2 에 담아서, 출력해보기
        //
        // 메소드2 사용하기
        int result2 = mul(10, 20);
        System.out.println("mul 이라는 함수 이용해서 결과 출력 : " + result2);

        // 퀴즈2,
        // 정적 메소드 하나 만들어서, 빼기 기능이고,
        // result3 에 담아서, 출력해보기
    }
}
