package util.random;

public class RandomUtil {
    // 설계 클래스
    public static double generateRandom() {
        double randomValue = Math.random();
        return randomValue;
    }

    // min : 1, max : 10 , 1<= randomValue <= 10, 랜덤 정수 뽑기 기능
    public static int generateRandomInRange(int min, int max) {
        int randomValue = (int) (Math.random() * (max - min + 1)) + min;
        return randomValue;
    }
}
