package util.random;

public class RandomUtilMain {
    // 메인 메소드가 있는 클래스, 실행용 클래스
    public static void main(String[] args) {
        System.out.println("Math.random()를 사용하여 생성된 난수: " + RandomUtil.generateRandom());
        System.out.println("1이상 45 이하 사이의 랜덤 정수: " + RandomUtil.generateRandomInRange(1, 45));
        // 랜덤한 숫자를 생성하는 기능.
        // 퀴즈1
        // 로또 번호를 생성하는 기능을 만들기.
        // 아직 배열 안배워서, 각각의 6자리 숫자를 따로 받아서,
        // 출력만 한번에 생성하는 기능으로,
        // 정적 메소드를 만들어서, 출력 문장에서, 랜덤 숫자 6개 보여주기 형식으로 하기.
        // 출력문 모양: 이상용의 자동 로또 번호 생성기 사용한 번호 : 1, 20 ,30, 11, 17 ,45
        // 조건문을 활용해서, 중복된 숫자가 발생 안하게끔 , 해보기
    }
}
