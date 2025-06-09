package d250609.ch4;

public class GetterSetterEx {
    public String name;
    private String email;
    private String password;

    // 매개변수가 3개인 생성자
    public GetterSetterEx(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("패스워드 : " + password);
    }

    // Getter : 데이터를 가져오는 역할.
    // Setter : 데이터를 쓰는 역할.
    // 접근 지정자를 : private 이용시,
    // 왜? private 접근 지정자를 사용하나요? 외부에서 해당 데이터에 직접 접근을 막기 위해서,
    // 캡슐화, 데이터 은닉, 숨기기. -> 왜? 숨기지? 왜냐하면, 해당 인스턴스 직접 값을 변경하게 되면,
    // 불변성 또는 데이터 일관성등이 깨지는 확률이 생김. 실수할 확률이 발생함.

}
