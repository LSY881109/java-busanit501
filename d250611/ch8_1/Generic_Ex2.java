package d250611.ch8_1;

public class Generic_Ex2<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Generic_Ex2<String> boxString = new Generic_Ex2<>();
        boxString.set("이상용");
        String resultStr1 = boxString.get();
        System.out.println("제너릭으로 타입을 설정한 클래스의 인스턴스를 생성 후, 정보 가져오기");
        System.out.println(" 값 : " + resultStr1);
    }

}
