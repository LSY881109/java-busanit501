package d250609.ch4;

public class GetterSetterExMain {
    public static void main(String[] args) {
        GetterSetterEx getterSetterEx = new GetterSetterEx("이상용", "lsy@naver.com", "1234");
        // public, 외부에서 직접 데이터에 접근.
        getterSetterEx.name = "직접 접근해서 이름 수정 이상용"; // 직접 접근해서, 임의로 수정함.
        // private , 데이터 직접 접근을 막는다.
        // getterSetterEx.email = "lsy@naver.com 수정";
        // getterSetterEx.password = "password 수정";
        getterSetterEx.showInfo();

    }
}
