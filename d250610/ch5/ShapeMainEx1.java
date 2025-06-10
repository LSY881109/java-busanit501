package d250610.ch5;

public class ShapeMainEx1 {
    public static void main(String[] args) {
        // 기본 인스턴스 생성.
        CircleEx1 circleEx1 = new CircleEx1();
        circleEx1.draw();
        RectangleEx1 rectangleEx1 = new RectangleEx1();
        rectangleEx1.draw();

        // 질문, 부모클래스를 상속을 받은 상태이고,
        // 부모 클래스에도 , 메소드 : draw() 있고,
        // 자식 클래스에도 , 메소드 : draw() 있고,
        // 현재, circleEx1, 타입이 : 본인 타입 :CircleEx1
        // draw 사용시, -> 누구꺼 사용했니? 부모? 자식? , 정답 : 자식 본인꺼 사용.

        // 다형성 이용해서, 부모 타입으로 받는 모양,
        // (부모 타입) (인스턴스 변수 명) = new 자식클래스명();
        // (인스턴스 변수 명) 의 타입? -> 정답 : 부모 타입.
        // (인스턴스 변수 명) 으로 메소드 , draw() 사용시 누구꺼 사용하나요?
        // 정답 ? 부모? 자식?

    }
}
