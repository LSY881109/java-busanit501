package d250613.web_structure.ui;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import d250613.member_project.model.Member;

public class _4SignupFrame extends JFrame {
    // =============================================================
    // 추가1

    // 파일 불러오는 경로를 전역으로 설정.
    private static final String FILE_NAME = "member.txt"; // 회원 정보 저장 파일명, csv 형식
    // 파일에서 불러온 멤버의 모든 정보를 담아둘 임시 공간 리스트
    private ArrayList<Member> members = new ArrayList<>();

    // Swing 관련 변수
    // 전체 흐름
    // 테이블 구성 -> DefaultTableModel 에 데이터 입력 -> JTable 이 모델을 받아 화면에 테이블로 출력
    // 테이블에서 수정, 추가, 삭제, 검색하거나 tableModel 갱싱됨.
    private DefaultTableModel tableModel; // Swing에서 테이블 데이터를 저장/관리하는 기본 모델 클래스
    private JTable memberTable; // Swing에서 표 형태(UI) 의 테이블 컴포넌트

    // 검색 관련 컴포넌트
    private JTextField searchField; // 검색어를 입력할수 있는 검색어 입력창. 선언만, 전역으로 사용가능.
    private JButton searchBtn; // 검색 버튼
    private JButton resetBtn; // 검색 초기화 버튼
    // =============================================================

    public _4SignupFrame() {
        setTitle("회원 가입");
        setSize(400, 200);
        setLocationRelativeTo(null); // 화면에 중앙 배치.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 안내 문구 표시
        JLabel label = new JLabel("여기는 회원 가입 화면입니다.", JLabel.CENTER);
        add(label);
        setVisible(true);

    }

}
