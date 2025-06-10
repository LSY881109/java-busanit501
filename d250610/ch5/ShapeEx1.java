package d250610.ch5;

public class ShapeEx1 {
    private String kind;
    private String name;

    public void draw() {
        System.out.println("도형 그리기 기능");
    }

    // 기본 생성자는 안만들어줌. (매개변수 생성자가 있는 경우, )
    // 직접 만들기.
    public ShapeEx1() {
    }

    // 생성자 오버로딩. -> 메소드 오버로딩,
    // 오버로딩 -? 저그 이야기 -> 짐을 더 추가.
    // 여기서 의미는 , 생성자의 모양을 똑같지만, 매개변수의 모양, 갯수가 다른 것.
    // 생성자 만들지 여부,
    public ShapeEx1(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    // 게터/세터 여부,
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 실무, 세터 보다는 변경하는 메소드를 만들어서 수정하고,
    // 직접 수정을 안함. 불변성 유지하기 위해서, -> 리액트 다시 언급.,
    // 서버 사이드 렌더링 작업 중. 웹 1차 작업 위한 개별 학습 중.

    // showInfo 여부.
    public void showInfo() {
        System.out.println("종류 : " + kind);
        System.out.println("이름 : " + name);
    }

}
