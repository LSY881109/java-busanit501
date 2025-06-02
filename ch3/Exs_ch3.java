package ch3;

public class Exs_ch3 {
    // ex3-1
    // 기본 for 이용해서, 1~10까지 의 합을 구하는 내용인데.
    // 입력값에 원하는 숫자를 입력시, 1~n까지의 합을 구하는 메소드로 변경
    public static int getSum(int n) {
        int sum = 0;
        // 기본 for 문 , 문법을 확인.
        // 1) int i = 1; 초깃값 , 2) i <= 10; 조건식, 3) i++ 증감식
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
